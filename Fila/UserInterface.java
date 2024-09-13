import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    final FilaController controller;

    public UserInterface(FilaController controller) {
        this.controller = controller;
    }

    public boolean app() { // método principal onde rodamos todo o sistema
        showOptions();
        return chooseOption(option(1, 4));
    }

    /*
     * 1. input
     * 2. delete
     * 3. mostrar
     * 4. sair
     */
    public boolean chooseOption(int option) { // Método com o switch case onde os dados são selecionados
        switch (option) {
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

    public void inserirDado() { // método que realiza a interação com o usuário para inserir um novo elemento
        Scanner teclado = new Scanner(System.in);
        String id, nome, motivo;

        try {
            System.out.print("Digite o ID: ");
            id = teclado.nextLine();
            System.out.print("Digite a Descrição: ");
            motivo = teclado.nextLine();
            System.out.print("Digite seu nome: ");
            nome = teclado.nextLine();

            Elemento elemento = new Elemento(id, nome, motivo);
            controller.createNode(elemento);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Algo deu errado...");
        }
    }

    public void deleteDado() { // método que realiza a interação com o usuário para deletar o elemento topo da fila
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.print("Digite o Id do dado a ser deletado: ");
            controller.deleteElemento(teclado.next());
        } catch (Exception e) {
            System.out.println("Algo deu errado...");
            System.out.println("O Id escolhido não existe.");
        }
    }

    public void exibirHistorico() { // método que exibe os dados da pilha, em ordem do último dado inserido ao primeiro
        Scanner teclado = new Scanner(System.in);
        System.out.println("Deseja exibir a \n [1] lista normal \n [2] lista invertida");
        try {
            int option = teclado.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Exibindo o histórico");
                    controller.showFila();
                    break;
                case 2:
                    System.out.println("Exibindo o histórico inverso");
                    controller.showFilaByBack();
                    break;
                default:
                    System.out.println("Valor inválido, por favor selecione os valores descritos!");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido, por favor selecione os valores descritos!");
        }
    }

    public void adeus() { // despedida e agradecimento
        System.out.println("Obrigado por utilizar nosso aplicativo!!");
        System.out.println("Feito por: \n --- Luiz Mathias Rivabem Filho --- \n >>> Rafaela Vecchi <<< \n === Tiago de Brito Follador === ");
    }

    public void showOptions() {
        System.out.println("\n[1] Inserir um elemento do histórico");
        System.out.println("\n[2] Retirar um elemento do histórico");
        System.out.println("\n[3] Mostrar histórico");
        System.out.println("\n[4] Sair");
    }

    private void barrer() {
        System.out.print("\n=============================================================\n");
    }

    public int option(int min, int max) { // método que trava a seleção de opções para evitar saídas inesperadas
        Scanner teclado = new Scanner(System.in);
        int opcao = -1;

        do {
            try {
                System.out.print("Digite uma opção: ");
                opcao = teclado.nextInt();

            } catch (Exception e) {
                System.out.println("Digite um valor válido.");
                teclado.next(); // Limpa a entrada inválida
            }
        } while (opcao < min || opcao > max);

        return opcao;
    }
}
