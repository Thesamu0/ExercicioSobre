public class ContaUniversitaria extends Conta{

    private int biometria;

    public ContaUniversitaria(int numConta, int bio) {
        super(numConta);
        this.biometria = bio;
    }

    // sacar(double)
    @Override
    public void sacar(double valor) {
        if(valor<=this.saldo && valor>0)
            this.saldo-=valor;
        else
            System.out.println("Valor inválido!");
    }

    // sacar(double,int)
    public void sacar(double valor,int bio) {
        if(valor<=this.saldo && valor>0 && bio == this.biometria)
            this.saldo-=valor;
        else
            System.out.println("Operação inválida!");
    }

    // depositar(double)
    public void depositar(double valor) {
        if(valor>0)
            this.saldo+=valor;
        else
            System.out.println("Valor inválido!");
    }

    // depositar(double,int)
    public void depositar(double valor, int bio) {
        if(valor>0 && bio==this.biometria)
            this.saldo+=valor;
        else
            System.out.println("Valor inválido!");
    }
}
