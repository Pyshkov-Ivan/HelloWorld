package com.javalesson.methods;

public class Methods {
    public static void main(String[] args) {
        printMessage("Alex");
        int a = 5;
        int b = 10;
        int rectangleSquare = calcRectangleSquare(a, b);
        int square = calcSquare(b);
        System.out.println("Rectangle square = " + rectangleSquare);
        System.out.println("Square = " + square);

        int sumOfSquaers = rectangleSquare + square;
        System.out.println("Sum of square = " + sumOfSquaers);

    }

    static void printMessage(String name) {
        System.out.println("Hello " + name + "!!!");
    }

    static int calcRectangleSquare(int x, int y) {
        int square = x * y;
        return square;
    }

    static int calcSquare(int x) {
        return x * x;
    }
}
