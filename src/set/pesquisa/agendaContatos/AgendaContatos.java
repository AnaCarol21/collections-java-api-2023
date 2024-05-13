package set.pesquisa.agendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatosSet;

    public AgendaContatos(){
        this.contatosSet = new HashSet<>();
    }

    public void adicinarContato(String nome, int numero){
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato contato: contatosSet){
            if(contato.getNome().startsWith(nome))
             contatosPorNome.add(contato);
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato contato: contatosSet){
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos ac = new AgendaContatos();

        ac.adicinarContato("Roberta", 123);
        ac.adicinarContato("Genival toledo", 1234);
        ac.adicinarContato("Genival", 1234);
        ac.adicinarContato("Genival", 1234);

        ac.exibirContatos();

        System.out.println("O Numero foi atualizado "+ac.atualizarNumeroContato("Roberta", 321));

        System.out.println(ac.pesquisarPorNome("Genival"));

    }

}
