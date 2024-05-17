package com.backend.test;

import com.backend.entitiy.Odontologo;
import com.backend.repository.impl.OdontologoDaoEnMemoria;
import com.backend.repository.impl.OdontologoDaoH2;
import com.backend.service.impl.OdontologoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceTest {
    private OdontologoService odontologoService;

    @Test
    void deberiaDevolverUnaListaNoVaciaDeOdontologosEnH2(){
        odontologoService = new OdontologoService(new OdontologoDaoH2());

        assertFalse(odontologoService.listarOdontologos().isEmpty());
    }

    @BeforeEach
    void setUp() {
        List<Odontologo> odontologoRepositorio = new ArrayList<>();
        odontologoService = new OdontologoService(new OdontologoDaoEnMemoria(odontologoRepositorio));
    }

    @Test
    void deberiaDevolverUnaListaNoVaciaDeOdontologosEnMemoria() {
        Odontologo odontologo1 = new Odontologo(1L,3333, "Nicolas", "Gonzalez");
        Odontologo odontologo2 = new Odontologo(2L,3333, "Pedro", "Rodriguez");
        odontologoService.registrarOdontologo(odontologo1);
        odontologoService.registrarOdontologo(odontologo2);

        assertFalse(odontologoService.listarOdontologos().isEmpty());
    }

}