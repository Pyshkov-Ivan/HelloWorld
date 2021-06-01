package com.javalesson.testing;

public class TestingLessons {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        byte b = 10;
        short c = 200;
        int a = b + 23;
        long myLongValue = 123_456_789_876L;

        float myFloatValue = 23.56F;
        double myDoubleValue = 56.45d;

        double sum = a + b + myLongValue + myDoubleValue + myFloatValue;
        System.out.println("SUM = " + sum);

        float floatResult = myFloatValue / 3;
        System.out.println("floatResult = " + floatResult);
        double myNewDouble = 23.56;

        System.out.println("myDoubleResult = " + myNewDouble / 3);

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

        System.out.println("SUM of Characters");
        System.out.println(char1 + char2 + char3 + char4 + char5);

        System.out.println("byte b = " + b);
        System.out.println("short c = " + c);
        System.out.println("int a = " + a);


    }
}
