package Ejercicio2;

public class Veiculo {
    private String marca;
    private String modelo;
    private double precio;

    public Veiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
    public void mostrarDetalles(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Precio: "+precio);
    }
}
