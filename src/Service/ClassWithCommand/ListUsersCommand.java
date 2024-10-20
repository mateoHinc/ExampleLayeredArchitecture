package Service.ClassWithCommand;

import Domain.User;
import Persistence.DataBase;
import Service.Interfaces.Command;

import java.util.List;

// Comando concreto para listar usuarios.
public class ListUsersCommand implements Command {
    /**
     * ListarUsuariosComando: Comando concreto para listar los usuarios registrados.
     */
    @Override
    public void execute() {
        // Obtiene la lista de usuarios y la imprime.
        List<User> userList = DataBase.getInstance().getUsers();
        System.out.println("Lista de Usuarios:");
        for (User user : userList) {
            System.out.println("Nombre: "+user.getName()+", Email: "+user.getEmail());
        }
    }
}
