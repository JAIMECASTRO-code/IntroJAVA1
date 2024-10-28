package org.example;

public class Bucles {
    public static  void main(String[] args) {
        for (int i = 5; i < 11; i++) {
            System.out.println("Number: " + i);
        }
        //imprimir solamente numeros pares del 5 al 10
        for (int i = 5; i < 11; i++){
            if (i % 2 == 0) {
                System.out.println("Es un numero par: " + i);
            }
        }
    }
}
