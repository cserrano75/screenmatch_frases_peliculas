package com.aluracursos.screenmatch_frasespeliculas.service;

import com.aluracursos.screenmatch_frasespeliculas.dto.FraseDTO;
import com.aluracursos.screenmatch_frasespeliculas.model.Frase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repository;

    public FraseDTO obtenerFraseAleatoria() {
        Frase frase = repository.obtenerFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonaje(), frase.getPoster());
    }
}
