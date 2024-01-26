package com.example.prueba.exeptions;

public class ModelNotFoundException extends RuntimeException {

    public ModelNotFoundException() {
        super("no se encontro un dato perteneciente a ese id");
    }

    public ModelNotFoundException(String mensaje) {
        super(mensaje);
        System.out.println(mensaje);
    }
}
