package Ex01;

import Ex01.escola.*;
import Ex01.funcionarios.*;
import Ex01.utils.Imprima;

public class Main {
    public static void main(String[] args) {
        // Funcionarios
        Professor professorVictor = new Professor("Victor", "123.456.789-00", 1000.0);
        Diretor diretorThiago = new Diretor("Thiago", "123.456.789-00", 1000.0);
        Coordenador coordenadorLaura = new Coordenador("Laura", "123.456.789-00", 1000.0);
        Secretario secretarioHenrique = new Secretario("Henrique", "123.456.789-00", 1000.0);

        // Escola
        Artigo artigoJava = new Artigo("Java", "Java é uma linguagem de programação orientada a objetos");
        Agenda agendaVictor = new Agenda("Agenda de Victor", "Descrição da agenda de Victor");
        Turma turmaA = new Turma("Turma A", 10);

        // Cadastro de Artigos para um professor X
        Imprima.divisoria();
        professorVictor.publicarArtigo(artigoJava);
        professorVictor.exibirArtigosPublicados();
        Imprima.divisoria();

        // Cadastro de Turmas para um professor X
        coordenadorLaura.alocarProfessor(professorVictor, turmaA);
        professorVictor.exibirTurmasPeriodo();
        Imprima.divisoria();

        // Exibição de professores orientados pelo Diretor
        diretorThiago.orientarProfessor(professorVictor);
        diretorThiago.exibirProfessoresOrientados();
        Imprima.divisoria();

        // Exibição detalhada da agenda de um funcionário X
        secretarioHenrique.cadastrarAgenda(professorVictor, agendaVictor);
        secretarioHenrique.listarAgenda(professorVictor);
        Imprima.divisoria();
    }
}
