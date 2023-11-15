package co.edu.uniquindio.poo;

public class BebidaNacional extends BebidaAlcoholica{
    public BebidaNacional(String nombre, double valor, double contenidoAlcohol) {
        super(nombre, valor, contenidoAlcohol);
        assert nombre != null;
        assert valor >= 0;
        assert contenidoAlcohol >= 0;
    }

    public double calcularImpuesto() {
        double impuesto = Math.min(0.5, contenidoAlcohol) * 0.02;
        return valor * impuesto;
    }

    @Override
    double calcularPrecio() {
        return valor;
    }
    
}
