package org.example;

public class Strings {

    public static void main(String[] args) {

        String name = "sergi";

        String surname = new String("virgy");
        String fullname = name + " " + surname;

        System.out.println(fullname);
        if (name.equals("sergi")) {
            System.out.println("el nombre es sergi");
        }
    }
}
