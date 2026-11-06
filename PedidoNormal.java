

package sistemagestionpedidos;

public class PedidoNormal extends Pedido {

    public PedidoNormal(int id, String nombreCliente, double total) {
        super(id, nombreCliente, total);
    }

    @Override
    public String obtenerTipo() {
        return "Pedido Normal";
    }
}


