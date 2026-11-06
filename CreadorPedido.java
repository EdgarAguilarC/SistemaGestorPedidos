
package sistemagestionpedidos;

public interface CreadorPedido {

    Pedido crear(int id, String nombreCliente, double total);
}
