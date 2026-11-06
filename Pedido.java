
package sistemagestionpedidos;

public abstract class Pedido {

    private int id;
    private String nombreCliente;
    private double total;

    public Pedido(int id, String nombreCliente, double total) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double getTotal() {
        return total;
    }

    public abstract String obtenerTipo();

    public void mostrarInformacion() {
        System.out.println("Número de pedido: " + id);
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Total: $" + String.format("%.2f", total));
        System.out.println("Tipo: " + obtenerTipo());
    }
}

