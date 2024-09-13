public class PilhaController {
    private Pilha pilha;

    public PilhaController(){
        this.pilha = new Pilha();
    }
    private void inserirDadoPilha(Node dado){
        dado.setAnterior(pilha.getTopo());
        pilha.setTopo(dado);
    }

    public void createNode(Elemento elemento){
        Node node = new Node(elemento);
        inserirDadoPilha(node);
    }
    public void showPillha(){
        Node node = this.pilha.getTopo();
        do {
            Elemento elemento = node.getElemento();
            System.out.println("ID: " + elemento.getId() + " Descricao: " + elemento.getDescricao() + " Data Hora: " + elemento.getDataHora());
            node = node.getAnterior();
        } while (node != null);
    }

    public void deleteElemento(){
        Node node = this.pilha.getTopo();
        pilha.setTopo(node.getAnterior());
        node.setAnterior(null);
    }
}
