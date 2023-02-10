package org.springframework.polizas.controlador;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.polizas.modelo.*;
import org.springframework.polizas.repositorio.PolizaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class PolizaController {

    private final PolizaRepository repository;

    public PolizaController(PolizaRepository repository) {
        this.repository = repository;
    }

    //Método para listar todas las polizas
    @GetMapping("/polizas")
    public List<Poliza> listarPolizas(){

        return repository.findAll()
                .stream()
                .map(poliza -> new Poliza(poliza.getIdPoliza(),
                        poliza.getFechaPoliza(),
                        poliza.getCoberturasPoliza(),
                        poliza.getValorMaximoPoliza(),
                        poliza.getNombrePlanPoliza(),
                        poliza.getPlacaAuto(),
                        poliza.getModeloAuto(),
                        poliza.isInspeccionAuto(),
                        poliza.getIdCliente(),
                        poliza.getNombreCliente(),
                        poliza.getFechaNacimiento(),
                        poliza.getCiudadCliente(),
                        poliza.getDireccionCliente()))
                .collect((Collectors.toList()));
    }


    /*@GetMapping("/fechaInicial/{fechaInicio}/fechaFinal/{fechaFin}")
    public List<Poliza> getPolizaRango(@PathVariable Date fechaInicio, @PathVariable Date fechaFin){
        HashMap
        return null;
    }*/

    //Método para obtener poliza por numero de poliza
    @GetMapping("/polizaId/{idPoliza}")
    public Poliza obtenerPolizaPorId(@PathVariable Integer idPoliza) throws Exception {

        return repository.findByIdPoliza(idPoliza)
                .map(poliza -> new Poliza(poliza.getIdPoliza(),
                        poliza.getFechaPoliza(),
                        poliza.getCoberturasPoliza(),
                        poliza.getValorMaximoPoliza(),
                        poliza.getNombrePlanPoliza(),
                        poliza.getPlacaAuto(),
                        poliza.getModeloAuto(),
                        poliza.isInspeccionAuto(),
                        poliza.getIdCliente(),
                        poliza.getNombreCliente(),
                        poliza.getFechaNacimiento(),
                        poliza.getCiudadCliente(),
                        poliza.getDireccionCliente()))
                .orElseThrow(()->new Exception("Poliza "+ idPoliza + " no existe" ));
    }



    @GetMapping("/polizaPlaca/{placaAuto}")
    public Poliza obtenerPolizaPorPlaca(@PathVariable String placaAuto) throws Exception {

        return repository.findByPlacaAuto(placaAuto)
                .map(poliza -> new Poliza(poliza.getIdPoliza(),
                        poliza.getFechaPoliza(),
                        poliza.getCoberturasPoliza(),
                        poliza.getValorMaximoPoliza(),
                        poliza.getNombrePlanPoliza(),
                        poliza.getPlacaAuto(),
                        poliza.getModeloAuto(),
                        poliza.isInspeccionAuto(),
                        poliza.getIdCliente(),
                        poliza.getNombreCliente(),
                        poliza.getFechaNacimiento(),
                        poliza.getCiudadCliente(),
                        poliza.getDireccionCliente()))
                .orElseThrow(()->new Exception("Poliza "+ placaAuto + " no existe" ));

    }



}
