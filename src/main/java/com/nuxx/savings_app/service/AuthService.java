package com.nuxx.savings_app.service;

import com.nuxx.savings_app.dto.AuthResponse;
import com.nuxx.savings_app.dto.RegistroRequest;
import com.nuxx.savings_app.model.Usuario;
import com.nuxx.savings_app.repository.UsuarioRepository;
import com.nuxx.savings_app.security.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class AuthService
{
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtService jwtService;

    public AuthResponse registro(RegistroRequest request)
    {
        if (usuarioRepository.findByEmail(request.getEmail()).isPresent())
        {
            throw new RuntimeException("El email ya está registrado");
        }

        Usuario usuario = new Usuario();
        usuario.setNombre(request.getNombre());
        usuario.setEmail(request.getEmail());
        usuario.setPassword(passwordEncoder.encode(request.getPassword()));
        usuario.setFechaRegistro(LocalDateTime.now());
        usuarioRepository.save(usuario);

        String token = jwtService.generarToken(usuario.getEmail());

        return new AuthResponse(token);
    }
}
