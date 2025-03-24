package com.senai.karenoliveira.consultasmedicas.service;

import com.senai.karenoliveira.consultasmedicas.model.Consulta;
import com.senai.karenoliveira.consultasmedicas.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultaService {

    @Autowired
    private ConsultaRepository consultaRepository;

    public Consulta agendar(Consulta consulta) {
        boolean existe = consultaRepository.existsByPacienteIdAndDataAndHorario(
                consulta.getPaciente().getId(),
                consulta.getData(),
                consulta.getHorario()
        );

        if (existe) {
            throw new RuntimeException("Paciente já possui consulta agendada neste horário.");
        }

        consulta.setStatus("AGENDADA");
        return consultaRepository.save(consulta);
    }

    public Consulta cancelar(Long id) {
        Optional<Consulta> consulta = consultaRepository.findById(id);
        if (consulta.isPresent()) {
            Consulta c = consulta.get();
            c.setStatus("CANCELADA");
            return consultaRepository.save(c);
        }
        throw new RuntimeException("Consulta não encontrada.");
    }

    public List<Consulta> listarTodas() {
        return consultaRepository.findAll();
    }
}
