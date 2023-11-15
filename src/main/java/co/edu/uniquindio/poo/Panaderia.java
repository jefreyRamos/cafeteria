package co.edu.uniquindio.poo;

public class Panaderia extends Producto implements Impuesto {
    public boolean contieneConservantes;

    public Panaderia(String nombre, double valor, boolean contieneConservantes) {
        super(nombre, valor);
        this.contieneConservantes = contieneConservantes;
        assert nombre != null;
        assert valor >= 0;
    }

    public double calcularImpuesto() {
        double impuestoAdicional = (contieneConservantes) ? 0.18 : 0.0;
        return valor * (1 + impuestoAdicional);
    }

    @Override
    double calcularPrecio() {
        return valor + calcularImpuesto();
    }
}
