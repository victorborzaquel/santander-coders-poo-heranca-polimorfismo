package Ex01.funcionarios;

import Ex01.escola.Artigo;
import Ex01.escola.Turma;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario {
    private final List<Artigo> artigosPublicados = new ArrayList<>();
    private final List<Turma> turmasPeriodo = new ArrayList<>();

    public Professor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public void publicarArtigo(Artigo artigo) {
        artigosPublicados.add(artigo);
    }

    public List<Artigo> getArtigosPublicados() {
        return artigosPublicados;
    }

    public void alocarTurma(Turma turma) {
        turmasPeriodo.add(turma);
    }

    public void exibirTurmasPeriodo() {
        if (turmasPeriodo.isEmpty()) {
            System.out.printf("Professor %s não há turmas alocadas.%n", nome);
            return;
        }

        System.out.println("Turmas do periodo do professor " + nome);
        turmasPeriodo.forEach(System.out::println);
    }

    public void exibirArtigosPublicados() {
        if (artigosPublicados.isEmpty()) {
            System.out.printf("Professor %s não possui artigos publicados.%n", nome);
            return;
        }

        System.out.println("Artigos publicados pelo professor " + nome);
        artigosPublicados.forEach(System.out::println);
    }
}
