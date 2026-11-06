
package sistemagestionpedidos;

public class CreadorPedidoNormal implements CreadorPedido {

    @Override
    public Pedido crear(int id, String nombreCliente, double total) {
        return new PedidoNormal(id, nombreCliente, total);
    }
}
