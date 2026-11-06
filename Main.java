
package sistemagestionpedidos;

public class Main {

    public static void main(String[] args) {

        // Crear la fábrica de pedidos
        PedidoFactory fabrica = new PedidoFactory();

        // Crear el administrador de eventos
        Evento evento = new Evento();

        // Registrar usuarios suscritos
        Usuario usuario1 = new Usuario("Carlos");
        Usuario usuario2 = new Usuario("María");

        evento.suscribir(usuario1);
        evento.suscribir(usuario2);

        // Obtener la instancia Singleton
        ConexionBD conexion = ConexionBD.getInstancia();
        conexion.conectar();

        ConexionBD conexion2 = ConexionBD.getInstancia();

        System.out.println( "¿Es la misma instancia? " + (conexion == conexion2));
        
        // Crear el sistema de pedidos
        SistemaPedidos sistema = new SistemaPedidos(fabrica, evento);

        // Registrar un pedido normal
        sistema.registrarPedido(
                "normal", 1, "Juan Pérez", 850.00);

        // Registrar un pedido urgente
        sistema.registrarPedido(
                "urgente", 2, "Ana López", 1250.50);
        evento.cancelarSuscripcion(usuario2);

        System.out.println("\nMaría canceló su suscripción.");

         sistema.registrarPedido(
        "normal", 3, "Pedro García", 400.00);
         // Registrar un pedido especial
         sistema.registrarPedido(
        "especial", 4, "Laura Martínez", 1800.00);
        
         }
        }
