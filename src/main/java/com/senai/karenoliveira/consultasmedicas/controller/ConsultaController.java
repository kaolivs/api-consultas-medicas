package com.senai.karenoliveira.consultasmedicas.controller;

import com.senai.karenoliveira.consultasmedicas.model.Consulta;
import com.senai.karenoliveira.consultasmedicas.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    @Autowired
    private ConsultaService consultaService;

    @PostMapping("/agendar")
    public Consulta agendar(@RequestBody Consulta consulta) {
        return consultaService.agendar(consulta);
    }

    @PutMapping("/cancelar/{id}")
    public Consulta cancelar(@PathVariable Long id) {
        return consultaService.cancelar(id);
    }

    @GetMapping
    public List<Consulta> listar() {
        return consultaService.listarTodas();
    }
}
