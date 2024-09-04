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

    public Node getAnterior() {
        return anterior;
    }

    public void setAnterior(Node proximo) {
        this.anterior = proximo;
    }
}
