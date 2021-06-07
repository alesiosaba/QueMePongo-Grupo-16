package Domain.Guardarropas;

import Domain.Prenda.Prenda;

public class PropuestaQuitar implements Propuesta{
  private boolean aceptada;
  private Prenda prenda;

  public void aceptar(Guardarropas unGuardarropa){
    aceptada = true;

    unGuardarropa.quitarPrenda(this.prenda);
  }

  public void deshacer(Guardarropas unGuardarropa){
    aceptada = false;

    unGuardarropa.agregarPrenda(this.prenda);
  }
}