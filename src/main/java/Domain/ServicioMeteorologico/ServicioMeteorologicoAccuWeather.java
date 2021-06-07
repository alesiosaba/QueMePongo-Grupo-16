package Domain.ServicioMeteorologico;

import java.util.HashMap;
import java.util.Map;

public class ServicioMeteorologicoAccuWeather implements ServicioMeteorologico {
  private AccuWeatherAPI apiClima = new AccuWeatherAPI();
  private Map<String, Object> condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina").get(0);

  @Override
  public EstadoDelTiempo estadoDelTiempo(String ubicacion) {

    HashMap<String, Object> temperatura = (HashMap<String, Object>) condicionesClimaticas.get("Temperature");
    Integer temperaturaActual = (Integer) temperatura.get("Value");

    return new EstadoDelTiempo(temperaturaActual);
  }
}