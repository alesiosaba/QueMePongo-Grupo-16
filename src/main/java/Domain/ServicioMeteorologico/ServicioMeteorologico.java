package Domain.ServicioMeteorologico;

import java.util.List;

public interface ServicioMeteorologico {
    EstadoDelTiempo estadoDelTiempo(String ubicacion);
    List<String> actualizarAlertasMeteorologicas(String ubicacion);
}
