package com.senai.karenoliveira.consultasmedicas.repository;

import com.senai.karenoliveira.consultasmedicas.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {}
