public class PilhaController {
    private Pilha pilha;

    public PilhaController(){
        this.pilha = new Pilha();
    }
    private void inserirDadoPilha(Node dado){ // metodo que realiza a insercao na pilha
        dado.setAnterior(pilha.getTopo());
        pilha.setTopo(dado);
    }

    public void createNode(Elemento elemento){ // metodo que cria o node (Nó)
        Node node = new Node(elemento);
        inserirDadoPilha(node);
    }
    public void showPillha(){ // metodo que exibe a Pilha
        Node node = this.pilha.getTopo();
        do {
            Elemento elemento = node.getElemento();
            System.out.println("ID: " + elemento.getId() + " Descricao: " + elemento.getDescricao() + " Data-Hora: " + elemento.getDataHora());
            node = node.getAnterior();
        } while (node != null);
    }

    public void deleteElemento(){ // metodo que deleta o elemento no topo da Pilha
        Node node = this.pilha.getTopo();
        Elemento elemento = node.getElemento();
        System.out.println("Deletando o dado de ID: " + elemento.getId() + " Descricao: " + elemento.getDescricao() + " Data-Hora: " + elemento.getDataHora());
        pilha.setTopo(node.getAnterior());
        node.setAnterior(null);
    }
}
