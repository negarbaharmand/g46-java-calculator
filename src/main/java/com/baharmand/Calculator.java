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


            System.out.println("Choose the operation:");
            System.out.println("1 for (+)");
            System.out.println("2 for (-)");
            System.out.println("3 for (*)");
            System.out.println("4 for (/)");
            int choose = scanner.nextInt();



            float result;
            switch (choose) {
                case 1:
                    result = performAddition(scanner);
                    break;
                case 2:
                    result = performSubtraction(scanner);
                    break;
                case 3:
                    result = performMultiplication(scanner);
                    break;
                case 4:
                    result = performDivision(scanner);
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


    //Declare different methods
    public static float performAddition(Scanner scanner) {
        System.out.println("Enter the numbers separated by spaces:");
        String input = scanner.nextLine();
        //Split the input string into an array of substrings
        String[] numberStrings = input.split(" ");
        float[] numbers = new float[numberStrings.length];
        for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Float.parseFloat(numberStrings[i]);
        }
        return add(numbers);
    }
    public static float performSubtraction(Scanner scanner) {
        System.out.println("Enter the numbers (separated by spaces):");
        scanner.nextLine(); // Consume the newline character
        String input = scanner.nextLine();
        String[] numberStrings = input.split(" ");
        float[] numbers = new float[numberStrings.length];
        for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Float.parseFloat(numberStrings[i]);
        }
        return subtract(numbers);
    }

    public static float performMultiplication(Scanner scanner) {
        System.out.println("Enter the first number:");
        float num1 = scanner.nextFloat();
        System.out.println("Enter the second number:");
        float num2 = scanner.nextFloat();
        return multiply(num1, num2);
    }

    public static float performDivision(Scanner scanner) {
        System.out.println("Enter the first number:");
        float num1 = scanner.nextFloat();
        System.out.println("Enter the second number:");
        float num2 = scanner.nextFloat();
        return divide(num1, num2);
    }


    //Handling multiple inputs
    public static float add(float... numbers) {
        float sum = 0.0f;
        for (float num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static float subtract(float... numbers) {
        float sum = 0.0f;
        for (float num : numbers) {
            sum -= num;
        }
        return sum;
    }

    public static float multiply(float num1, float num2) {
        return num1 * num2;
    }

    public static float divide(float num1, float num2) {
        if (num2 == 0.0f) {
            System.out.println("Error: Division by zero");
            return Float.MIN_VALUE; // indicate an error condition
        }else {
        return num1 / num2;
    }
}}