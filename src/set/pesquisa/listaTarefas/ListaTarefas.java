package set.pesquisa.listaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas(){
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao,false));
    }

    public void removerTarefa(String descricao){
        for(Tarefa tarefa: tarefaSet){
            if(tarefa.getDescricao().contains(descricao))
                tarefaSet.remove(tarefa);
                break;
        }
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);      
    }

    public void contarTarefas(){
        System.out.println("Contém: "+tarefaSet.size()+" tarefa(s)");
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa tarefa: tarefaSet){
            if(tarefa.getStatus()){
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa tarefa: tarefaSet){
            if(!tarefa.getStatus()){
                tarefasPendentes.add(tarefa);
            }
        }

        return tarefasPendentes;
    }

    public Tarefa marcarTarefaConcluida(String descricao){
        Tarefa tarefaConcluida = null;
        for(Tarefa tarefa: tarefaSet){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao) && tarefa.getStatus() == false){
                tarefa.setStatus(true);
                tarefaConcluida = tarefa;
                break;
            }
        }
        return tarefaConcluida;
    }

    public Tarefa marcarTarefaPendente(String descricao){
        Tarefa tarefaPendente = null;
        for(Tarefa tarefa: tarefaSet){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao) && tarefa.getStatus() == true){
                tarefa.setStatus(false);
                tarefaPendente = tarefa;
                break;
            }
        }
        return tarefaPendente;
    }

    public void limparListaTarefas(){
        tarefaSet.removeAll(tarefaSet);
    }


    public static void main(String[] args) {
        ListaTarefas lt = new ListaTarefas();

        lt.adicionarTarefa("Limpar quarto");
        lt.adicionarTarefa("Limpar cozinha");
        lt.adicionarTarefa("Limpar banheiro");
        lt.adicionarTarefa("Limpar piscina");

        lt.contarTarefas();
        lt.exibirTarefas();

        lt.marcarTarefaConcluida("Limpar cozinha");
        lt.marcarTarefaConcluida("Limpar piscina");

        System.out.println(lt.obterTarefasConcluidas());
        System.out.println(lt.obterTarefasPendentes());

        lt.marcarTarefaPendente("Limpar cozinha");

        lt.limparListaTarefas();

        lt.contarTarefas();

    }
}
