package com.sixflags.parkmanager.exception;

public abstract class NegocioException extends RuntimeException {
    private final String codigo;

    protected NegocioException(String codigo, String mensaje) {
        super(mensaje);
        this.codigo = codigo;
    }

    public String getCodigo() { return codigo; }
}