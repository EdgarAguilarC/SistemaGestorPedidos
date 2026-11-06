package sistemagestionpedidos;

public class SistemaPedidos {

    private PedidoFactory fabrica;
    private PublicadorEventos evento;

    public SistemaPedidos(PedidoFactory fabrica, PublicadorEventos evento) {
        this.fabrica = fabrica;
        this.evento = evento;
    }

    public Pedido registrarPedido(String tipo, int id,
            String nombreCliente, double total) {

        Pedido pedido = fabrica.crearPedido(
                tipo, id, nombreCliente, total);

        System.out.println("\nPedido registrado correctamente:");

        pedido.mostrarInformacion();

        evento.notificarTodos(
                "Se ha registrado el pedido número "
                + pedido.getId()
                + " para el cliente "
                + pedido.getNombreCliente() + ".");

        return pedido;
    }
}