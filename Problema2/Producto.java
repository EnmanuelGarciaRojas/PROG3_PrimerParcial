package Problema2;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre(){
        return nombre;
    }

    public double getPrecio(){
        return precio;
    }

    public int getStock(){
        return stock;
    }

    public String setNombre(String nombre){
        this.nombre = nombre;
    }

    public double setPrecio(double precio){
        this.precio = 0;
    }

    public int setStock(int stock){
        this.nombre = 0;
    }

    public void reducirStock(int cantidad){
        
    }

}
