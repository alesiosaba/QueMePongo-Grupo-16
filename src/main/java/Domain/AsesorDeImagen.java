package Domain;

import Domain.Guardarropas.Guardarropas;
import Domain.ServicioMeteorologico.EstadoDelTiempo;
import Domain.ServicioMeteorologico.ServicioMeteorologico;

import java.util.List;
import java.util.stream.Collectors;

public class AsesorDeImagen {
  private ServicioMeteorologico servicioMeteorologico;

  // se asigan la API de clima por constructor

  public Atuendo sugerirAtuendo(String direccion, Guardarropas guardarropas) {

    EstadoDelTiempo estadoDelTiempo = this.servicioMeteorologico.estadoDelTiempo(direccion);

    Integer temperatura = estadoDelTiempo.getTemperatura();

    List<Atuendo> combinaciones = guardarropas.todasLasPosiblesCombinaciones();

    // retorna una combinacion posible ("Atuendo") se elige uno al azar
    return combinaciones
        .stream()
        .filter( combinacion -> combinacion.aptoParaTemperatura(temperatura) )
        .collect(Collectors.toList())
        .get(0);
  }
}

