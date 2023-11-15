package co.edu.uniquindio.poo;

public class BebidaAzucarada extends Bebida{
    public double contenidoAzucar;

    public BebidaAzucarada(String nombre, double valor, double contenidoAzucar) {
        super(nombre, valor);
        this.contenidoAzucar = contenidoAzucar;
    }

    public double calcularImpuesto() {
        double impuestoBase = 0.05;
        double impuestoAdicional = (contenidoAzucar > 0.35) ? 0.2 : 0.0;
        return valor * (impuestoBase + impuestoAdicional);
    }
    
    @Override
    double calcularPrecio() {
        return valor;
    }
}
