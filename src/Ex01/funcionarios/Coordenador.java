package Ex01.funcionarios;

import Ex01.escola.Turma;

public class Coordenador extends Funcionario {
    public Coordenador(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public void alocarProfessor(Professor professor, Turma turma) {
        professor.alocarTurma(turma);
    }
}
