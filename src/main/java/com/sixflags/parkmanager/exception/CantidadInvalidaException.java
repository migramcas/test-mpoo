package com.sixflags.parkmanager.exception;

public class CantidadInvalidaException extends NegocioException {
    public CantidadInvalidaException() {
        super("CANTIDAD_INVALIDA", "La cantidad debe ser un entero entre 1 y 10");
    }
}
