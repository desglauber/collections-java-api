package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos(null);

        agendaContatos.adicionarContato("Glauber", 91234567);
        agendaContatos.adicionarContato("Yara", 91237890);
        agendaContatos.adicionarContato("Celeste", 91239876);
        agendaContatos.adicionarContato("Douglas", 91236543);
        agendaContatos.adicionarContato("Glauber", 91236547);
        agendaContatos.adicionarContato("Glauber", 91235642);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Celeste");

        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Yara"));
    }

    //atributos

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos(Map<String, Integer> agendaContatoMap) {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            System.out.println("O contato de " + nome + " foi removido com sucesso!");
            agendaContatoMap.remove(nome);    
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
            System.out.println("O nome pesquisado foi: " + nome);
        }
        return numeroPorNome;
    }
}
