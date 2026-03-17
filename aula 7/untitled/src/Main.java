import entidades.Produto;
import entidades.GerenciarProdutos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sacanner = new Scanner(System.in);
        GerenciarProdutos gerenciador = new GerenciarProdutos();
        int opcao = 0;

        do {
            System.out.println("\nMENU DE OPÇÕES");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - listar Produtos");
            System.out.println("3 - Atualizar Produto");
            System.out.println("4 - Remover Produto");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opcao: ");
            opcao = sacanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    String nome = sacanner.nextLine();
                    System.out.println("Digite o valor do produto: ");
                    double valor = sacanner.nextDouble();
                    System.out.println("Digite a quantidade do produto: ");
                    int quantidade = sacanner.nextInt();
                    gerenciador.cadastrarProduto(new Produto(nome, valor, quantidade));
                    break;

                case 2:
                    gerenciador.listarProdutos();
                    break;

                case 3:
                    System.out.println("Digite o ID do produto: ");
                    int idAtualizar = sacanner.nextInt();
                    sacanner.nextLine();
                    System.out.println("Digite o novo nome do produto: ");
                    String novoNome = sacanner.nextLine();
                    System.out.println("Digite o novo valor do produto: ");
                    double novoValor = sacanner.nextDouble();
                    System.out.println("Digite a quantidade do produto: ");
                    int novaQuantidade = sacanner.nextInt();
                    gerenciador.atualizarProduto(idAtualizar, novoNome, novoValor, novaQuantidade);
                    break;

                case 4:
                    System.out.println("Digite o ID do produto: ");
                    int idRemover = sacanner.nextInt();
                    gerenciador.removerProduto(idRemover);
                    break;

                case 5:
                    System.out.println("Saindo do Sistema...");
                    break;

                default:
                    System.out.println("Opção Invalida");
            }
        }while (opcao != 5);

                        
    }
}