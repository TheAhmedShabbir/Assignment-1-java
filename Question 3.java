package com.company;
import java.util.Scanner;
import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {
        int radius, diameter;
        double area,Circumference;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius of the Circle: ");
        radius = input.nextInt();

        diameter = 2 * radius;
        System.out.printf("Diameter: %d", diameter);
        System.out.println();

        Circumference = 2 * PI * radius;
        System.out.printf("Circumference : %f",Circumference);
        System.out.println();

        area = PI * Math.pow(radius,2);
        System.out.printf("Area: %f",area);
        System.out.println();
    }
}