package Problema1;

public class EmpleadoMedioTiempo extends Empleado{
    private int horasTrabajadas;

    public EmpleadoMedioTiempo(String nombre, double salarioBase, int horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSalario(double salarioBase, int horasTrabajadas){
        return salarioBase * horasTrabajadas;
    }

    @Override
    public String toString(String nombre, double calcularSalario()){
        return "Nombre: " + nombre +
                "\nSalario Total: " + calcularSalario();
    }
}