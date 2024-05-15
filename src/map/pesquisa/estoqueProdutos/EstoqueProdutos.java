package map.pesquisa.estoqueProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long,Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        estoqueProdutosMap.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto produto : estoqueProdutosMap.values()){
                valorTotalEstoque += produto.getQuantidade()*produto.getPreco();
            }
        }            
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for(Produto produto : estoqueProdutosMap.values()){
            if(produto.getPreco() > maiorPreco){
                maiorPreco = produto.getPreco();
                produtoMaisCaro = produto;
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for(Produto produto : estoqueProdutosMap.values()){
            if(produto.getPreco() < menorPreco){
                menorPreco = produto.getPreco();
                produtoMaisBarato = produto;
            }
        }
        return produtoMaisBarato;
    }
    
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1L, "Produto 01", 10d, 2);
        estoque.adicionarProduto(2L, "Produto 02", 11.8d, 4);
        estoque.adicionarProduto(3L, "Produto 03", 2.5d, 1);
        estoque.adicionarProduto(4L, "Produto 04", 20d, 5);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: "+estoque.calcularValorTotalEstoque());
        System.out.println("O produto mais caro é: "+ estoque.obterProdutoMaisCaro());
        System.out.println("O produto mais barato é: "+ estoque.obterProdutoMaisBarato());
    }
}
