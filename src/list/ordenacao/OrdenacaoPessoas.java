package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();        
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){

        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas op = new OrdenacaoPessoas();

        op.adicionarPessoa("José", 92, 1.63);
        op.adicionarPessoa("Cleyde", 50, 1.50);
        op.adicionarPessoa("Genivaldo", 30, 1.80);
        op.adicionarPessoa("Leronzo", 18, 1.80);

        System.out.println(op.ordenarPorAltura());
        System.out.println(op.ordenarPorIdade());
    }
    
}
