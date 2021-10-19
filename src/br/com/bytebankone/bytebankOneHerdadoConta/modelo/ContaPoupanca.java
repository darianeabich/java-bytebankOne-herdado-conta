package br.com.bytebankone.bytebankOneHerdadoConta.modelo;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public String toString() {
        return "ContaPoupanca: "+ super.toString();
    }
}
