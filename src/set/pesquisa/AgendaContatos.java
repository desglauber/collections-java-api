package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Glauber", 1234);
        agendaContatos.adicionarContato("Glauber", 4321);
        agendaContatos.adicionarContato("Glauber Farias", 2468);
        agendaContatos.adicionarContato("Glauber DIO", 8642);
        agendaContatos.adicionarContato("Douglas Oliver", 1020);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Glauber"));
        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Douglas Oliver", 3020));

        agendaContatos.exibirContatos();
    }

    //atributos

    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatosSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }

        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatosSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }

        return contatoAtualizado;
    }
}
