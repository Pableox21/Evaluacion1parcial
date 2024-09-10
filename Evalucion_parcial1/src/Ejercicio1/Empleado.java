package Ejercicio1;

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void aumentoSalario(){
        if (this.salario<3000){
            this.salario*=1.10;
            System.out.println(nombre+" ha recibido un aumento."+"Nuevo salario: "+salario);
            }else {
            System.out.println(nombre+" no califico para un aumento");
        }
    }
    public void imprimir(){
        System.out.println("Empleado: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Salario: "+salario);
    }
}
