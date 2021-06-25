package Domain.Usuarios;

import Domain.AsesorDeImagen;
import Domain.Atuendo;
import Domain.CriterioUso;
import Domain.Guardarropas.Guardarropas;
import Domain.Usuarios.Accion.Accion;

import java.util.List;

public class Usuario {

  // un usuario puede conocer mas de 1 guardarropas
  private List<Guardarropas> guardarropas;
  private Atuendo sugerenciaDiaria;
  private AsesorDeImagen asesorDeImagen = new AsesorDeImagen();
  private String direccion;
  private List<Accion> acciones;


  public void crearGuardarropa(CriterioUso criterioUso, List<Usuario> usuariosQueLoComparten){
    Guardarropas nuevoGuardarropas = new Guardarropas(criterioUso);

    // cada usuario debe conocer el nuevo guardarropa compartido
    usuariosQueLoComparten.forEach(usuario -> usuario.agregarUnGuardarropa(nuevoGuardarropas));
  }

  public void agregarUnGuardarropa(Guardarropas unGuardarropa){ guardarropas.add(unGuardarropa); }

  public void actualizarSugerenciaDiaria() {
    // guardarropas.get(0) elegimos un guardarropas al azar
    this.sugerenciaDiaria = asesorDeImagen.sugerirAtuendo(direccion, guardarropas.get(0));
  }

  public void realizarAccionesSobreAlertas(List<String> alertasActuales){
    this.acciones.stream().forEach(accion -> accion.realizarAccion(alertasActuales, this));
  }

  public void agregarAccion(Accion unaAccion){
    this.acciones.add(unaAccion);
  }

  public void borrarAccion(Accion unaAccion){
    this.acciones.remove(unaAccion);
  }
}
