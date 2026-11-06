
package sistemagestionpedidos;

public class CreadorPedidoUrgente implements CreadorPedido {

    @Override
    public Pedido crear(int id, String nombreCliente, double total) {
        return new PedidoUrgente(id, nombreCliente, total);
    }
}
