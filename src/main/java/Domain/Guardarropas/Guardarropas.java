package Domain.Guardarropas;

import Domain.Atuendo;
import Domain.CriterioUso;
import Domain.Prenda.Prenda;

import java.util.ArrayList;
import java.util.List;

public class Guardarropas {

  // lista de prendas que se almacenan en el guardarropas
  private List<Prenda> prendas = new ArrayList<>();

  // define el uso de las prendas que se almacenan
  private CriterioUso criterioUso;

  // son las propuestas de modificacion (pendientes y aceptadas)
  // cuando se rechaza una propuesta es eliminada de esta lista
  private List<Propuesta> propuestas = new ArrayList<>();

  public void guardarPropuesta(Propuesta unaPropuesta){ this.propuestas.add(unaPropuesta); }

  public void aceptarPropuesta(Propuesta unaPropuesta){
    // le indicamos a la propuesta el guardarropa sobre el que hace efecto
    unaPropuesta.aceptar(this);
  }

  public void rechazarPropuesta(Propuesta unaPropuesta){
    // al rechazar la propuesta se borra de la lista
    this.propuestas.remove(unaPropuesta);
  }

  public void deshacerPropuesta(Propuesta unaPropuesta){
    // le indicamos a la propuesta el guardarropa sobre el que hace efecto
    unaPropuesta.deshacer(this);
  }

  public void agregarPrenda(Prenda unaPrenda){ this.prendas.add(unaPrenda); }

  public void quitarPrenda(Prenda unaPrenda){ this.prendas.remove(unaPrenda); }

  // este metodo genera todas las combinaciones posibles con las prendas del guardaropa
  public List<Atuendo> todasLasPosiblesCombinaciones(){
    // TODO
    List<Atuendo> combinaciones = new ArrayList<>();
    return combinaciones;
  }

  public Guardarropas(CriterioUso criterioUso) {
    this.criterioUso = criterioUso;
  }
}