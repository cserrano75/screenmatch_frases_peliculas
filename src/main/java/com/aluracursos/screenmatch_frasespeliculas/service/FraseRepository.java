package com.aluracursos.screenmatch_frasespeliculas.service;

import com.aluracursos.screenmatch_frasespeliculas.dto.FraseDTO;
import com.aluracursos.screenmatch_frasespeliculas.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frase,Long> {
    @Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")
    public Frase obtenerFraseAleatoria();

}
