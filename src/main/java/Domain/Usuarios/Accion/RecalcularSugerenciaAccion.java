package Domain.Usuarios.Accion;

import Domain.Usuarios.Usuario;

import java.util.List;

public class RecalcularSugerenciaAccion implements Accion {

  @Override
  public void realizarAccion(List<String> alertasActuales, Usuario usuario){
    usuario.actualizarSugerenciaDiaria();
  }
}
