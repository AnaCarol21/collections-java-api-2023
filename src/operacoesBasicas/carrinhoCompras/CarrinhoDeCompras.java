package operacoesBasicas.carrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }
    
    public void adicionarItem( String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String Nome){
        List<Item> itensRemover = new ArrayList<>();
            for(Item item : itemList){
                if(item.getNome().equalsIgnoreCase(Nome)){
                    itensRemover.add(item);
                }
            }            
            itemList.removeAll(itensRemover);
    }

    public void calcularValorTotal(){
        double valorTotal = 0D;
        for (Item item: itemList){
            double valorItem = item.getPreco() * item.getQuantidade();
            valorTotal += valorItem;
        }

        System.out.println("O valor total da compra é: "+valorTotal);

    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras cdc = new CarrinhoDeCompras();
        cdc.adicionarItem("Papel", 10.5, 1);
        cdc.adicionarItem("Papel", 10.5, 1);
        cdc.adicionarItem("Jornal", 2, 1);
        cdc.adicionarItem("Lapis", 1.5, 5);

        cdc.exibirItens();

        cdc.calcularValorTotal();

        cdc.removerItem("Jornal");

        cdc.exibirItens();

    }
}
