package list.operacoesBasicas.Tarefas;

public class Tarefas {
    
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public Tarefas(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String toString() {
        return descricao;
    }
}
