package Problema1;

public class EmpleadoTiempoCompleto extends Empleado {
    private double bono;

    public EmpleadoTiempoCompleto(String nombre, double salarioBase, double bono){
        this.bono = bono;
    }

    public double calcularSalario(double salarioBase, double bono){
        return salarioBase + bono;
    }

    @Override
    public String toString(String nombre, calcularSalario()){
        return "nombre: " + nombre +
               "Salario Total: " + calcularSalario();
    }
}
