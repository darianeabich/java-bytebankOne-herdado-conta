package br.com.bytebankone.bytebankOneHerdadoConta.teste;

import br.com.bytebankone.bytebankOneHerdadoConta.modelo.Conta;
import br.com.bytebankone.bytebankOneHerdadoConta.modelo.ContaCorrente;
import br.com.bytebankone.bytebankOneHerdadoConta.modelo.GuardadorDeContas;

public class Teste {
    public static void main(String[] args) {
        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente(22,11);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(22,12);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQtdElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(1);
        System.out.println(ref.getNumero());
    }
}
