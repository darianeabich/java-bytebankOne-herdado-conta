package br.com.bytebankone.bytebankOneHerdadoConta.teste.util;

import br.com.bytebankone.bytebankOneHerdadoConta.modelo.Cliente;
import br.com.bytebankone.bytebankOneHerdadoConta.modelo.Conta;
import br.com.bytebankone.bytebankOneHerdadoConta.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();

        ArrayList<String> nomes = new ArrayList<String>();

        Conta cc = new ContaCorrente(22,11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22,12);
        lista.add(cc2);

        System.out.println("Tamanho: "+lista.size());
        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);
        System.out.println("Tamanho: "+ lista.size());

        Conta cc3 = new ContaCorrente(22,13);
        lista.add(cc3);
        Conta cc4 = new ContaCorrente(22,14);
        lista.add(cc4);

        for (int i = 0; i < lista.size(); i++){
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("---------------");

        for (Conta oRef : lista) {
            System.out.println(oRef);
        }
    }
}
