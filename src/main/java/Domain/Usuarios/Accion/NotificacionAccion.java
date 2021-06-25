package Domain.Usuarios.Accion;

import Domain.Usuarios.Usuario;

import java.util.List;

public class NotificacionAccion implements Accion {
  NotificacionService notificador = new NotificacionService();

  @Override
  public void realizarAccion(List<String> alertasActuales, Usuario usuario) {
    if(alertasActuales.contains("STORM"))
        notificador.notify("Lleva tambien un paraguas porque hay alerta de tormenta.");
    if(alertasActuales.contains("HAIL"))
      notificador.notify("Evita salir con el auto porque hay alerta de granizo.");
  }
}
