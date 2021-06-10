package Domain.ServicioMeteorologico;
import Domain.Usuario.RepositorioUsuarios;

import java.util.ArrayList;
import java.util.List;

public class RegistroAlertasMetereologicas {
  private List<String> alertas = new ArrayList<>();
  private ServicioMeteorologico servicioMeteorologico;
  private RepositorioUsuarios usuarios;

  public RegistroAlertasMetereologicas(List<String> alertas, ServicioMeteorologico servicioMeteorologico) {
    this.alertas = alertas;
    this.servicioMeteorologico = servicioMeteorologico;
  }

  // Poder conocer cuáles son las últimas alertas meteorológicas publicadas en el sistema para estar informado
  public List<String> alertas(){ return alertas; }

  //Dispara un proceso que consulte y actualice la lista de alertas publicadas en el sistema
  public void actualizarAlertasMeteorologicas(){

    // se cargan las nuevas alertas meteorologicas
    this.alertas = this.servicioMeteorologico.actualizarAlertasMeteorologicas("Buenos Aires");
    // se disparan todas las acciones de cada usuario para las nuevas alertas
    realizarAccionesSobreAlertas(this.alertas);
  }

  public void realizarAccionesSobreAlertas(List<String> alertas){
    this.usuarios.getUsuarios().forEach(usuario -> usuario.realizarAccionesSobreAlertas(alertas));
  }
}
