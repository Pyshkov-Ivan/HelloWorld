package com.javalesson;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!!!");

        byte b = 10;
        short c = 200;
        int a = b + 23;
        long myLongValue = 123_456_789_876L;

        float myFloatVal = 23.56f;
        double myDoubleVal = 23.56d;

        double sum = a + b + c + myLongValue + myDoubleVal + myFloatVal;
        System.out.println("Sum = " + sum);

        float floatResult = myFloatVal / 3;
        System.out.println("FloatResult = " + floatResult);
        double myNewDouble = 23.56;

        System.out.println("MyDoubleResult = " + myNewDouble / 3);

        char char1 = 'A';
        char char2 = 'b';
        char char3 = '\n';
        char char4 = '^';
        char char5 = '\u00A9';

        System.out.println("Characters");
        System.out.println("Char1 = " + char1);
        System.out.println("Char2 = " + char2);
        System.out.println("Char3 = " + char3);
        System.out.println("Char4 = " + char4);
        System.out.println("Char5 = " + char5);


        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("a = " + a);
        System.out.println("MtLongValue = " + myLongValue);

    }
}
