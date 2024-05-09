package pesquisa.SomaNumeros;

public class Numero{
    private int numero;

    public int getNumero() {
        return numero;
    }

    public Numero (int numero){
        this.numero = numero;
    }

    @Override    
    public String toString(){
        return "Numero: "+ numero;
    } 
}
