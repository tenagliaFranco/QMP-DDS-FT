import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ServicioMeteorologicoAccuWeather implements ServicioMeteorologico {
  private Map<String, RespuestaMeteorologica> ultimasRespuestas = new HashMap<>();
  private LocalDateTime proximaExpiracion;
  private AccuWeatherAPI api;
  private Duration periodoDeValidez;

  public ServicioMeteorologicoAccuWeather(AccuWeatherAPI api, Duration periodoDeValidez, String direccion) {
    this.api = api;
    this.periodoDeValidez = periodoDeValidez;
  }

  public EstadoDelTiempo obtenerCondicionesClimaticas(String direccion) {
    if (!this.ultimasRespuestas.containsKey(direccion) || this.ultimasRespuestas.get(direccion).expiro()) {
      ultimasRespuestas.put(direccion, new RespuestaMeteorologica(consultarApi(direccion), proximaExpiracion()));
    }
    return this.ultimasRespuestas.get(direccion).getEstadoDelTiempo();
  }

  private EstadoDelTiempo consultarApi(String direccion) {
    Map<String, Object> respuesta = this.api.getWeather(direccion).get(0);
    int temperatura = (int) respuesta.get("Temperature");
    Humedad humedad = (double) respuesta.get("PrecipitationProbability") > 0.8 ? Humedad.LLUVIOSO : Humedad.SECO;
    return new EstadoDelTiempo(temperatura, humedad);
  }

  private LocalDateTime proximaExpiracion() {
    return LocalDateTime.now().plus(this.periodoDeValidez);
  }
}
