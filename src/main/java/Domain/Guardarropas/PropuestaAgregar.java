package Domain.Guardarropas;

import Domain.Prenda.Prenda;

public class PropuestaAgregar implements Propuesta{
  private boolean aceptada;
  private Prenda prenda;

  public void aceptar(Guardarropas unGuardarropa){
    aceptada = true;

    unGuardarropa.agregarPrenda(this.prenda);
  }

  public void deshacer(Guardarropas unGuardarropa){
    aceptada = false;

    unGuardarropa.quitarPrenda(this.prenda);
  }

}