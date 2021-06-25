package Domain;

import Domain.Usuarios.RepositorioUsuarios;

import java.util.Timer;
import java.util.TimerTask;

// MAIN PARA PLANIFICACION INTERNA
// La planificacion se configura de manera interna,
// externamente solo se ejecuta el .jar

// se utiliza para tareas menos robustas

// ventaja: es mas facil de configurar en comparacion a planificacion externa
// desventaja: es necesario que el proceso java se encuentre corriendo constantemente
// desventaja2: es mas propenso a desincronizaciones

public class QueMePongoApp2 {

  public static void main(String[] args) {
    RepositorioUsuarios repositorioUsuarios = new RepositorioUsuarios();

    TimerTask task = new TimerTask() {
      @Override
      public void run() {
        repositorioUsuarios.actualizarSugerenciasDiarias();
      }
    };
    Timer timer = new Timer("Timer");

    long interval = 5000L; // 5000 ms -> 5 seg
    timer.schedule(task, 0L, interval);

  }
}
