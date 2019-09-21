package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount: ");
        int amount = input.nextInt();
        int five_thousand = amount / 5000;
        int r1 = amount % 5000;
        int one_hundred = r1 / 1000;
        int r2 = r1 % 1000;
        int five_hundred = r2 / 500;
        int r3 = r2 % 500;
        int hundred = r3 / 100;
        int r4 = r3 % 100;
        int fifty = r4 / 50;
        int r5 = r4 % 50;
        int twenty = r5 / 20;
        int r6 = r5 % 20;
        int ten = r6 / 10;
        int r7 = r6 % 10;
        int five = r7 / 5;
        int r8 = r7 % 5;
        int two = r8 / 2;
        int r9 = r8 % 2;
        int one = r9 / 1;
        System.out.println("5 thousands = "+five_thousand+"\nOne thousand = "+one_hundred+"\nFive Hundred = "+five_hundred+
                "\nOne Hundred = "+hundred+"\nFifty = "+fifty+"\nTwenty = "+twenty+"\nTen = "+ten+"\nFive = "
                +five+"\nTwo = "+two+"\nOne = "+one);
    }
}