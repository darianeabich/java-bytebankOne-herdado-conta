package br.com.bytebankone.bytebankOneHerdadoConta.teste;

import br.com.bytebankone.bytebankOneHerdadoConta.modelo.ContaCorrente;
import br.com.bytebankone.bytebankOneHerdadoConta.modelo.ContaPoupanca;
import br.com.bytebankone.bytebankOneHerdadoConta.modelo.SaldoInsuficienteException;

public class TesteContas {
    public TesteContas() {
    }

    public static void main(String[] args) throws SaldoInsuficienteException {
        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.0D);
        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200.0D);
        cc.transfere(10.0D, cp);
        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());
    }
}
