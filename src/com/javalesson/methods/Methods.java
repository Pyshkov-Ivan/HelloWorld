package com.javalesson.methods;

public class Methods {
    public static void main(String[] args) {
        printMessage("Alex");
        int a = 5;
        int b = 10;
        calcRectangleSquare(a, b);
        //calcRectangleSquare(5,10);

    }

    static void printMessage(String name) {
        System.out.println("Hello " + name + "!!!");
    }

    static void calcRectangleSquare(int x, int y) {
        int square = x * y;
        System.out.println("Rectangle square = " + square);
    }
}
