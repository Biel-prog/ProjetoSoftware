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
            System.out.print("DIGITE A OPÇÃO DESEJADA: ");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Quantos lanches deseja adicionar no pedido?");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    if (x_burguer.decrementaEstoque(quantidade)) {
                        System.out.println("Você pediu " + quantidade +
                                " " + x_burguer.getNome() + " e o valor final, foi R$ "
                                + x_burguer.valorTotal(quantidade)
                        );
                    } else {
                        System.out.println("Pedido não realizado.!");
                        System.out.println("Quantidade inválida.");
                    }
                    break;

                case "2":
                    System.out.println("Quantos lanches deseja adicionar no estoque?");
                    int quantidadeEstoque = sc.nextInt();
                    sc.nextLine();

                    x_burguer.incrementaEstoque(quantidadeEstoque);
                    break;

                case "3":
                    System.out.println(x_burguer.toString());
                    break;

                case "4":
                    System.out.println("O lanche" + x_burguer.getNome() + " custa R$ " + x_burguer.getValor());
                    System.out.print("Digite o valor: ");
                    double valor = sc.nextDouble();
                    sc.nextLine();

                    x_burguer.setValor(valor);
                    break;
                default:
                    System.out.println("Digite uma opção válida!");

                case "5":
                    System.out.println("Descrição do " + x_burguer.getNome() + x_burguer.getDescricao());
                    System.out.println("Informe a descrição: ");
                    String Descricao = sc.nextLine();

                    x_burguer.setDescricao(Descricao);
                    System.out.println("Descrição alterada com sucesso!");
                    break;





            }
        }

    }
}
