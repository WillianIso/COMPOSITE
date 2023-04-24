class Seda implements Componente {
    private String nome;
    private double preco;

    public Seda(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getDescricao() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}