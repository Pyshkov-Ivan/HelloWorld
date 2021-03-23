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

        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("a = " + a);
        System.out.println("MtLongValue = " + myLongValue);

    }
}
