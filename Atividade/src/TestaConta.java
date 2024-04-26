public class TestaConta {

    public static void main(String[] args) {

        Conta conta1 = new Conta("Sandro", 1, "001", 100, new Data(1, 1, 2022));
        Conta conta2 = new Conta("Sandra", 2, "002", 100, new Data(1, 1, 2022));

        conta1.depositar(100);
        conta1.sacar(50);
        conta1.exibirDados();


    }
}