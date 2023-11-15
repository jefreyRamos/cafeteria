package co.edu.uniquindio.poo;

public class Profesor extends Cliente implements Descuento {
    public final Categoria categoria;

    public Profesor(String cedula, String nombre, String apellido, String correo, Categoria categoria) {
        super(cedula, nombre, apellido, correo);
        this.categoria = categoria;
        assert categoria != null;
        assert cedula != null;
        assert nombre != null;
        assert apellido != null;
        assert correo != null;
    }

    public double calcularDescuento() {
        switch (categoria) {
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
}
