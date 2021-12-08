package br.com.solucaomobile.ediaristas.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.solucaomobile.ediaristas.models.Diarista;

public interface DiaristaRepository extends JpaRepository<Diarista, Long> {
    
}
