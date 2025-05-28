import static java.util.Objects.requireNonNull;

public class Borrador {
  public TipoPrenda tipoPrenda;
  public Material material;
  public Trama trama;
  public Color colorPrimario;
  public Color colorSecundario = null;

  public Borrador(TipoPrenda tipoPrenda) {
    this.tipoPrenda = tipoPrenda;
  }

  public void especificarMaterial(Material material) {
    this.material = requireNonNull(material);
  }

  public void especificarTrama(Trama trama) {
    this.trama = (trama == null) ? Trama.LISA : trama;
  }

  public void especificarColorPrimario(Color color) {
    this.colorPrimario = requireNonNull(color);
  }

  public void especificarColorSecundario(Color color) {
    this.colorSecundario = color;
  }

  public Prenda crearPrenda() {
    return new Prenda(tipoPrenda, material, trama, colorPrimario, colorSecundario)
  }
}
