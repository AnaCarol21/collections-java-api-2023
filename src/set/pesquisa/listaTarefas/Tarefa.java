package set.pesquisa.listaTarefas;

public class Tarefa {
    private String descricao;
    private boolean status;
    
    public Tarefa(String descricao, boolean status){
        this.descricao = descricao;
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean getStatus(){
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "{Tarefa: "+descricao+", status: "+status+"}" ;
    }

}
