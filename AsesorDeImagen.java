import java.util.List;

public class AsesorDeImagen {
  private ServicioMeteorologico servicioMeteorologico;

  public AsesorDeImagen(ServicioMeteorologicoAccuWeather servicioMeteorologico) {
    this.servicioMeteorologico = servicioMeteorologico;
  }

  public Atuendo sugerirAtuendo(String direccion, Guardarropas guardarropas) {
    EstadoDelTiempo estadoDelTiempo = servicioMeteorologico
        .obtenerCondicionesClimaticas(direccion);

    List<Atuendo> combinaciones = guardarropas.todasLasPosiblesCombinaciones()
    return combinaciones
        .filter(combinacion -> combinacion.aptoParaTemperatura(estadoDelTiempo.temperatura))
        .first();

  }
}
