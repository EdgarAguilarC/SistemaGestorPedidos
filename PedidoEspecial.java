
package sistemagestionpedidos;

public class PedidoEspecial extends Pedido {

    public PedidoEspecial(int id, String nombreCliente, double total) {
        super(id, nombreCliente, total);
    }

    @Override
    public String obtenerTipo() {
        return "Pedido Especial";
    }
}
