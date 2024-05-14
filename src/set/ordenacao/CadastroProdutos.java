package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();
    }

    public void adicinarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cp = new CadastroProdutos();

        cp.adicinarProduto(123L, "Beringela", 12d, 5);
        cp.adicinarProduto(124L, "Abacaxi", 11.5d, 10);
        cp.adicinarProduto(125L, "Tomate", 8d, 2);
        cp.adicinarProduto(126L, "Azeitona", 1d, 200);

        System.out.println("Ordenado por preço: "+cp.exibirPorPreco());
        System.out.println("Ordenado por nome: "+cp.exibirProdutosPorNome());
    }
    
}
