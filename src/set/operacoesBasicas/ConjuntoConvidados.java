package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigo(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado convidado : convidadosSet){
            if(convidado.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = convidado;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados cc = new ConjuntoConvidados();

        cc.adicionarConvidado("Giovana", 2);
        cc.adicionarConvidado("Rebeca", 321);
        cc.adicionarConvidado("Luisa", 321);
        cc.adicionarConvidado("Fernanda", 1);
        
        cc.removerConvidadoPorCodigo(2);

        System.out.println("Quantidade de convidados: "+cc.contarConvidados());
        cc.exibirConvidados();

    }

}
