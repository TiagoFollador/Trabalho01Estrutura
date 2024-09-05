public class Elemento {
    final String nome;
    final String id;
    final String motivo;

    public Elemento(String nome, String id, String motivo) {
        this.nome = nome;
        this.id = id;
        this.motivo = motivo;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getMotivo() {
        return motivo;
    }
}
