
package sistemagestionpedidos;

public class PedidoUrgente extends Pedido {

    public PedidoUrgente(int id, String nombreCliente, double total) {
        super(id, nombreCliente, total);
    }

    @Override
    public String obtenerTipo() {
        return "Pedido Urgente";
    }
}

