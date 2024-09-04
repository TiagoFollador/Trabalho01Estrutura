import java.util.Scanner;

public class UserInterface {
    private PilhaController controller;

    public UserInterface(PilhaController controller) {
        this.controller = controller;
    }

    /*
     * 1. input
     * 2. delete
     * 3. mostrar
     * 4.sair
     * */
    public boolean chooseOption(int option){
        showOptions();
        switch (option){
            case 1:
                inserirDado();
                return true;
            default:
                return true;
        }
    }

    public void inserirDado(){
        Scanner teclado = new Scanner(System.in);
        String id = "";
        String descricao = "";
        String dataHora = "";

        try {
            System.out.print("Digite o ID: ");
            id = teclado.nextLine();
            System.out.print("Digite a Descricao: ");
            descricao = teclado.nextLine();
            System.out.print("Digite a data e hora no formato \"dd-mm-yyyy hh:mm:ss\" se possivl: ");
            dataHora = teclado.nextLine();

            Elemento elemento = new Elemento(id, descricao, dataHora);
            controller.createNode(elemento);
        }   catch (Exception e) {
            e.printStackTrace();
            System.out.println("Algo deu errado...");
        }
    }

    public void showOptions(){
        System.out.println("[1] Inserir um elemento do historico");
        System.out.println("[2] Retirar um elemento do historico");
        System.out.println("[3] Mostrar historico");
        System.out.println("[4] Sair");
        System.out.print(">>> ");
    }

//    public int option(int min, int max){
//
//    }
}
