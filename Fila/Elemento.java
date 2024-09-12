public class Elemento {
    private final String nome;
    private final String id;
    private final String motivo;

    public Elemento( String id, String nome, String motivo) {
        this.id = id;
        this.nome = nome;
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
