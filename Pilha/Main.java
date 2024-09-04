public class Main {

    public static void main(String[] args) {
        PilhaController controller = new PilhaController(); // CRUD da pilha (nao tem update pois nao foi solicitado)
        UserInterface UI = new UserInterface(controller);

        boolean keepAsking = true;
        do {
            keepAsking = UI.app(); // roda o app
        } while (keepAsking);

    }

}
