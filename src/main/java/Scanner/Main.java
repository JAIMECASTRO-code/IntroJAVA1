package Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        String user;
        String password;

        byte i = 1;
        int maxAttempts = 3;

        while (i <= maxAttempts) {

            System.out.print("Username:");
            user = Scanner.nextLine();
            System.out.print("password:");
            password = Scanner.nextLine();

            if (user.equals("admin") && password.equals("1234")) {
                System.out.print("Log in okay");
                break;
            }

            if (i == maxAttempts) {
                System.out.print("Max attempts exceeded");
            }

            i++;
        }


    }
}