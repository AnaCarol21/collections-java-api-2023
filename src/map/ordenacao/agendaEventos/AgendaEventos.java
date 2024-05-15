package map.ordenacao.agendaEventos;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventosMap);

        for(Map.Entry<LocalDate,Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData= entry.getKey();
                proximoEvento= entry.getValue();

                System.out.println("O proximo evento é: "+ proximoEvento +"na data: "+ proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendar = new AgendaEventos();

        agendar.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 2), "Evento 01", "Atracao 01");
        agendar.adicionarEvento(LocalDate.of(2026, Month.JANUARY, 12), "Evento 02", "Atracao 02");
        agendar.adicionarEvento(LocalDate.of(2022, Month.JULY, 24), "Evento 03", "Atracao 03");

        agendar.exibirAgenda();

        agendar.obterProximoEvento();        
    }


}
