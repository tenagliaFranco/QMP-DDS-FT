import java.time.LocalDateTime;

public class RespuestaMeteorologica {
  public EstadoDelTiempo estadoDelTiempo;
  public LocalDateTime proximaExpiracion;

  public RespuestaMeteorologica(EstadoDelTiempo estadoDelTiempo, LocalDateTime proximaExpiracion) {
    this.estadoDelTiempo = estadoDelTiempo;
    this.proximaExpiracion = proximaExpiracion;
  }

  public EstadoDelTiempo getEstadoDelTiempo() {
    return estadoDelTiempo;
  }

  public boolean expiro() {
    return proximaExpiracion.isAfter(LocalDateTime.now());
  }
}
