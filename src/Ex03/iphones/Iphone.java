package Ex03.iphones;

public abstract class Iphone {
    private final String modelo;

    public Iphone(String modelo) {
        this.modelo = modelo;
    }

    public void exibirDetalhes() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("Modelo: %s", modelo);
    }
}
