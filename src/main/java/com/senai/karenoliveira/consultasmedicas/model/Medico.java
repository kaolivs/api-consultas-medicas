package com.senai.karenoliveira.consultasmedicas.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Medico {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String especialidade;
    private String crm;

    @OneToMany(mappedBy = "medico")
    private List<Consulta> consultas;

    // Getters e setters
}
