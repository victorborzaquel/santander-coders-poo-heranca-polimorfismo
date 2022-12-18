package Ex02;

public class Filho extends Pai {
    public void sobrecarga() {
        System.out.println("Sobrecarga: 01");
    }

    public void sobrecarga(String texto) {
        System.out.println("Sobrecarga: 02");
    }

    @Override
    public void sobreposicao() {
        System.out.println("Sobreposicao: Filho");
    }
}
