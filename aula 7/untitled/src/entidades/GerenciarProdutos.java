package entidades;

import java.util.ArrayList;
public class GerenciarProdutos {
    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    //Create - Cadastrar Produtos

    public void cadastrarProduto(Produto produto) {
        listaProdutos.add(produto);
        System.out.println("Produto Cadastrado com sucesso!");
    }

    //Read - Listar Produtos
    public void listarProdutos() {
        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado com sucesso!");
        } else {
            System.out.println("| ID | NOME | VALOR | QUANTIDADE | VALOR EM ESTOQUE |");
            for (int i = 0; i < listaProdutos.size(); i++) {
                System.out.println("| " + i + " " + listaProdutos.get(i).toString() + " |");
            }
        }
    }

    //Update - Atualizar Produtos
    public void atualizarProduto(int id,String nome, double valor, int quantidade) {
        if (id >= 0 && id < listaProdutos.size()) {
            Produto produto = listaProdutos.get(id);
            produto.setNome(nome);
            produto.setValor(valor);
            produto.setQuantidade(quantidade);
            System.out.println("Produto atualizado com sucesso!");
        }  else {
            System.out.println("ID invalido!");
        }
    }

    //Delete - Remover produto
    public void removerProduto(int id) {
        if (id >= 0 && id < listaProdutos.size()) {
            listaProdutos.remove(id);
            System.out.println("Produto removido com sucesso!");
        } else  {
            System.out.println("ID invalido!");
        }
    }
}
