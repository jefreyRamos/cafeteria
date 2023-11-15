package co.edu.uniquindio.poo;

public class Fruta extends Producto implements Impuesto {
    public double peso;

    public Fruta(String nombre, double valor, double peso) {
        super(nombre, valor);
        this.peso = peso;
        assert nombre != null;
        assert valor >= 0;
        assert peso >= 0;
    }

    public double calcularImpuesto() {
        double impuestoBase = 0.07;
        double descuentoPorPeso = Math.min(0.03 * (peso - 3), 0.03 * 3);
        return valor * (1 + impuestoBase - descuentoPorPeso);
    }

    @Override
    double calcularPrecio() {
        return valor * peso;
    }
}
