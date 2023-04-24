import java.util.ArrayList;
import java.util.List;

class Maco implements Componente {
    private String nome;
    private List<Componente> componentes = new ArrayList<>();

    public Maco(String nome) {
        this.nome = nome;
        for (int i = 0; i < 20; i++) {
            Cigarro cigarro = new Cigarro("Cigarro " + (i + 1));
            cigarro.add(new Tabaco("Tabaco", 0.5));
            cigarro.add(new Seda("Seda", 0.1));
            componentes.add(cigarro);
        }
    }

    public void add(Componente c) {
        componentes.add(c);
    }

    public void remove(Componente c) {
        componentes.remove(c);
    }

    public String getDescricao() {
        String descricao = nome + " (";
        for (int i = 0; i < componentes.size(); i++) {
            descricao += componentes.get(i).getDescricao();
            if (i < componentes.size() - 1) {
                descricao += ", ";
            }
        }
        descricao += ")";
        return descricao;
    }

    public double getPreco() {
        double precoTotal = 0;
        for (Componente c : componentes) {
            precoTotal += c.getPreco();
        }
        return precoTotal;
    }
}