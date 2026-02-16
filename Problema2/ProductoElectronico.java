package Problema2;

public class ProductoElectronico extends Producto{
    private int mesesGarantia;

    public ProductoElectronico(int mesesGarantia, double precio){
        this.mesesGarantia = 0;
    }

    public double calcularPrecioConGarantia(int mesesGarantia, double precio){
        if(mesesGarantia > 12){
            precio = precio + 50;
        }
    }

    public String obtenerInformacion(String nombre, double precio, int mesesGarantia){
        return "Producto: " + nombre + "Precio: " + precio + "Garantia: " + mesesGarantia;
    }
}
