package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("Number\tSquare\tCube");
        for (int i=0; i<=10; i++){
            System.out.printf("%d\t\t%d\t\t%d",i,i*i,i*i*i);
            System.out.println();
        }
    }
}