package Domain.Prenda;

public class TipoPrenda{
  Categoria categoria;
  TipoDePrenda tipoDePrenda;
  public TipoPrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  public Categoria getCategoria() {
    return this.categoria;
  }
}
