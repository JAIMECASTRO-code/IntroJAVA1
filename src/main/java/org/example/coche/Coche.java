package org.example.coche;
//atributos del vehiculo//
public class Coche {
    private String marca;
    private String modelo;
    private int año;
    private double kilometraje;

    public Coche(String marca, String modelo, int año, double kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.kilometraje = kilometraje;
    }
//constructor que inicialice los atributos//
    public double conducir (double km) {
        if(km > 0) {
            this.kilometraje = this.kilometraje + km;
        }
        return  km;
    }
//metodo para mostrar informacion//
    public void printInformacion() {
        System.out.println("Marca: " + marca + "/nModelo: " + modelo + "/nAño:" + año + "/nkilometraje: /n" + kilometraje);
    }
}
