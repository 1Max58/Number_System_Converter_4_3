package com.example.numbersystemconverter;

public class Main {
    public static void main(String[] args) {
        NumberSystemConverter converter = new NumberSystemConverter();
        String operation;
        do {
            operation = converter.chooseOperation();
            switch (operation) {
                case "A":
                case "a":
                    converter.toDecimal();
                    break;
                case "B":
                case "b":
                    converter.fromDecimal();
                    break;
                case "C":
                case "c":
                    converter.addNumbers();
                    break;
                case "D":
                case "d":
                    converter.subtractNumbers();
                    break;
                case "E":
                case "e":
                    converter.multiplyNumbers();
                    break;
                case "F":
                case "f":
                    converter.divideNumbers();
                    break;
                case "W":
                case "w":
                    break;
                default:
                    System.out.println("\"" + operation + "\" is invalid operation. Try to choose again.");
            }
        } while (!operation.equals("W"));
    }
}
