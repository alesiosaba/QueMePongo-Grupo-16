package Domain.Usuarios.Accion;
import Domain.Usuarios.Usuario;

import java.util.List;

public interface Accion {
  void realizarAccion(List<String> alertasActuales, Usuario usuario);
}
