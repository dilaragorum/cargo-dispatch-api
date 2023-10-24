package com.example.cargodispatchapi.exception;

public class InvalidCargoException extends RuntimeException {
    public InvalidCargoException(String message) {
        super(message);
    }
}
