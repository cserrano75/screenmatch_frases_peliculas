package com.aluracursos.screenmatch_frasespeliculas.controller;

import com.aluracursos.screenmatch_frasespeliculas.dto.FraseDTO;
import com.aluracursos.screenmatch_frasespeliculas.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {
    @Autowired
    FraseService servicio;
    @GetMapping("/series/frases")
    public FraseDTO obtenerFraseAleatoria(){
        return servicio.obtenerFraseAleatoria();
    }
}
