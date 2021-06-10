package Domain;

import Domain.Guardarropas.Guardarropas;

import java.util.List;

public class Usuario {

  // un usuario puede conocer mas de 1 guardarropas
  private List<Guardarropas> guardarropas;

  public void crearGuardarropa(CriterioUso criterioUso, List<Usuario> usuariosQueLoComparten){
      Guardarropas nuevoGuardarropas = new Guardarropas(criterioUso);

      // cada usuario debe conocer el nuevo guardarropa compartido
      usuariosQueLoComparten.forEach(usuario -> usuario.agregarUnGuardarropa(nuevoGuardarropas));
  }

  public void agregarUnGuardarropa(Guardarropas unGuardarropa){ guardarropas.add(unGuardarropa); }

}