package org.example.model;

import java.util.Scanner;


public class Util {

    static Scanner scan = new Scanner(System.in);

    public static boolean validSalary(double salary) {
        boolean trueSalary=false;
            try {
                if (salary <= 0){
                    System.out.println("Salary cann't be negative or zero. Try again: ");
                    throw new IllegalArgumentException();
                }
                trueSalary=true;
            } catch (IllegalArgumentException ex) {
                System.out.println();

            }
        return trueSalary;
    }

    public static void information() {
        System.out.println("1: Add New Employee");
        System.out.println("2: Show All Employees");
        System.out.println("3: Delete Employee");
        System.out.println("4: Change Salary");
        System.out.println("5: Promotion");
        System.out.println("6. Search Employee by ID");
        System.out.println("0: Exit");

        System.out.println("Enter the number you want to use:  ");
    }

}
