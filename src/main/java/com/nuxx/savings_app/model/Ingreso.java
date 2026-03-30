package com.nuxx.savings_app.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "ingresos")

public class Ingreso
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CategoriaIngreso categoria;

    @Column(nullable = false)
    private String nombre;

    private String descripcion;

    @Column(nullable = false)
    private LocalDateTime fecha;

    @Column(nullable = false)
    private Double importeBruto;

    private Double porcentajeRetencion;

    @Column(nullable = false)
    private Double importeNeto;
}
