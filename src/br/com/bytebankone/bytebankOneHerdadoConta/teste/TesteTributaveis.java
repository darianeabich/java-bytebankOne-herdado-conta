package br.com.bytebankone.bytebankOneHerdadoConta.teste;

import br.com.bytebankone.bytebankOneHerdadoConta.modelo.CalculadorDeImposto;
import br.com.bytebankone.bytebankOneHerdadoConta.modelo.ContaCorrente;
import br.com.bytebankone.bytebankOneHerdadoConta.modelo.SeguroDeVida;

public class TesteTributaveis {
    public TesteTributaveis() {
    }

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.0D);
        SeguroDeVida seguro = new SeguroDeVida();
        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registra(cc);
        calc.registra(seguro);
        System.out.println(calc.getTotalImposto());
    }
}
