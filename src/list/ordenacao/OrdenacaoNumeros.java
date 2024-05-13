package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeroList;

    public OrdenacaoNumeros(){
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeroList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numeroAscendente = new ArrayList<>(numeroList);
        Collections.sort(numeroAscendente);
        return numeroAscendente;   
    }
    public List<Integer> ordenarDescendente(){
        List<Integer> numeroDescendente = new ArrayList<>(numeroList);
        Collections.sort(numeroDescendente, Collections.reverseOrder());
        return numeroDescendente;
    } 
    

    public static void main(String[] args) {
        OrdenacaoNumeros on = new OrdenacaoNumeros();

        on.adicionarNumero(1);
        on.adicionarNumero(3);
        on.adicionarNumero(2);
        on.adicionarNumero(5);
        on.adicionarNumero(4);
        on.adicionarNumero(6);

        System.out.println(on.ordenarAscendente());
        System.out.println(on.ordenarDescendente());
    }
}
