package model;

public class Gasto {
    private double monto;
    private String descripcion;

    public Gasto(double monto, String descripcion) {
        this.monto = monto;
        this.descripcion = descripcion;
    }

    public double getMonto() {
        return monto;
    }
}
