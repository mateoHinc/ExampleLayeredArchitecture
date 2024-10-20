package Persistence;

// Capa de Persistencia: Maneja el almacenamiento de datos.
// Se utiliza el patrón Singleton para asegurar que solo exista una instancia de BaseDatos.

import Domain.User;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    /**
     * Clase BaseDatos: Simula una base de datos usando el patrón Singleton.
     * Garantiza que solo haya una única instancia de la base de datos.
     */
    private static DataBase instance;
    private List<User> users;

    private DataBase() {
        users = new ArrayList<>();
    }

    public static DataBase getInstance() {
        // Implementación del Singleton. Si no existe una instancia, la crea.
        if (instance == null) {
           instance = new DataBase();
        }
        return instance;
    }

    public List<User> getUsers() {
        // Método para obtener la lista de usuarios almacenados.
        return users;
    }

    public void addUser(User user) {
        // Método para agregar un usuario a la base de datos.
        users.add(user);
    }

}
