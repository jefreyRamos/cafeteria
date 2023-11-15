package co.edu.uniquindio.poo;

public class Agua extends Bebida{
    public Agua(String nombre, double valor) {
        super(nombre, valor);
    }

    public double calcularImpuesto() {
        return 0.0;
    }

    @Override
    double calcularPrecio() {
        return valor;
    }
    
}
