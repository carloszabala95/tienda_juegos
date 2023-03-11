
package com.companycz.videojuegos.controller;

import com.companycz.videojuegos.domain.Videojuego;
import com.companycz.videojuegos.service.VideoJuegoService;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListadoController {
    private final VideoJuegoService videojuegoService; 

    public ListadoController(VideoJuegoService videojuegoService) {
        this.videojuegoService = videojuegoService;
    }
    
    
    @RequestMapping("/")
    public String listaVideoJuegos(Model model){
        //busqueda de videojuegos
        List<Videojuego>destacados=videojuegoService.buscarDestacados();
        model.addAttribute("videojuegos", destacados);
        return "listado";
    }
}
