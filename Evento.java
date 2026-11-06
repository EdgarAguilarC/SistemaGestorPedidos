package sistemagestionpedidos;

import java.util.ArrayList;
import java.util.List;

public class Evento implements PublicadorEventos {

    private List<Suscriptor> suscriptores;

    public Evento() {
        suscriptores = new ArrayList<>();
    }

    public void suscribir(Suscriptor suscriptor) {
        if (suscriptor != null && !suscriptores.contains(suscriptor)) {
            suscriptores.add(suscriptor);
        }
    }

    public void cancelarSuscripcion(Suscriptor suscriptor) {
        suscriptores.remove(suscriptor);
    }

    @Override
    public void notificarTodos(String mensaje) {
        for (Suscriptor suscriptor : suscriptores) {
            suscriptor.notificar(mensaje);
        }
    }
}