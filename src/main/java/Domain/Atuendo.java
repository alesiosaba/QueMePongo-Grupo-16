package Domain;

import Domain.Prenda.Prenda;

import java.util.List;

public class Atuendo {

  // lista de prendas que pueden ser inferiores, superiores, calzado, etc
  private List<Prenda> prendas;

  // este metodo verifica que el atuendo sea apto para una temperatura
  // todas las prendas del atuendo deben ser aptas para esa temperatura

  public boolean aptoParaTemperatura(Integer temperaturaActual){
    return prendas
        .stream()
        .allMatch(prenda -> prenda.aptaTemperatura(temperaturaActual));
  }

}