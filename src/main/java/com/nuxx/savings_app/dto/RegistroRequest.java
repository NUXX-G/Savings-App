package com.nuxx.savings_app.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RegistroRequest
{
    private String nombre;
    private String email;
    private String password;
}
