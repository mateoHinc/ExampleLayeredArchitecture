package Domain;

// Capa de Dominio: Define las entidades del negocio, como Usuario.

public class User {
    /**
     * Clase Usuario: Representa un usuario en el sistema con nombre y email.
     */
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
