import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    final FilaController controller;

    public UserInterface(FilaController controller) {
        this.controller = controller;
    }

    public boolean app(){ // metodo principal onde rodamos todo o sistema
        showOptions();
        return chooseOption(option(1,4));
    }
    /*
     * 1. input
     * 2. delete
     * 3. mostrar
     * 4.sair
     * */
    public boolean chooseOption(int option){ // Metodo com o switch case onde os dados sao selecionados
        switch (option){
            case 1:
                inserirDado();
                return true;
            case 2:
                deleteDado();
                return true;
            case 3:
                exibirHistorico();
                return true;
            case 4:
                adeus();
                return false;
            default:
                return true;
        }
    }

    public void inserirDado(){ // metodo que realiza a interacao com o usuario para inserir um novo elemento
        Scanner teclado = new Scanner(System.in);
        String id;
        String nome;
        String motivo;

        try {
            System.out.print("Digite o ID: ");
            id = teclado.nextLine();
            System.out.print("Digite a Descricao: ");
            motivo = teclado.nextLine();
            System.out.print("Digite seu nome: ");
            nome = teclado.nextLine();


            Elemento elemento = new Elemento( id, nome, motivo);
            controller.createNode(elemento);
        }   catch (Exception e) {
            e.printStackTrace();
            System.out.println("Algo deu errado...");
        }
    }

    public void deleteDado(){ // metodo que realiza a interacao com o usuario para deletar o elemento topo da fila
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("Digite o Id do dado a ser deletado: ");
            controller.deleteElemento(teclado.next());
        }   catch (Exception e) {

            System.out.println("Algo deu errado...");
            System.out.println("O Id escolhido não existe");;

        }
    }

    public void exibirHistorico(){ // metodo que exibe os dados da pilha, em ordem do ultimo dado inserido ao primeiro
        Scanner teclado = new Scanner(System.in);
        System.out.println("Deseja exibir a \n [1] lista normal \n [2] lista invertida");
        try{
            int option = teclado.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Exibindo o historico");
                    controller.showFila();
                    break;
                case 2:
                    System.out.println("Exibindo o historico inverso");
                    controller.showFilaByBack();
                    break;

                default:
                    System.out.println("Algo deu errado...");
                    System.out.println("Valor escolhido é invalido, por favor selecione os valores descritos!");
                    break;

            }

        } catch (Exception e){
            System.out.println("Algo deu errado...");
            System.out.println("Valor escolhido é invalido, por favor selecione os valores descritos!");
        }
    }

    public void adeus(){ // despedida e agradecimento
        System.out.println("Obrigado por utilizar nosso aplicatvo!!");
        System.out.println("Feito por: \n --- Luiz Mathias Rivabem Filho --- \n >>> Rafaela Vecchi <<< \n === Tiago de Brito Follador === ");
    }
    public void showOptions(){ // metodo que contem as opcoes a serem exibidas e escolhidas pelo usuario
        System.out.println("\n[1] Inserir um elemento do historico");
        System.out.println("\n[2] Retirar um elemento do historico");
        System.out.println("\n[3] Mostrar historico");
        System.out.println("\n[4] Sair");
        System.out.print("Insira sua opção: ");
    }

    public int option(int min, int max){ // metodo em que trava a selecao de opcoes para evitar saidas inesperadas
        Scanner teclado = new Scanner(System.in);
        int opcao = 2;
        do {
            String message = opcao < min || opcao > max ? "Tente novamente" : "Digite um valor"; // operador ternario message = (expressao booleana) ? (se sim) : (se nao)
            System.out.println(message);
            opcao = teclado.nextInt();
        } while (opcao < min || opcao > max);
        return opcao;
    }
}
