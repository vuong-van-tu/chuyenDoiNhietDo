package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        double F;
        double C;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter F :");
                    F = sc.nextDouble();
                    System.out.println("FtoC : "+FtoC(choice));
                    break;
                case 2:
                    System.out.println("Enter C :");
                    C = sc.nextDouble();
                    System.out.println("CtoF : "+CtoF(choice));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
    public static double FtoC(double C){
        double F = (9.0/5)*C + 32;
        return F;
    }
    public static double CtoF(double F){
        double C = (5.0/9)*(F-32);
        return C;
    }
}
