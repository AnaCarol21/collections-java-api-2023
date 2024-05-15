package map.operacoesBasicas.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String,String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty())
            dicionarioMap.remove(palavra);
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String definicaoPalavra = null;
        if(!dicionarioMap.isEmpty())
            definicaoPalavra = dicionarioMap.get(palavra);

        return definicaoPalavra;
    }
    
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Avião", "aeronave de propulsão a motor, cuja sustentação no ar é assegurada por meio de asas.");
        dicionario.adicionarPalavra("Paralelepípedo", "prisma de seis lados cujas faces são paralelogramos; hexaedro cujas faces opostas são paralelogramos paralelos.");
        dicionario.adicionarPalavra("Joelho", "articulação da coxa com a perna, de que participam o fêmur, a tíbia e a patela.");
        dicionario.adicionarPalavra("Barroco", "na pintura, escultura, arquitetura e artes decorativas, estilo, com elementos do alto Renascimento e do Maneirismo e ligado à estética da Contrarreforma, nascido em Roma c1600 e cujas características básicas são o dinamismo do movimento com o triunfo da linha curva");
        
        dicionario.exibirPalavras();

        System.out.println("Removendo a palavra Barroco");
        dicionario.removerPalavra("Barroco");

        System.out.println("Pesquisando pela palavra Avião: "+dicionario.pesquisarPorPalavra("Avião"));


    }
}
