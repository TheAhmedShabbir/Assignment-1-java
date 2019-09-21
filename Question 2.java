package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c,sum,average,product;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        a = input.nextInt();
        System.out.println("Enter Second integer: ");
        b = input.nextInt();
        System.out.println("Enter third integer: ");
        c = input.nextInt();
        System.out.println("Information box:");

        sum = a + b + c;
        System.out.printf("Sum: %d",sum);
        System.out.println();

        average = sum / 3;
        System.out.printf("Average: %d",average);
        System.out.println();

        product = a * b * c;
        System.out.printf("Product: %d",product);
        System.out.println();

        if (a > b && a > c){
            System.out.printf("%d is greater", a);
        }
        else if (b > a && b > c){
            System.out.printf("%d is greater",b);
        }
        else if (c > a && c > b){
            System.out.printf("%d is greater", c);
        }
    }
}