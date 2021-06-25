package Domain.Usuarios;

import java.util.ArrayList;
import java.util.List;

public class RepositorioUsuarios {
  private List<Usuario> usuarios = new ArrayList<>();

  public void actualizarSugerenciasDiarias(){
    this.usuarios.stream().forEach(u -> u.actualizarSugerenciaDiaria());
  }

  public List<Usuario> getUsuarios() {
    return usuarios;
  }

  public void agregarUsuario(Usuario usuario){
    usuarios.add(usuario);
  }
}
