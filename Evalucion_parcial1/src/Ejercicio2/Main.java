package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo>veiculos=new ArrayList<>();
        veiculos.add(new Veiculo("Chevrolett","Camaro",4000));
        veiculos.add(new Veiculo("Ford","Maverick",3500));
        veiculos.add(new Veiculo("Nissan","Skyline",3000));
        veiculos.add(new Veiculo("Dodge","Charger",2500));
        Veiculo veiculoBarato=null;
        double precioMinimo=4001;
        for (Veiculo veiculo:veiculos){
            if (veiculo.getPrecio()>=2500 && veiculo.getPrecio()<=4000 && veiculo.getPrecio()<precioMinimo){
            veiculoBarato=veiculo;
            precioMinimo= veiculo.getPrecio();
            }
        }
        if (veiculoBarato!=null){
            System.out.println("El mas barato es: ");
            veiculoBarato.mostrarDetalles();}else {
            System.out.println("No se encontro ningun veiculo mas barato");
        }
    }
}

