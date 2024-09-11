public class FilaController {

    private Fila fila;

    public FilaController() {
        this.fila = new Fila();
    }

    private void inserirDadoFila(Node dado){ // metodo que realiza a insercao na Fila
        dado.setProximo(fila.getFrente());
        fila.setFrente(dado);
    }

    public void createNode(Elemento elemento){ // metodo que cria o node (Nó)
        Node node = new Node(elemento);
        inserirDadoFila(node);
    }


    public void showfila(){ // metodo que cria
        Node node = fila.getFrente();
        do {
            Elemento elemento = node.getElemento();
            System.out.print("--> Id: " + elemento.id + " Nome: " + elemento.getNome() + " Motivo: " + elemento.getMotivo());
            node = node.getProximo();

        } while (node != null);
    }

    public void deleteElemento(){
        Node node = this.fila.getFrente();
        Elemento elemento = node.getElemento();
        //System.out.println("Removendo o elemento Id: " + elemento.id + " Nome: " + elemento.getNome() + " Motivo: " + elemento.getMotivo());
        fila.setFrente(node.getProximo());
        node.setProximo(node.getProximo());






    }

}
