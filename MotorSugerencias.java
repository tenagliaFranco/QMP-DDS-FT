import java.util.List;
import java.util.Random;

public class MotorSugerencias {
  public List<Prenda> prendas;

  public MotorSugerencias(List<Prenda> prendas) {
    this.prendas = prendas;
  }

  public Atuendo generarSugerencia(Usuario usuario) {
    return generarAtuendo(prendas);
  }

  public Atuendo generarAtuendo(List<Prenda> prendas) {
    Random random = new Random();
    return new Atuendo(getPrendaRandom(superiores(prendas)), getPrendaRandom(inferiores(prendas)), getPrendaRandom(calzados(prendas)));
  }

  private List<Prenda> superiores(List<Prenda> prendas) {
    return prendas.stream().filter(prenda -> prenda.esSuperior()).toList();
  }
  private List<Prenda> inferiores(List<Prenda> prendas) {
    return prendas.stream().filter(prenda -> prenda.esInferior()).toList();
  }
  private List<Prenda> calzados(List<Prenda> prendas) {
    return prendas.stream().filter(prenda -> prenda.esCalzado()).toList();
  }

  private Prenda getPrendaRandom(List<Prenda> prendas) {
    Random r = new Random();
    return prendas.get(r.nextInt(prendas.size()));
  }

}
