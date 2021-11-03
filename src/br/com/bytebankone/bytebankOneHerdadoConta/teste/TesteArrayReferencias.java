package br.com.bytebankone.bytebankOneHerdadoConta.teste;

import br.com.bytebankone.bytebankOneHerdadoConta.modelo.Conta;
import br.com.bytebankone.bytebankOneHerdadoConta.modelo.ContaCorrente;
import br.com.bytebankone.bytebankOneHerdadoConta.modelo.ContaPoupanca;

public class TesteArrayReferencias {
    public static void main(String[] args) {
        //um array de referencias com 5 elementos
        Object referencias[] = new Conta[5];
        ContaCorrente cc1 = new ContaCorrente(22,11);
        referencias[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22,12);
        referencias[1] = cc2;

//        System.out.println(referencias[1].getNumero());

        ContaPoupanca ref = (ContaPoupanca) referencias[1]; //type cast
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());

    }
}
