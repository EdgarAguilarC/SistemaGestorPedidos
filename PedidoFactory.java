
package sistemagestionpedidos;

import java.util.HashMap;
import java.util.Map;

public class PedidoFactory {

    private Map<String, CreadorPedido> creadores;

 
public PedidoFactory() {
    creadores = new HashMap<>();

    registrarCreador("normal", new CreadorPedidoNormal());
    registrarCreador("urgente", new CreadorPedidoUrgente());
    registrarCreador("especial", new CreadorPedidoEspecial());
}


    public void registrarCreador(String tipo, CreadorPedido creador) {
        if (tipo == null || creador == null) {
            throw new IllegalArgumentException(
                    "El tipo y el creador son obligatorios.");
        }

        creadores.put(tipo.toLowerCase(), creador);
    }

    public Pedido crearPedido(String tipo, int id,
                              String nombreCliente, double total) {

        if (tipo == null) {
            throw new IllegalArgumentException(
                    "El tipo de pedido no puede ser nulo.");
        }

        CreadorPedido creador = creadores.get(tipo.toLowerCase());

        if (creador == null) {
            throw new IllegalArgumentException(
                    "Tipo de pedido no válido: " + tipo);
        }

        return creador.crear(id, nombreCliente, total);
    }
}
