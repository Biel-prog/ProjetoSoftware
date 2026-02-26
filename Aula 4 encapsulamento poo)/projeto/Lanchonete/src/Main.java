import entidades.Lanche;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lanche x_burguer = new Lanche("X-Burguer",
                "Pão, Hamburguer, Queijo, Maionese",
                24.90, 10
        );

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Digite a opção desejada: ");
            System.out.println("1 - FAZER PEDIDO");
            System.out.println("2 - ADICIONAR NO ESTOQUE");
            System.out.println("3 - INFORMAÇÃO DO LANCHE");
            System.out.println("4 - ALTERAR VALOR");
            System.out.println("5 - ALTERAR DESCRIÇÃO");
            System.out.println("6 - SAIR");
            System.out.print("DIGITE A OPÇÃO DESEJADA: ")
            String opcao = sc.nextLine();
        }

    }
}
