package org.example;

public class Arrays {
    public static void main(String[]args){
        //Definir un array de 5 numeros(llenos)
        //Un array de 5 nombres de ciudades(llenos)
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array de numbers:");
        for (int ignored : numbers) {
            System.out.println(numbers);
        }
        String[] cities = {"Brooklyn","NY", "Beirut", "Madrid", "Valencia"};
        System.out.println("\nArray de cities:");
        for (String ignored: cities) {
            System.out.println(cities);
        }
    }
}
