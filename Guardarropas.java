import java.util.List;
import java.util.Random;

public class Guardarropas {
  public List<Prenda> prendas;
  public final MotorSugerencias motorSugerencias;

  public Guardarropas(MotorSugerencias motorSugerencias) {
    this.motorSugerencias = motorSugerencias;
  }

  public Atuendo generarSugerencia() {
    return motorSugerencias.generarAtuendo(prendas);
  }

}
