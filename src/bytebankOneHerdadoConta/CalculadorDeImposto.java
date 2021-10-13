package bytebankOneHerdadoConta;

public class CalculadorDeImposto {
    private double totalImposto;

    public CalculadorDeImposto() {
    }

    public void registra(Tributavel t) {
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return this.totalImposto;
    }
}
