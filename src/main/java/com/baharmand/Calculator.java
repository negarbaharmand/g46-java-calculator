package com.baharmand;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + "! Let's calculate stuff!");
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
                continue; // Move to a new iteration
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

            float result;
            switch (choose) {
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    break;
                case 4:
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operation!");
                    continue; // Move to a new iteration
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

    public static float add(float num1, float num2) {
        return num1 + num2;
    }

    public static float subtract(float num1, float num2) {
        return num1 - num2;
    }

    public static float multiply(float num1, float num2) {
        return num1 * num2;
    }

    public static float divide(float num1, float num2) {
        if (num2 == 0.0f) {
            System.out.println("Error: Division by zero");
            return Float.MIN_VALUE; // indicate an error condition
        }
        return num1 / num2;
    }
}