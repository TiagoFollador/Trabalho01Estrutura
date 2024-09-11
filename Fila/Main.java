public class Main {

    public static void main(String[] args) {
        FilaController controller = new FilaController();
        UserInterface UI = new UserInterface(controller);

        boolean keepAsking = true;
        do {
            keepAsking = UI.app(); // roda o app
        } while (keepAsking);

    }
}
