package co.edu.uniquindio.poo;

public class BebidaInternacional extends BebidaAlcoholica{
    public BebidaInternacional(String nombre, double valor, double contenidoAlcohol) {
        super(nombre, valor, contenidoAlcohol);
        assert nombre != null;
        assert valor >= 0;
        assert contenidoAlcohol >= 0;
    }

    public double calcularImpuesto() {
        return (valor * 1.3) * (1 + (0.3 * contenidoAlcohol));
    }

    @Override
    double calcularPrecio() {
        return valor;
    }
}
