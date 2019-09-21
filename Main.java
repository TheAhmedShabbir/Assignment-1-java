package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double bill,cost = 15.00;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Customer name: ");
        String customer_name = input.nextLine();

        System.out.println("Enter Address: ");
        String address = input.nextLine();

        System.out.println("Enter Customer Number: ");
        long customer_number = input.nextLong();

        System.out.println("Enter Previous Meter Reading: ");
        int previous_meter_reading = input.nextInt();

        System.out.println("Enter Current Meter Reading: ");
        int current_meter_reading = input.nextInt();

        System.out.println("\tElectricity Bill\t");
        System.out.println("Customer Name: "+customer_name);
        System.out.println("Customer Address: "+address);
        System.out.println("Customer Number: "+customer_number);

        int units = (current_meter_reading - previous_meter_reading );
        System.out.println("Consumed units: "+units);

        if (units >= 0 && units <= 100){
            System.out.println("Bill: "+cost);
        }
        else if (units >= 101 && units <= 300){
            bill = cost + 30.00;
            System.out.println("Bill: "+bill);
        }
        else if (units >= 301 && units <= 500){
            bill = cost + 45.00;
            System.out.println("Bill: "+bill);
        }
        if (units >= 501){
            bill = cost + 60.00;
            System.out.println("Bill: "+bill);
        }
    }
}