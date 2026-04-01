package com.nuxx.savings_app.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.util.Date;

@Service
public class JwtService
{
    private static final String SECRET_KEY = "MhgAwdV2rawGJLWbsVUaimHGB7fKWRxyzABCDEFGHIJKLMN";
    private static final long EXPIRATION = 86400000;

    public String generarToken(String email)
    {
        return Jwts.builder()
                .subject(email)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + EXPIRATION))
                .signWith(getSecretKey())
                .compact();
    }

    public String extraerEmail(String token)
    {
        return getClaims(token).getSubject();
    }

    public boolean tokenValido(String token, String email)
    {
        return extraerEmail(token).equals(email) && !tokenExpirado(token);
    }

    private boolean tokenExpirado(String token)
    {
        return getClaims(token).getExpiration().before(new Date());
    }

    private Claims getClaims(String token)
    {
        return Jwts.parser()
                .verifyWith(getSecretKey())
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }

    private SecretKey getSecretKey()
    {
        byte[] bytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(bytes);
    }
}
