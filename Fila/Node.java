public class Node {
    private Elemento elemento;
    private Node anterior;
    private Node proximo;

    public Node(Elemento elemento) {
        this.elemento = elemento;
        this.anterior = null;
        this.proximo = null;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public Node getProximo() {
        return anterior;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

    public Node getAnterior() {
        return anterior;
    }

    public void setAnterior(Node anterior) {
        this.anterior = anterior;
    }
}

