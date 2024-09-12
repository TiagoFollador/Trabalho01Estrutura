public class FilaController {

    private Fila fila;

    public FilaController() {
        this.fila = new Fila();
    }


    /**
     * @param dado;
     *
     *
     * a funcao recebe como parametro um node, na primeira validacao ele verifica
     *  se é o primeiro da fila, inserindo o proximo e o anterior a ele como null
     *      e inserindo o elemento novo como sendo o comeco e o fim da fila
     *  caso contrario, define o ultimo elemento da fila (this.fila) sendo o anterior ao novo elemento
     *      e define o novo elemento como o final da fila
     * */
    private void inserirDadoFila(Node dado){
        if (this.fila.getFim() == null && this.fila.getComeco() == null){
            dado.setProximo(null);
            dado.setAnterior(null);
            fila.setComeco(dado);
            fila.setFim(dado);
        } else {
            Node ultimoNode = fila.getFim();
            dado.setAnterior(ultimoNode);
            dado.setProximo(null);
            ultimoNode.setProximo(dado);
            this.fila.setFim(dado);
        }
    }

    /**
     * @param elemento
     *
     * cria o novo node e chama a funcao de inserirDadoFila
     * */
    public void createNode(Elemento elemento){ // metodo que cria o node (Nó)
        Node node = new Node(elemento);
        inserirDadoFila(node);
    }

    /**
     *
     * metodo responsavel por exibir fila do comeco ao fim
     * */
    public void showFila(){ // metodo que cria
        Node node = fila.getComeco();
        do {
            Elemento elemento = node.getElemento();
            System.out.print("--> Id: " + elemento.getId() + " Nome: " + elemento.getNome() + " Motivo: " + elemento.getMotivo());
            node = node.getProximo();

        } while (node != null);
    }

    public void showFilaByBack(){
        Node node = fila.getFim();
        do {
            Elemento elemento = node.getElemento();
            System.out.print("--> Id: " + elemento.getId() + " Nome: " + elemento.getNome() + " Motivo: " + elemento.getMotivo());
            node = node.getAnterior();

        } while (node != null);
    }

    /**
     * @param id
     *
     * recebe o id como parametro para fins de validações
     *
     * comeca a busca pelo primeiro node, procurando o
     * elemento com id igual ao parametro, caso nao seja, ele avanca para o proximo
     *
     * se o id do elemento for igual ao recebido por parametro, ele verifica
     *      se é o primeiro da fila
     *          ele só define o anterior do proximoNode como sendo null,  o comeco da fila como o proximoNode, e define o proximo do node como null
     *      se é o ultimo
     *          ele define o proximo do anteriorNode como sendo null, define o ultimo da fila como o anteriorNode, e define o anterior do node como null
     *      caso contrario
     *          ele define o anterior do proximoNode como sendo o anteriorNode e o proximo do anteriorNode como sendo o proximoNode
     * */
    public void deleteElemento(String id){
        Node node = this.fila.getComeco();
        Elemento elemento = node.getElemento();
        Node comeco = this.fila.getComeco();
        Node fim = this.fila.getFim();
        boolean keepAsking = true;
        do {
            if (id.equals(elemento.getId())) {
                keepAsking = false;
                System.out.println("Removendo o elemento Id: " + elemento.getId() + " Nome: " + elemento.getNome() + " Motivo: " + elemento.getMotivo());

                if (node == comeco) {
                    Node proximoNode = node.getProximo();

                    proximoNode.setAnterior(null);
                    fila.setComeco(proximoNode);

                    node.setProximo(null);
                } else if (node == fim) {
                    Node anteriorNode = node.getAnterior();

                    anteriorNode.setProximo(null);
                    fila.setFim(anteriorNode);

                    node.setAnterior(null);
                }   else {
                    Node anteriorNode = node.getAnterior();
                    Node proximoNode = node.getProximo();

                    node.setAnterior(null);
                    node.setProximo(null);

                    anteriorNode.setProximo(proximoNode);
                    proximoNode.setAnterior(anteriorNode);
                }
            }   else {
                node = node.getProximo();
                elemento = node.getElemento();
            }
        } while (keepAsking && node != null);
    }

}
