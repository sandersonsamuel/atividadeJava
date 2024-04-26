public class Conta {
    private String nomeTitular;
    private int numero;
    private String agencia;
    private double saldo;
    private Data data_de_abertura;

    public Conta(String nomeTitular, int numero, String agencia, double saldo, Data data_de_abertura) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.data_de_abertura = data_de_abertura;
    }

    public void sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso");
        } else {
            System.out.println("Depósito negado, não deve ser depositado um valor 0 ou negativo");
        }
    }

    public void calculaRendimento() {
        this.saldo *= 1.01;
    }

    public void exibirDados() {
        System.out.println("Nome do Titular: " + this.nomeTitular);
        System.out.println("Numero da conta: " + this.numero);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Data de abertura: " + this.data_de_abertura.getDataFormatada());
    }
}


