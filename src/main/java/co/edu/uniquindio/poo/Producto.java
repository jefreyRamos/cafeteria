package co.edu.uniquindio.poo;

public abstract class Producto {
    protected final String nombre;
    protected double valor;

    public Producto(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    abstract double calcularPrecio();

    public String getNombre() {
        return nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
