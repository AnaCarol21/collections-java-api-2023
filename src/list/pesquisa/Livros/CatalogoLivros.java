package list.pesquisa.Livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;
    
    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro livro : livroList){
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosIntervalo = new ArrayList<>();
        for(Livro livro : livroList){
            if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                livrosIntervalo.add(livro);
            }
        }
        return livrosIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroTitulo = null;
        for(Livro livro : livroList){
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                livroTitulo = livro;
                break;
            }
        }
        return livroTitulo;
    }
    public static void main(String[] args) {
        CatalogoLivros cl = new CatalogoLivros();

        cl.adicionarLivro("Livro 1", "autor 1", 2000);
        cl.adicionarLivro("Livro 2", "autor 2", 2002);
        cl.adicionarLivro("Livro 3", "autor 2", 1990);
        cl.adicionarLivro("Livro 4", "autor 3", 1980);

        System.out.println(cl.pesquisarPorAutor("autor 2"));
        System.out.println(cl.pesquisarPorIntervaloAnos(1980, 2000));
        System.out.println(cl.pesquisarPorTitulo("Livro 4"));


    }


}
