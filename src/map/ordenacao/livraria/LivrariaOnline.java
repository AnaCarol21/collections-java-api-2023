package map.ordenacao.livraria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {
    private Map<String,Livro> livrosMap;

    public LivrariaOnline() {
        this.livrosMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livrosMap.put(autor, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        for(Map.Entry<String, Livro> entry : livrosMap.entrySet()){
            if(entry.getValue().getTitulo() == titulo)
                livrosMap.remove(entry.getKey());
        }
    }

    public Map<String,Livro> exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livrosMap.entrySet());
        Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());
        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorPreco;

    }

    public Livro pesquisarLivrosPorAutor(String autor){
        Livro livroAutor = null;
        if(!livrosMap.isEmpty()){
            livroAutor = livrosMap.get(autor);
        }
        return livroAutor;
    }

    public Livro obterLivroMaisCaro(){
        Livro livroMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for(Livro livro: livrosMap.values()){
            if(livro.getPreco() > maiorPreco){
                maiorPreco = livro.getPreco();
                livroMaisCaro = livro;
            }
        }
        return livroMaisCaro;
    }

    public void exibirLivroMaisBarato(){
        Livro livroMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for(Livro livro: livrosMap.values()){
            if(livro.getPreco() < menorPreco){
                menorPreco = livro.getPreco();
                livroMaisBarato = livro;
            }
        }        
        System.out.println("O livro mais barato é: "+livroMaisBarato);
    }

    public static void main(String[] args) {
        LivrariaOnline livros = new LivrariaOnline();
        
        livros.adicionarLivro("https://www.amazon.com.br/Entendendo-Algoritmos-Ilustrado-Programadores-Curiosos/dp/8575225634", "Entendendo Algoritmos: Um Guia Ilustrado Para Programadores e Outros Curiosos", "Aditya Y. Bhargava", 64d);
        livros.adicionarLivro("https://www.amazon.com.br/Código-limpo-Robert-C-Martin/dp/8576082675/ref=pd_bxgy_d_sccl_1/147-2188319-8091348", "Código limpo: habilidades práticas do Agile software", "Robert C. Martin", 89d);
        livros.adicionarLivro("https://www.amazon.com.br/Introdução-Linguagem-SQL-Abordagem-Iniciantes/dp/8575225014/ref=pd_bxgy_d_sccl_2/147-2188319-8091348", "Introdução à Linguagem SQL: Abordagem Prática Para Iniciantes", "Thomas Nield", 54d);
    
        
        System.out.println(livros.exibirLivrosOrdenadosPorPreco());
        livros.exibirLivroMaisBarato();
        System.out.println("O livro mais caro é: " + livros.obterLivroMaisCaro());
        System.out.println("Pesquisa por autor: " +  livros.pesquisarLivrosPorAutor("Thomas Nield"));

        livros.removerLivro("Código limpo: habilidades práticas do Agile software");
        System.out.println("Todos os livros do map: "+livros.livrosMap);
    }
}
