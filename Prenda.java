public class Prenda {
  public TipoPrenda tipoPrenda;
  public Material material;
  public Trama trama;
  public Color colorPrimario;
  public Color colorSecundario;
  public Formalidad formalidad;

  public Prenda(TipoPrenda tipoPrenda, Material material, Trama trama, Color colorPrimario, Color colorSecundario, Formalidad formalidad) {
    this.tipoPrenda = tipoPrenda;
    this.material = material;
    this.trama = trama;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
    this.formalidad = formalidad;
  }

  public boolean esSuperior() { return tipoPrenda.categoria == Categoria.PARTESUPERIOR; }
  public boolean esInferior() { return tipoPrenda.categoria == Categoria.PARTEINFERIOR; }
  public boolean esCalzado() { return tipoPrenda.categoria == Categoria.CALZADO; }

  public boolean esFormal() { return formalidad == Formalidad.FORMAL; }

}
