package org.springframework.quoters.controlador;

import org.springframework.quoters.QuoteRepository;
import org.springframework.quoters.modelo.*;
import org.springframework.quoters.repositorio.PolizaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/polizas")
public class PolizaController {


    private final PolizaRepository repository;

    public PolizaController(PolizaRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api")//uri = identificador de recursos uniformes para usar un método según la ruta
    public List<Poliza> getAll(){

        return repository.findAll()
                .stream()
                .map(poliza -> new Poliza())
                .collect((Collectors.toList()));


    }


    /*@GetMapping("/fechaInicial/{fechaInicio}/fechaFinal/{fechaFin}")
    public List<Poliza> getPolizaRango(@PathVariable Date fechaInicio, @PathVariable Date fechaFin){
        HashMap
        return null;
    }*/

}
