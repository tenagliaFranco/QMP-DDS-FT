public class Atuendo {
  public Prenda superior;
  public Prenda inferior;
  public Prenda calzado;

  public Atuendo(Prenda superior, Prenda inferior, Prenda calzado) {
    this.superior = superior;
    this.inferior = inferior;
    this.calzado = calzado;
  }

  public boolean aptoParaTemperatura(int temperatura) {
    return superior.aptoParaTemperatura(temperatura)
        && inferior.aptoParaTemperatura(temperatura)
        && calzado.aptoParaTemperatura(temperatura);
  }
}
