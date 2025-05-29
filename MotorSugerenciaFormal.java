import java.util.List;

public class MotorSugerenciaFormal extends MotorSugerencias {

  public MotorSugerenciaFormal(List<Prenda> prendas) {
    super(prendas);
  }
  @Override
  public Atuendo generarSugerencia(Usuario usuario) {
    if(usuario.getEdad() > 55) {
      return generarSugerenciaFormal();
    } else {
      return super.generarSugerencia(usuario);
    }
  }

  public Atuendo generarSugerenciaFormal() {
    return generarAtuendo(prendas.stream().filter(prenda->prenda.esFormal()).toList());
  }
}
