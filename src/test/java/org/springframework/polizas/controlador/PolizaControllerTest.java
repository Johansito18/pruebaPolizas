package org.springframework.polizas.controlador;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.polizas.modelo.Poliza;
import org.springframework.polizas.repositorio.PolizaRepository;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Date;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class PolizaControllerTest {
    @Mock
    private PolizaRepository polizaRepository;

    private Poliza poliza;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        poliza = new Poliza();

        poliza.setIdPoliza(1);
        poliza.setFechaPoliza(new Date(2020,10,10));
        poliza.setCoberturasPoliza("todo");
        poliza.setValorMaximoPoliza(4000);
        poliza.setNombrePlanPoliza("poliza");
        poliza.setPlacaAuto("CCC456");
        poliza.setModeloAuto("Ferrari");
        poliza.setInspeccionAuto(true);
        poliza.setIdCliente(123456);
        poliza.setNombreCliente("johan");
        poliza.setFechaNacimiento(new Date(2004,10,10));
        poliza.setCiudadCliente("Medellin");
        poliza.setDireccionCliente("Itagui");
    }

    @Test
    void listarPolizas() {
        when(polizaRepository.findAll()).thenReturn(Arrays.asList(poliza));
    }

    @Test
    void obtenerPolizaPorId(){
        when(polizaRepository.findByIdPoliza(1).map(poliza -> new Poliza(poliza.getIdPoliza(),
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
                poliza.getDireccionCliente())));

    }

    @Test
    void obtenerPolizaPorPlaca(){
        when(polizaRepository.findByPlacaAuto("CCC456").map(poliza -> new Poliza(poliza.getIdPoliza(),
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
                poliza.getDireccionCliente())));

    }


}