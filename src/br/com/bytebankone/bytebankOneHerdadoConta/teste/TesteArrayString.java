package br.com.bytebankone.bytebankOneHerdadoConta.teste;

import br.com.bytebankone.bytebankOneHerdadoConta.modelo.Conta;
import br.com.bytebankone.bytebankOneHerdadoConta.modelo.ContaCorrente;
import br.com.bytebankone.bytebankOneHerdadoConta.modelo.ContaPoupanca;

public class TesteArrayString {
    public static void main(String[] args) {
        System.out.println("Funcionou!!");

        for(int i = 0; i <args.length; i++) {
            System.out.println(args[i]);
        }

    }
}
