package Service.ClassWithCommand;

import Domain.User;
import Persistence.DataBase;
import Service.Interfaces.Command;

// Comando concreto para registrar un usuario.
public class RegisterUserCommand implements Command {
    /**
     * RegistrarUsuarioComando: Comando concreto para registrar un usuario en la base de datos.
     */
    private String name;
    private String email;

    public RegisterUserCommand(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void execute() {
        // Crea un objeto Usuario y lo guarda en la base de datos.
        User user = new User(name, email);
        DataBase.getInstance().addUser(user);
        System.out.println("Usuario registrado: "+name);
    }
}
