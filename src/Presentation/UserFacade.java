package Presentation;

import Service.ClassWithCommand.ListUsersCommand;
import Service.ClassWithCommand.RegisterUserCommand;
import Service.Interfaces.Command;

// Capa de Presentación: Simplifica la interacción con la capa de servicio.
// Se usa el patrón Facade para proporcionar una interfaz simplificada.

public class UserFacade {

    public void registerUser(String name, String email) {
        // Método para registrar un usuario mediante el comando correspondiente.
        Command command = new RegisterUserCommand(name, email);
        command.execute();
    }

    public void listUsers() {
        // Método para listar los usuarios mediante el comando correspondiente.
        Command command = new ListUsersCommand();
        command.execute();
    }
}
