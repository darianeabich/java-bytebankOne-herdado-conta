package bytebankOneHerdadoConta;

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
