package com.senai.karenoliveira.consultasmedicas.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Consulta {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate data;
    private LocalTime horario;

    @ManyToOne
    private Medico medico;

    @ManyToOne
    private Paciente paciente;

    private String status; // AGENDADA, CANCELADA, REALIZADA

    // Getters e setters
}
