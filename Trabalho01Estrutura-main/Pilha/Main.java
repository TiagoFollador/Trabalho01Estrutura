public class Main {

    public static void main(String[] args) {
        PilhaController controller = new PilhaController();
        Elemento elemento1 = new Elemento("REQ001", "Instalação de software", "2024-08-20 10:30");
        Elemento elemento2 = new Elemento("REQ002", "Instalação de software", "2024-08-20 10:30");
        Elemento elemento3 = new Elemento("REQ003", "Instalação de software", "2024-08-20 10:30");
        Elemento elemento4 = new Elemento("REQ004", "Instalação de software", "2024-08-20 10:30");


        controller.createNode(elemento1);
        controller.createNode(elemento2);
        controller.createNode(elemento3);
        controller.createNode(elemento4);

        controller.showPillha();

        controller.deleteElemento();

        controller.showPillha();
        System.out.println();
        controller.deleteElemento();
        System.out.println();
        controller.showPillha();
        controller.deleteElemento();

        controller.showPillha();

    }

}
