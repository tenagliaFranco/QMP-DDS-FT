public class Usuario {
  public Guardarropas guardarropas;
  public int edad;
  private MotorSugerencias motorSugerencias;

  public Usuario(Guardarropas guardarropas, int edad, MotorSugerencias motorSugerencias) {
    this.guardarropas = guardarropas;
    this.edad = edad;
    this.motorSugerencias = motorSugerencias;
  }

  public int getEdad() {
    return edad;
  }

  public Atuendo recibirSugerenciaGuardarropas() {
    return guardarropas.generarSugerencia();
  }

  public Atuendo recibirSugerencia() {
    return motorSugerencias.generarSugerencia(this);
  }

  public void setMotorSugerencias(MotorSugerencias motorSugerencias) {
    this.motorSugerencias = motorSugerencias;
  }
}
