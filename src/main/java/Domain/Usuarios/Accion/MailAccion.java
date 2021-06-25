package Domain.Usuarios.Accion;

import Domain.Usuarios.Usuario;

import java.util.List;

public  class MailAccion implements Accion {
  MailSender mail;

  @Override
  public void realizarAccion(List<String> alertasActuales, Usuario usuario) {
    mail.enviar("midireccion","mi mensaje");
  }
}
