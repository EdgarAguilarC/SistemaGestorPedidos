
package sistemagestionpedidos;

public class CreadorPedidoEspecial implements CreadorPedido {

    @Override
    public Pedido crear(int id, String nombreCliente, double total) {
        return new PedidoEspecial(id, nombreCliente, total);
    }
}
