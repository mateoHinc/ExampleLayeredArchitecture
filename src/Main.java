import Presentation.UserFacade;
// Clase principal: Aquí se interactúa con el sistema mediante la fachada (Facade).

public class Main {
    /**
    * Punto de entrada de la aplicación. Se interactúa con la capa de presentación a través de la fachada.
    */
    public static void main(String[] args) {

        UserFacade userFacade = new UserFacade();

        // Se registran algunos usuarios usando el Facade, que simplifica el proceso.
        userFacade.registerUser("Mateo", "mateo@example.com");
        userFacade.registerUser("Yeison", "yeison@example.com");

        // Se listan los usuarios registrados.
        userFacade.listUsers();

    }
}