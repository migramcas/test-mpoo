package com.sixflags.parkmanager.exception;

public class DescuentoInvalidoException extends NegocioException {
    public DescuentoInvalidoException() {
        super("DESCUENTO_INVALIDO", "El porcentaje debe estar entre 0 y 100");
    }
}
