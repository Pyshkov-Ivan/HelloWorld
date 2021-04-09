package com.javalesson.testing;

public class TestingLessons {
    public static void main(String[] args) {
        /*int Regress = 80;
        System.out.println("So");
        if (Regress >= 250) {
            System.out.println("Mission");
            System.out.println("Complete");
        } else if (Regress >= 125) {
            System.out.println("Mission");
            System.out.println("Not Finished");
        } else {
            System.out.println("Failed");
        }*/

        int Regress = 275;
        int currentRegress = 0;
        int tes = 10;
        int days = 0;

        do {
            currentRegress += tes;
            days++;
            System.out.println("Days " + days + " - " + currentRegress);

        } while (currentRegress < Regress || days < 14);


    }
}
