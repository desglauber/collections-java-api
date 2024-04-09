package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.APRIL, 8), "FDT", "Curso Cuidaidoso");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.DECEMBER, 19), "Espi", "Bolsa Universidade");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.APRIL, 21), "Manausprev", "Audiência Pública");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }

    //atributos

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }
    
    public void adicionarEvento(LocalDate data, String nome, String atracao) {        
        eventosMap.put(data,new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
            if (entry.getKey().equals(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
            System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
            break;
            }            
        }
    }
}
