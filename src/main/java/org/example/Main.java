package org.example;

import org.example.model.Util;
import org.example.service.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class Main {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {



        EmployeeServiceImpl service=new EmployeeServiceImpl();

        Util.information();
        int number= scan.nextInt();
        while (number!=0){
            switch (number) {
                case 1:
                    service.addEmployee();
                    Util.information();
                    number= scan.nextInt();
                    break;
                case 2:
                    service.employeeList();
                    System.out.println();
                    Util.information();
                    number= scan.nextInt();
                    break;
                case 3:
                    service.deleteEmployee();
                    Util.information();
                    number= scan.nextInt();
                    break;
                case 4:
                    service.changeSalary();
                    Util.information();
                    number= scan.nextInt();
                    break;
                case 5:
                    service.promotion();
                    Util.information();
                    number= scan.nextInt();
                    break;
                case 6:
                    service.findEmployeeById();
                    Util.information();
                    number= scan.nextInt();
                    break;

                case 0:
                    number= scan.nextInt();
                    System.out.println("EXIT");
                    System.exit(0);


            }
        }
    }



}