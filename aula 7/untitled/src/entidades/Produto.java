package entidades;

public class Produto {
    private String nome;
    private double valor;
    private int quantidade;


    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.valor = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public double getValor() {return valor;}
    public void setValor(double valor) {this.valor = valor;}

    public int getQuantidade() {return quantidade;}
    public void setQuantidade(int quantidade) {this.quantidade = quantidade;}

    public double calcularValorEstoque() {
        return this.quantidade * this.valor;
    }

    @Override
    public String toString() {
        return "|" + nome + "|R$" + valor + "|" + quantidade + "|R$" + calcularValorEstoque() + "|";
    }
}
