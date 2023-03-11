
package com.companycz.videojuegos.service;

import com.companycz.videojuegos.domain.Videojuego;
import com.companycz.videojuegos.repository.VideojuegoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class VideoJuegoService {
    
    private final VideojuegoRepository videojuegoRepository;

    public VideoJuegoService(VideojuegoRepository videojuegoRepository) {
        this.videojuegoRepository = videojuegoRepository;
    }
    
    
    public List<Videojuego> buscarDestacados(){

        return videojuegoRepository.findAll();
    }
}
