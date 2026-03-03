package service;

import java.util.List;
import model.Gasto;
import model.Ingreso;

public class ReporteService {

    public double calcularTotalIngresos(List<Ingreso> ingresos) {
        return ingresos.stream().mapToDouble(Ingreso::getMonto).sum();
    }

    public double calcularTotalGastos(List<Gasto> gastos) {
        return gastos.stream().mapToDouble(Gasto::getMonto).sum();
    }
}