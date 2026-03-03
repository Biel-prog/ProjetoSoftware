package entidades;

public class Lanche {
    private String nome;
    private String descricao;
    private double valor;
    private int estoque;
    private boolean disponivel;

    //Construtor

    public Lanche(String nome, String descricao, double valor, int estoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.estoque = estoque;
        this.disponivel = estoque > 0;
    }

    //Getters

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    //Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        if (descricao.isBlank()) {
            System.out.println("Informe uma descrição válida!");
        } else {
            this.descricao = descricao;
        }

    }

    public void setValor(double valor) {
        if (valor <= 0) {
            System.out.println("Informe um valor maior que zero");
        } else {
            this.valor = valor;
            System.out.println("Valor informado com sucesso!");
        }
    }

    public void verificaDisponivel() {
        this.disponivel = this.estoque > 0;
    }

    public boolean decrementaEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= this.estoque) {
            this.estoque -= quantidade;
            verificaDisponivel();
            return true;
        } else {
            return false;
        }
    }

    public void incrementaEstoque(int quantidade) {
        if (quantidade > 0) {
            this.estoque += quantidade;
            verificaDisponivel();
            System.out.println("Quantidade adiconada com sucesso!");
        }else {
            System.out.println("Valor inválido!");
        }
    }


    public double valorTotal(int quantidade) {
        return this.valor * quantidade;

    }
    //toString
    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nDescricao: " + descricao +
                "\nValor: " + valor +
                "\nEstoque: " + estoque +
                "\nDisponivel: " + disponivel ;
    }
}
