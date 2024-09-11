public class Node {
    private Elemento elemento;
    private Node anterior;

    public Node(Elemento elemento) {
        this.elemento = elemento;
        this.anterior = null;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public Node getProximo() {
        return anterior;
    }

    public void setProximo(Node proximo) {
        this.anterior = proximo;
    }
}
