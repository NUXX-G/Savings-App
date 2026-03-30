package com.nuxx.savings_app.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="gastos")
public class Gasto
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CategoriaGasto categoria;

    @Column(nullable = false)
    private LocalDateTime fecha;

    @Column(nullable = false)
    private double importe;

    @Column(nullable = false)
    private String nombre;

    private  String descripcion;
}
