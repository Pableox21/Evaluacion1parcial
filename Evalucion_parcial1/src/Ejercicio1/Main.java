package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Empleado[] empleados ={
        new Empleado("Mattew", 22, 2900),
        new Empleado("Ruben",30,3500),
        new Empleado("Jazmin",20,2500),
        new Empleado("Guz",28,3000)
    };
        for (Empleado empleado:empleados){
            empleado.imprimir();
            empleado.aumentoSalario();
        }
    }
}
