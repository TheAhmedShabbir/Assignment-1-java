package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        a = input.nextInt();
        b = input.nextInt();
        if(a > b) {
            System.out.printf("%d is greater",a);
        }
        else if (a < b) {
            System.out.printf("%d is greater",b);
        }
        else if (a == b) {
            System.out.println("These Numbers are Equal");
        }
    }
}