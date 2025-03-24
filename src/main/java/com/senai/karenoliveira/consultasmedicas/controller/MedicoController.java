package com.senai.karenoliveira.consultasmedicas.controller;

import com.senai.karenoliveira.consultasmedicas.model.Medico;
import com.senai.karenoliveira.consultasmedicas.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @GetMapping
    public List<Medico> listar() {
        return medicoRepository.findAll();
    }

    @PostMapping
    public Medico criar(@RequestBody Medico medico) {
        return medicoRepository.save(medico);
    }

    @PutMapping("/{id}")
    public Medico atualizar(@PathVariable Long id, @RequestBody Medico medico) {
        medico.setId(id);
        return medicoRepository.save(medico);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        medicoRepository.deleteById(id);
    }
}
