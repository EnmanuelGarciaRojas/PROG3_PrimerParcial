package Problema2;

public class ProductoAlimento extends Producto{
    private String fechaVencimiento;

    public ProductoAlimento(){

    }

    public boolean estaProximoAVencer(String fechaVencimiento){
        if(fechaVencimiento == "02/2026" || fechaVencimiento == "03/2026"){
            return true;
        }

        return false;
    }

    public String obtenerInformacion(String nombre, double precio, String fechaVencimiento){
        return "Nombre: " + nombre + "Precio: " + precio + "Fecha de vencimiento: " + fechaVencimiento;
    }
}
