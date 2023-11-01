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
}
