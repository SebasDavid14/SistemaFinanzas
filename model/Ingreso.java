package model;

public class Ingreso {
    private double monto;
    private String descripcion;

    public Ingreso(double monto, String descripcion) {
        this.monto = monto;
        this.descripcion = descripcion;
    }

    public double getMonto() {
        return monto;
    }
}