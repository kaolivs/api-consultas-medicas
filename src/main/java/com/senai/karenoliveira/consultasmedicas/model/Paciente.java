package com.senai.karenoliveira.consultasmedicas.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Paciente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String telefone;

    @OneToMany(mappedBy = "paciente")
    private List<Consulta> consultas;

    // Getters e setters
}
