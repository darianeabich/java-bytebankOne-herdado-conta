package bytebankOneHerdadoConta;

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
