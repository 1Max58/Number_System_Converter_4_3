package com.example.numbersystemconverter;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        NumberSystemConverter converter = new NumberSystemConverter();
        String operation;
        do {
            operation = converter.chooseOperation();
            switch (operation) {
                case "A":
                    converter.toDecimal();
                    break;
                case "B":
                    converter.fromDecimal();
                    break;
                case "C":
                case "D":
                case "E":
                case "F":
                case "W":
                    System.out.println("Your choice is " + operation);
                    break;
                default:
                    System.out.println("Invalid operation. Try to choose again.");
            }
        } while (!operation.equals("W"));
    }
}
