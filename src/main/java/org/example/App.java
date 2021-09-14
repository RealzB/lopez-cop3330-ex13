package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 Brandon Lopez
 */
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the principal amount?");
        String uiprincipal = sc.nextLine();
        System.out.println("What is the rate? ");
        String uirate = sc.nextLine();
        System.out.println("What is the number of years?");
        String uiyears = sc.nextLine();
        System.out.println("What is the number of times the interest is compounded per year? ");
        String uifrequency = sc.nextLine();

        float principal = Float.valueOf(uiprincipal);
        float rate = Float.valueOf(uirate);
        float years = Float.valueOf(uiyears);
        float frequency = Float.valueOf(uifrequency);
        double value = principal*Math.pow(1 +((rate/100)/frequency),(frequency*years));
        float conclusionValue = (float) value;

        String conclusion = String.format("$%.0f invested at %.1f percent for %.0f years compounded %.0f times per year is $%.2f.", principal, rate, years, frequency, ((conclusionValue*100)+0.49)/100d);



        System.out.println(conclusion);




    }
}
