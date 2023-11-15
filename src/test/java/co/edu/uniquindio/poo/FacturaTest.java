package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

public class FacturaTest {
    public static final Logger LOG = Logger.getLogger(FacturaTest.class.getName());

    @Test
    public void resultadoValido() {
        LOG.info("iniciando test resultado valido");
        
        Producto aguaMineral = new Agua("Agua", 3000);
        Producto jugoManzana = new BebidaAzucarada("Jugo", 4500, 0.3);
        Producto cervezaNacional = new BebidaNacional("Cerveza Colombia", 3000, 0.05);
        Producto panIntegral = new Panaderia("Pan", 2.5, true);
        Cliente estudiante = new Estudiante("999999999", "Estudiante", "Ejemplo", "estudiante@ejemplo.com", 3);
        Factura factura = new Factura(estudiante);

        factura.agregarProducto(aguaMineral);
        factura.agregarProducto(jugoManzana);
        factura.agregarProducto(cervezaNacional);
        factura.agregarProducto(panIntegral);

        double totalEsperado = 10349.889599999999;
        double totalCalculado = factura.calcularTotal();
        assertEquals(totalEsperado, totalCalculado, 0.01);

        LOG.info("finalizando test resultado valido");
    }
}