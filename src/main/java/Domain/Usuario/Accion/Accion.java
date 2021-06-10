package Domain.Usuario.Accion;
import Domain.Usuario.Usuario;

import java.util.List;

public interface Accion {
  void realizarAccion(List<String> alertasActuales, Usuario usuario);
}
