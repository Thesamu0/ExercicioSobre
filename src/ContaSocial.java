public class ContaSocial extends Conta {

    private String comprovanteSocial;
    private double descontoSocial = 0.05;

    public ContaSocial(int numConta, String comprovanteSocial) {
        super(numConta);
        this.comprovanteSocial = comprovanteSocial;
    }

    // sacar(double)
    @Override
    public void sacar(double valor) {
        if(valor<=this.saldo && valor>0)
            this.saldo-=(valor*(1+this.descontoSocial));
        else
            System.out.println("Valor inválido!");
    }

    // sacar(double,String)
    public void sacar(double valor, String comprovante) {
        if(valor<=this.saldo && valor>0 && comprovante.equals(this.comprovanteSocial))
            this.saldo-=(valor*(1+this.descontoSocial));
        else
            System.out.println("Valor inválido!");
    }

    // depositar(double)
    @Override
    public void depositar(double valor) {
        if(valor>0)
            this.saldo+=(valor*(1+this.descontoSocial));
        else
            System.out.println("Valor inválido!");
    }

    // depositar(double,String)
    public void depositar(double valor, String comprovante) {
        if(valor>0 && comprovante.equals(this.comprovanteSocial))
            this.saldo+=(valor*(1+this.descontoSocial));
        else
            System.out.println("Valor inválido!");
    }
}
