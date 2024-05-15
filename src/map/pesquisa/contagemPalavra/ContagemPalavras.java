package map.pesquisa.contagemPalavra;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        palavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        palavrasMap.remove(palavra);
    }

    public int exibirContagemPalavras(){
        int contagem = 0;
        for(int palavra: palavrasMap.values()){
            contagem += palavra;
        }
        return contagem;
    }

    public String encontrarPalavrasMaisFrequente() {
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : palavrasMap.entrySet()) {
          if (entry.getValue() > maiorContagem) {
            maiorContagem = entry.getValue();
            linguagemMaisFrequente = entry.getKey();
          }
        }
        return linguagemMaisFrequente;
      }

    public static void main(String[] args) {
        ContagemPalavras contagem = new ContagemPalavras();

        contagem.adicionarPalavra("uma", 2);
        contagem.adicionarPalavra("duas", 6);
        contagem.adicionarPalavra("tres", 3);
    
        System.out.println(contagem.palavrasMap);
        System.out.println(contagem.exibirContagemPalavras());

        contagem.removerPalavra("uma");
        System.out.println("Palavra mais frequente: "+contagem.encontrarPalavrasMaisFrequente());

        contagem.exibirContagemPalavras();
    }
}
