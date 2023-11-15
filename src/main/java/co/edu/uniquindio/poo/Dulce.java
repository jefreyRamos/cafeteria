package co.edu.uniquindio.poo;

public class Dulce extends Producto implements Impuesto {
    private final double contenidoAzucar;

    public Dulce(String nombre, double valor, double contenidoAzucar) {
        super(nombre, valor);
        this.contenidoAzucar = contenidoAzucar;
        assert contenidoAzucar >= 0;
        assert nombre != null;
        assert valor >= 0;
    }

    // Implementación del método de la interfaz Impuesto para dulces
    public double calcularImpuesto() {
        double impuestoBase = 0.1;
        double impuestoAdicional = (contenidoAzucar > 0.5) ? 0.1 : 0.0;
        return valor * (impuestoBase + impuestoAdicional);
    }
    @Override
    double calcularPrecio() {
        return valor;
    }
}
