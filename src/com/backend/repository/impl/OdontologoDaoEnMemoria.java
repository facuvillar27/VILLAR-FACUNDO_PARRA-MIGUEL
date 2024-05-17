package com.backend.repository.impl;

import com.backend.entitiy.Odontologo;
import com.backend.repository.IDao;
import org.apache.log4j.Logger;

import java.util.List;

public class OdontologoDaoEnMemoria implements IDao<Odontologo> {
    private final Logger LOGGER = Logger.getLogger(OdontologoDaoEnMemoria.class);
    private List<Odontologo> odontologoRepositorio;

    public OdontologoDaoEnMemoria(List<Odontologo> odontologoRepositorio) {
        this.odontologoRepositorio = odontologoRepositorio;
    }


    @Override
    public Odontologo registrar(Odontologo odontologo) {
        odontologoRepositorio.add(odontologo);
        LOGGER.info("Se ha registrado el odontologo en memoria: " + odontologo);

        return odontologo;
    }

    @Override
    public List<Odontologo> listarTodos() {
        LOGGER.info("Listado de todos los odontolos en memoria: " + odontologoRepositorio);
        return odontologoRepositorio;
    }
}
