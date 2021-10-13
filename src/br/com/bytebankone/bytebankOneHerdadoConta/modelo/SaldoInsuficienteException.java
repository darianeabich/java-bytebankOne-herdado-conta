package br.com.bytebankone.bytebankOneHerdadoConta.modelo;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String msg) {
        super(msg);
    }
}
