package com.javalesson.controlstatement;

public class SwitchCase {

    public static void main(String[] args) {
        String dayOfTheWeek = args[0];
        switch (dayOfTheWeek.toLowerCase()) {
            case "monday":
                System.out.println("This if the first working day");
                break;
            case "tuesday":
                System.out.println("This if the second working day");
                break;
            case "wednesday":
                System.out.println("This if the third working day");
                break;
            case "thuesday":
                System.out.println("This if the fourth working day");
                break;
            case "friday":
                System.out.println("This if the fifth working day");
                break;
            case "saturday": case "sunday":
                System.out.println("Finally weekend");
                break;
            default:
                System.out.println("Noty a day of the week");
        }
        System.out.println("Final string");
    }
}
