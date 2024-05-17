package com.backend.service;

import com.backend.entitiy.Odontologo;

import java.util.List;

public interface IOdontologoService {
    Odontologo registrarOdontologo(Odontologo odontologo);
    List<Odontologo> listarOdontologos();
}
