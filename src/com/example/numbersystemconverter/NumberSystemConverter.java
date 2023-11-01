package com.example.numbersystemconverter;

import java.util.Scanner;

public class NumberSystemConverter {
    Scanner input = new Scanner(System.in);
    public String chooseOperation() {
        System.out.println("-----------------------------------------------------");
        System.out.println("Choose what operation you want to perform:");
        System.out.println();
        System.out.println("A. Convert from any system to the decimal system");
        System.out.println("B. Convert from decimal system to another system");
        System.out.println("C. Summing up numbers from different systems");
        System.out.println("D. Subtracting numbers from different systems");
        System.out.println("E. Multiplying numbers from different systems");
        System.out.println("F. Dividing numbers from different systems");
        System.out.println();
        System.out.println("W. Exit the program");
        return input.next();
    }

    int getRadix() {
        int radix;
        do {
            System.out.print("Enter the radix of the number system (2, 3, 4, 5, 6, 7, 8, 9, 10, 16): ");
            radix = input.nextInt();
        } while (!(radix >= 2 && radix <= 10 || radix == 16));
        return radix;
    }
    public void toDecimal() {
        int radix = getRadix();
        System.out.print("Enter the number in number system with radix " + radix + ": ");
        int number = input.nextInt(radix);
        System.out.println("The number converted to decimal system is " + number);
    }
    public void fromDecimal() {
        System.out.print("Enter the decimal number: ");
        int number = input.nextInt();
        int radix = getRadix();
        System.out.println("The number converted to number system with radix " + radix + " is " + Integer.toString(number, radix));
    }

    public int getFirstNumber(int radix) {
        System.out.print("Enter the first number in number system with radix " + radix + ": ");
        return input.nextInt(radix);
    }
    public int getSecondNumber(int radix) {
        System.out.print("Enter the second number in number system with radix " + radix + ": ");
        return input.nextInt(radix);
    }
    public void addNumbers() {
        int radix = getRadix();
        int number1 = getFirstNumber(radix);
        int number2 = getSecondNumber(radix);
        int sum = number1 + number2;
        System.out.println(Integer.toString(number1, radix) + " + " + Integer.toString(number2, radix) + " = " + Integer.toString(sum, radix));
    }
    public void subtractNumbers() {
        int radix = getRadix();
        int number1 = getFirstNumber(radix);
        int number2 = getSecondNumber(radix);
        int subtraction = number1 - number2;
        System.out.println(Integer.toString(number1, radix) + " - " + Integer.toString(number2, radix) + " = " + Integer.toString(subtraction, radix));
    }
    public void multiplyNumbers() {
        int radix = getRadix();
        int number1 = getFirstNumber(radix);
        int number2 = getSecondNumber(radix);
        int sum = number1 * number2;
        System.out.println(Integer.toString(number1, radix) + " * " + Integer.toString(number2, radix) + " = " + Integer.toString(sum, radix));
    }
    public void divideNumbers() {
        int radix = getRadix();
        int number1 = getFirstNumber(radix);
        int number2 = getSecondNumber(radix);
        if (number2 == 0) {
            System.out.println("The second number cannot be zero because you cannot divide by zero");
            return;
        }
        int sum = number1 / number2;
        System.out.println(Integer.toString(number1, radix) + " / " + Integer.toString(number2, radix) + " = " + Integer.toString(sum, radix));
    }
}
