package Ex02;

public class Main {
    public static void main(String[] args) {
        Pai pai = new Pai();
        Filho filho = new Filho();

        pai.sobreposicao();
        filho.sobreposicao();

        filho.sobrecarga();
        filho.sobrecarga("texto");
    }
}
