package com.baharmand;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println( "Hi " + name + "! Let's calculate stuff!" );
        boolean exit = false;
        while (!exit) {
            System.out.println("Enter the first number:");
            float num1;

            try {
                num1 = scanner.nextFloat();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();
                continue; //Move to a new iteration
            }

            System.out.println("Choose the operation:");
            System.out.println("1 for (+)");
            System.out.println("2 for (-)");
            System.out.println("3 for (*)");
            System.out.println("4 for (/)");
            int choose = scanner.nextInt();

            System.out.println("Enter the second number:");
            float num2 = scanner.nextFloat();
            scanner.nextLine();

            float result =calculateResult(num1, num2, choose);
            // Handling errors
             if (result == Float.MIN_VALUE){
                System.out.println("Operation is not valid!");
            } else {
                 System.out.println("The result equals to " + result);
             }

            System.out.println("Do you want to perform another calculation? (y/n)");
            String choice = scanner.next();

            if (choice.equalsIgnoreCase("n")) {
                exit = true;
            }
        }


        System.out.println("Exiting the program.");
    }
    public static float calculateResult(float num1, float num2, int choose) {
        float result = 0.0f;

        if (choose == 1) {
            result = num1 + num2;
        } else if (choose == 2) {
            result = num1 - num2;
        } else if (choose == 3) {
            result = num1 * num2;
        } else if (choose == 4) {
            if (num2 == 0.0f) {
                System.out.println("Error: Division by zero");
                return Float.MIN_VALUE; //indicate an error condition
            }
            result = num1 / num2;
        } else {
            return Float.MIN_VALUE; //indicate an error condition
        }

        return result;
    }
}