package br.com.bytebankone.bytebankOneHerdadoConta.modelo;

/**
 * Classe representa a moldura de uma conta bancária.
 *
 * @author dariane.abich
 */
public abstract class Conta extends Object implements Comparable<Conta> {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    /**
     * Construtor para inicializar o objeto Conta a partir da agência e do número
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero) {
        Conta.total++;
//        System.out.println("O total de contas é "+ Conta.total);
        this.agencia = agencia;
        this.numero = numero;
//        this.saldo = 100;
//        System.out.println("Estou criando uma conta "+this.numero);
    }

    public abstract void deposita(double valor);

    /**
     * Valor precisa ser maior que o saldo.
     *
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor) throws SaldoInsuficienteException {

        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: "+ this.saldo+", Valor: "+valor);
        }
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
       this.saca(valor);
       destino.deposita(valor);
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Nao pode valor menor ou igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <=0) {
            System.out.println("Nao pode valor menor ou igual a 0");
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

    @Override
    public boolean equals(Object ref) {
        Conta outraConta = (Conta) ref;

        if (this.agencia != outraConta.agencia) {
            return false;
        }
        if (this.numero != outraConta.numero) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Conta outraConta) {
        return Double.compare(this.saldo, outraConta.saldo);
    }

    @Override
    public String toString() {
        return "Nº "+ this.getNumero() + " - Agência: "+ this.getAgencia()+", Saldo: "+this.saldo;
    }
}
