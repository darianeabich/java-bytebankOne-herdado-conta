package br.com.bytebankone.bytebankOneHerdadoConta.modelo;

import java.io.Serializable;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException {
        double valorASacar = valor + 0.2D;
        super.saca(valorASacar);
    }

    public void deposita(double valor) {
        super.saldo += valor;
    }

    public double getValorImposto() {
        return super.saldo * 0.01D;
    }

    @Override
    public String toString() {
        return "ContaCorrente: "+ super.toString();
    }
}
