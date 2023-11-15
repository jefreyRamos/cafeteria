package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    private Cliente cliente;
    private List<Producto> productos;

    public Factura(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0.0;
    
        for (Producto producto : productos) {
            total += producto.calcularPrecio() + (producto instanceof Impuesto ? ((Impuesto) producto).calcularImpuesto() : 0);
        }
    
        double descuento = calcularDescuentoCliente();
        return total * (1 - descuento);
    }

    private double calcularDescuentoCliente() {
        if (cliente instanceof Estudiante) {
            int semestresCursados = ((Estudiante) cliente).semestresCursados;
            return semestresCursados * 0.012;
        } else if (cliente instanceof Profesor) {
            switch (((Profesor) cliente).categoria) {
                case AUXILIAR:
                    return 0.03;
                case ASISTENTE:
                    return 0.05;
                case ASOCIADO:
                    return 0.10;
                case TITULAR:
                    return 0.16;
                default:
                    return 0.0;
            }
        }
        return 0.0;
    }
    
}
