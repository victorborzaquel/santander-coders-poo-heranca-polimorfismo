package Ex01.escola;

public record Artigo(String titulo, String descricao) {

    @Override
    public String toString() {
        return String.format("Titulo: %s%nDescricao: %s", titulo, descricao);
    }
}
