package org.example;

public class PrimitiveTypes {
    public static void main(String[] args) {
        boolean isActive = true;
        System.out.println(isActive);
        byte Primer = 0;
        System.out.println(Primer);
        Short Corto = 66;
        System.out.println(Corto);
        int variable = 455;
        System.out.println(variable);
        long largo = 3243324;
        System.out.println(largo);
        double doble = 34.56;
        ;
        System.out.println(doble);
        float flotante = 42.34f;
        ;
        System.out.println(flotante);
        char letras = 'S';
        System.out.println(letras);


        //variable la edad de un usuario con la minima memoria posible
        //imprimir el usuario es mayor de edad si 18 o +
        //imprimir el usuario es menor de edad si 17 o -
        byte edad = 18;
        if (edad >= 18) {
            System.out.println("El usuario es mayor de edad");
        } else {

            System.out.println("El usuario es menor de edad");
        }
    }
}


