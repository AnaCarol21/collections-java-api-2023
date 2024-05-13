package set.operacoesBasicas.PalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas(){
        this.palavrasSet = new HashSet<>();
    }

    public void adicinarPalavra(String palavra){
        palavrasSet.add(new String(palavra));
    }

    public void removerPalavra(String palavra){
            if(palavrasSet.contains(palavra))
                palavrasSet.remove(palavra);            
    }

    public void verificarPalavra(String palavra){
        if(palavrasSet.contains(palavra)){
            System.out.println("A palavra: "+palavra+" está presente no conjunto");
        }
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas cpu = new ConjuntoPalavrasUnicas();

        cpu.adicinarPalavra("Abacate");
        cpu.adicinarPalavra("Romã");
        cpu.adicinarPalavra("Pessego");
        cpu.adicinarPalavra("Morango");
        cpu.adicinarPalavra("Morango");
        
        cpu.removerPalavra("Abacate");

        cpu.verificarPalavra("Morango");

        cpu.exibirPalavrasUnicas();

    }
    
}
