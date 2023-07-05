package com.baharmand;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println( "Hi " + name + "! Let's calculate stuff!" );
        boolean exit = false;
        while (!exit) {
            System.out.println("Enter the firs number:");
            Float num1 = scanner.nextFloat();

            System.out.println("Choose the operation:");
            System.out.println("1 for (+)");
            System.out.println("2 for (-)");
            System.out.println("3 for (*)");
            System.out.println("4 for (/)");
            int choose = scanner.nextInt();

            System.out.println("Enter the second number:");
            Float num2 = scanner.nextFloat();

            float result = 0.0f;
            if (choose == 1) {

                result = num1 + num2;

            }
            else if (choose == 2) {
                result = num1 - num2;
            }
            else if (choose == 3) {
                result = num1 * num2;
            }
            else if (choose == 4) {
                result = num1 / num2;
            } else {
                System.out.println("Operation is not valid!");
            }
            System.out.println("The result equals to " + result);

            System.out.println("Do you want to perform another calculation? (y/n)");
            String choice = scanner.next();

            if (choice.equalsIgnoreCase("n")) {
                exit = true;
            }
        }


        System.out.println("Exiting the program.");
    }
}
