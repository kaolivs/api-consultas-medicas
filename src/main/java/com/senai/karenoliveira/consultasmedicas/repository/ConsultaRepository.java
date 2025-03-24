package com.senai.karenoliveira.consultasmedicas.repository;

import com.senai.karenoliveira.consultasmedicas.model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalTime;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    boolean existsByPacienteIdAndDataAndHorario(Long pacienteId, LocalDate data, LocalTime horario);
}
