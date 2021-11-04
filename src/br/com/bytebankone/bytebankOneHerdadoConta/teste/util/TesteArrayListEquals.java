package br.com.bytebankone.bytebankOneHerdadoConta.teste.util;

import br.com.bytebankone.bytebankOneHerdadoConta.modelo.Conta;
import br.com.bytebankone.bytebankOneHerdadoConta.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {
//        Conta cc1 = new ContaCorrente(22,12);
//        Conta cc2 = new ContaCorrente(22,12);
//
//        boolean igual = cc1.ehIgual(cc2);
//        System.out.println(igual);

        //Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22,11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22,12);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22,12);

        boolean existe = lista.contains(cc3);
        System.out.println("Já existe? "+existe);

        for (Conta oRef : lista) {
            System.out.println(oRef);
        }
    }
}
