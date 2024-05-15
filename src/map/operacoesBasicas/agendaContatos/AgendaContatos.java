package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaMap;

    public AgendaContatos() {
        this.agendaMap = new HashMap<>();
    }

    public void adicinarContato(String nome, Integer telefone){
        agendaMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaMap.isEmpty())
            agendaMap.remove(nome);
    }

    public void exibirContatos(){
        System.out.println(agendaMap);
    }

    public Integer presquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaMap.isEmpty())
            numeroPorNome = agendaMap.get(nome);

        return numeroPorNome;
    }

    public static void main(String[] args) {
        
        AgendaContatos ac = new AgendaContatos();

        ac.adicinarContato("Luisa", 1234567);
        ac.adicinarContato("Felipe", 123456);
        ac.adicinarContato("Marcos", 12345);
        ac.adicinarContato("Leo", 1234);

        ac.exibirContatos();

        ac.removerContato("Luisa");

        System.out.println("Pesquisando por Marcos: "+ac.presquisarPorNome("Marcos"));

        ac.exibirContatos();

    }
    
}
