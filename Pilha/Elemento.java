public class Elemento {
    final String id;
    final String dataHora;
    final String descricao;

    public Elemento(String id, String nome, String descricao) {
        this.id = id;
        this.dataHora = nome;
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public String getDataHora() {
        return dataHora;
    }

    public String getDescricao() {
        return descricao;
    }
}
