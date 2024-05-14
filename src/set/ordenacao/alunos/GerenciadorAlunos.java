package set.ordenacao.alunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos(){
        this.alunosSet = new HashSet<>();        
    }

    public void adicionarAluno(String nome, int matricula, double nota){
        alunosSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(double matricula){
        for(Aluno aluno : alunosSet)
            if(aluno.getMatricula() == matricula){
                alunosSet.remove(aluno);
                break;
            }            
    }
    
    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunosSet);
        return alunosPorNota;
    }

    public Set<Aluno> exibirAlunos(){
        return alunosSet;
    }

    public static void main(String[] args) {
        GerenciadorAlunos ga = new GerenciadorAlunos();

        ga.adicionarAluno("Lucimar", 123, 10d);
        ga.adicionarAluno("Adriano", 124, 6d);
        ga.adicionarAluno("Reinaldo", 125, 7d);
        ga.adicionarAluno("Serginho", 126, 7d);
        ga.adicionarAluno("Chico", 123, 5);

        System.out.println(ga.exibirAlunos());

        System.out.println("Removendo aluno com matricula 125");
        ga.removerAluno(125);

        System.out.println("Ordenando alunos por nome: "+ga.exibirAlunosPorNome());
        System.out.println("Ordenando alunos por nota: "+ga.exibirAlunosPorNota());        
    }

}
