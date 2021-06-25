package Domain;

import Domain.Usuarios.RepositorioUsuarios;

// MAIN PARA PLANIFICACION EXTERNA
// Se debe configurar la planificacion de manera externa
// con alguna herramienta como "Crontab" y ejecutar el .jar

// se utiliza para tareas mas robustas

// desventaja: es mas complejo de configurar en comparacion a planificacion interna
// ventaja: no es necesario que el proceso java se encuentre corriendo constantemente
// porque depende solo del sistema operativo

public class QueMePongoApp {

  public static void main(String[] args) {
    RepositorioUsuarios repositorioUsuarios = new RepositorioUsuarios();

    repositorioUsuarios.actualizarSugerenciasDiarias();
  }

}
