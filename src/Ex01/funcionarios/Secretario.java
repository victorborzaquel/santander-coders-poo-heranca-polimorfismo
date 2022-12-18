package Ex01.funcionarios;

import Ex01.escola.Agenda;

public class Secretario extends Funcionario {
    public Secretario(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public void listarAgenda(Funcionario funcionario) {
        if (funcionario.getAgenda() == null) {
            System.out.println(funcionario.getNome() + " não possui agenda");
            return;
        }

        System.out.println("Agenda de " + funcionario.getNome());
        System.out.println(funcionario.getAgenda());
    }

    public void cadastrarAgenda(Funcionario funcionario, Agenda agenda) {
        funcionario.setAgenda(agenda);
    }
}
