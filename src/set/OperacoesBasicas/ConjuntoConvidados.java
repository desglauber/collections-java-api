package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados.");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 2);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 2);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 4);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados.");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados.");

        conjuntoConvidados.exibirConvidados();
    }

    //atributo

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadosSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;              
            }
        }

        System.out.println("Foi removido o convidado com o convite nº " + convidadoParaRemover);
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadosSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadosSet);
    }
}
