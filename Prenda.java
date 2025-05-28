public class Prenda {
  public TipoPrenda tipoPrenda;
  public Material material;
  public Trama trama;
  public Color colorPrimario;
  public Color colorSecundario;

  public Prenda(TipoPrenda tipoPrenda, Material material, Trama trama, Color colorPrimario, Color colorSecundario) {
    this.tipoPrenda = tipoPrenda
    this.material = material;
    this.trama = trama;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }
}
