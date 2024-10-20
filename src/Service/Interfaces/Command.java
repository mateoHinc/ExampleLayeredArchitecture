package Service.Interfaces;

// Capa de Servicio: Implementa la lógica de negocio.
// Se usa el patrón Command para encapsular las acciones como objetos.

public interface Command {
    /**
     * Interfaz Comando: Define el método ejecutar() que deben implementar todos los comandos.
     */
    void execute();
}
