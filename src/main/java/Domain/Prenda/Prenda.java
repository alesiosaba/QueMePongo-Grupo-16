package Domain.Prenda;

import Domain.CriterioUso;

import static java.util.Objects.requireNonNull;

public class Prenda {
    TipoPrenda tipo;
    Material material;
    Trama trama;
    Color color;
    Color colorSecundario;
    Integer temperaturaMaxima;
    // lo usamos para filtrar por criterio de uso en los guardarropas
    CriterioUso criterioUso;

    public Boolean aptaTemperatura(Integer temperaturaActual) {
        return this.temperaturaMaxima < temperaturaActual;
    }

    public Categoria categoria(){ return tipo.getCategoria(); }

    public Prenda(TipoPrenda tipo, Material material,Trama trama ,Color color, Color colorSecundario) {
        this.tipo = requireNonNull(tipo,"el tipo de prenda es obligatorio");
        this.material = requireNonNull(material,"el material es obligatorio");
        this.trama = trama;
        this.color = requireNonNull(color,"el color es obligatorio");
        this.colorSecundario = colorSecundario;
    }

    public Integer getTemperatura() {
        return temperaturaMaxima;
    }

}
