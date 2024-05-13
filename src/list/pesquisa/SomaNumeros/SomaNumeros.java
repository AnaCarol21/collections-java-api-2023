package list.pesquisa.SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Numero> numerosList;
    

    public SomaNumeros(){
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosList.add(new Numero(numero));
    }

    public void calcularSoma(){
        int soma = 0;
        for(Numero num : numerosList){
            soma += num.getNumero();
        }
        System.out.println("A soma dos números da lista é: "+soma);
    }

    public void encontrarMaiorNumero(){
        int maior = Integer.MIN_VALUE;
        for(Numero num : numerosList){
            if(maior < num.getNumero()){
                maior = num.getNumero();
            }
        }
        System.out.println("O maior número é: "+ maior);
    }

    public void encontrarMenorNumero(){
        int menor = Integer.MAX_VALUE;
        for(Numero num : numerosList){
            if(menor > num.getNumero()){
                menor = num.getNumero();
            }
        }
        System.out.println("O menor número é: "+ menor);
    }

    public void exibirNumeros(){
        System.out.println(numerosList);
    }

    public static void main(String[] args) {
        SomaNumeros sm = new SomaNumeros();

        sm.adicionarNumero(20);
        sm.adicionarNumero(15);
        sm.adicionarNumero(10);
        sm.adicionarNumero(5);
        sm.adicionarNumero(30);

        sm.encontrarMaiorNumero();
        sm.encontrarMenorNumero();
        
        sm.exibirNumeros();
        sm.calcularSoma();

    }

    
}
