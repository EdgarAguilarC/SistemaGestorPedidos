
package sistemagestionpedidos;

public class ConexionBD {

    private static ConexionBD instancia;

    private ConexionBD() {
        System.out.println("Componente de conexión inicializado.");
    }

    public static synchronized ConexionBD getInstancia() {
        if (instancia == null) {
            instancia = new ConexionBD();
        }

        return instancia;
    }

    public void conectar() {
        System.out.println("Conexión preparada para la base de datos.");
    }
}
