package com.companycz.videojuegos.repository;

import com.companycz.videojuegos.domain.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer>{
    
}
