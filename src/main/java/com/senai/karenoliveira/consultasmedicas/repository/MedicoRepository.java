package com.senai.karenoliveira.consultasmedicas.repository;

import com.senai.karenoliveira.consultasmedicas.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {}
