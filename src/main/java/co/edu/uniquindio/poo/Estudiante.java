package co.edu.uniquindio.poo;

public class Estudiante extends Cliente implements Descuento {
    public int semestresCursados;

    public Estudiante(String cedula, String nombre, String apellido, String correo, int semestresCursados) {
        super(cedula, nombre, apellido, correo);
        this.semestresCursados = semestresCursados;
        assert semestresCursados >= 0;
        assert cedula != null;
        assert nombre != null;
        assert apellido != null;
        assert correo != null;
    }

    public double calcularDescuento() {
        return semestresCursados * 0.012;
    }
}
