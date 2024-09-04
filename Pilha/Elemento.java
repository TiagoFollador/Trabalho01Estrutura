public class Elemento {
    final String id;
    final String dataHora;
    final String descricao;

    public Elemento(String id, String descricao, String dataHora) {
        this.id = id;
        this.descricao = descricao;
        this.dataHora = dataHora;
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
