public abstract class Conta {

    private int numConta;
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public Conta(int numConta) {
        this.numConta = numConta;
        this.saldo = 0;
    }

    public abstract void sacar(double valor);

    public abstract void depositar(double valor);
}
