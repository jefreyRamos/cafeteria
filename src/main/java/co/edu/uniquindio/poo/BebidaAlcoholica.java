package co.edu.uniquindio.poo;

public class BebidaAlcoholica extends Bebida{
    public final double contenidoAlcohol;

    public BebidaAlcoholica(String nombre, double valor, double contenidoAlcohol) {
        super(nombre, valor);
        this.contenidoAlcohol = contenidoAlcohol;
    }

    @Override
    public double calcularImpuesto() {
        throw new UnsupportedOperationException("Unimplemented method 'calcularImpuesto'");
    }

    @Override
    double calcularPrecio() {
        throw new UnsupportedOperationException("Unimplemented method 'calcularPrecio'");
    }

    public double getContenidoAlcohol() {
        return contenidoAlcohol;
    }
}
