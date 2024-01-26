package com.example.prueba.services;

import java.util.List;

import com.example.prueba.entities.Cliente;

public interface ClienteServices {
    Cliente create(Cliente cliente);

    Cliente update(Cliente cliente);

    Cliente findById(Integer id);

    List<Cliente> findAll();

    void delete(Integer id);
}
