import entidades.Conta;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("Gabriel Rodrigues", 100);

        conta.setTitular("Gabriel Rodrigues Silva");


        System.out.println(conta.getTitular());
        System.out.println(conta.getSaldo());

    }
}
