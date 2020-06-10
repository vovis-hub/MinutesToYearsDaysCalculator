package com.Vlad;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(3216546);
    }
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        long years = minutes/525600;
        long days = (minutes % 525600) / 1440;

        System.out.println(minutes + " min = "+ years +" years and "+days+" days");
    }
}
