package com.javalesson.controlstatement;

public class Controls {
    public static void main(String[] args) {

        int i = 10;
        {
            int k = 15;
            System.out.println("I = " + i);
            System.out.println("K = " + k);
        }


        int testScore = 75;
        System.out.println("You've got");
        if (testScore >= 90) {
            System.out.println("an Excellent");
        } else {
            System.out.println("a bad");
        }
        System.out.println("mark");
    }
}
