package com.nuxx.savings_app.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "metas")
public class Meta
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @Column(nullable = false)
    private String nombre;

    private String descripcion;

    @Column(nullable = false)
    private Double importeObjetivo;

    @Column(nullable = false)
    private Double importeActual;

    @Column(nullable = false)
    private LocalDateTime fechaInicio;

    @Column(nullable = false)
    private LocalDateTime fechaFin;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoMetas estado;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private MetodoAhorro metodoAhorro;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String configuracion;
}
