package org.example.service.impl;

import org.example.model.Employee;
import org.example.model.Position;
import org.example.model.Util;
import org.example.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import static org.example.model.Position.*;


public class EmployeeServiceImpl implements EmployeeService {

    Scanner scan = new Scanner(System.in);


    List<Employee> employeeList = new ArrayList<>();

    @Override
    public void addEmployee() {

        System.out.print("Name: ");
        String name = scan.next();

        System.out.print("Surname: ");
        String surName = scan.next();

        System.out.println("Position: '/ " +
                "Possible options:  ");
        for (Position pos : values()) {
            System.out.println("  -  " + pos);
        }
        System.out.println();


        Position position = null;
        while (position == null) {
            String input = scan.next().toUpperCase();
            try {
                position = valueOf(input);
            } catch (IllegalArgumentException ex) {
                System.out.println("Invalid position! Try again.");
            }
        }


        System.out.print("Salary: ");
        double salary = -1;
        boolean b = false;
        while (!b) {
            salary = scan.nextDouble();
            b = Util.validSalary(salary);

        }


        Employee employee = new Employee(name, surName, position, salary);

        employeeList.add(employee);

    }

    @Override
    public void employeeList() {
        if (employeeList.isEmpty()) {
            System.out.println("There is not an employee");
        } else
            employeeList.forEach(System.out::println);
    }

    @Override
    public void deleteEmployee() {
        Employee employee1 = findEmployee();
        employeeList.remove(employee1);
        System.out.println("Removed successfully");

    }

    @Override
    public void changeSalary() {

        Employee employee = findEmployee();
        System.out.println("Enter new salary");
        double salary = -1;
        boolean b = false;
        while (!b) {
            salary = scan.nextDouble();
            b = Util.validSalary(salary);
        }

        employee.setSalary(salary);
        System.out.println(employee);

    }

    @Override
    public void promotion() {
        Employee employee = findEmployee();

        if (employee.getPosition() == INTERN) {
                employee.setPosition(JUNIOR);
            } else if (employee.getPosition() == JUNIOR) {
                employee.setPosition(MIDDLE);
            } else if (employee.getPosition() == MIDDLE) {
                employee.setPosition(SENIOR);
            } else if (employee.getPosition() == SENIOR) {
                employee.setPosition(EXPERT);
            } else if (employee.getPosition() == EXPERT) {
                System.out.println("Employee with the highest position!");
            }



    }

    @Override
    public Employee findEmployee() {
        Employee employee = null;
        while (employee == null) {
            System.out.print("Enter EmployeeId: ");
            UUID empId;
            try {
                empId = UUID.fromString(scan.next());
                for (Employee emp : employeeList) {
                    if (emp.getEmployeeId().equals(empId)) {
                        employee = emp;
                        break;
                    }
                }
            } catch (Exception ex) {
                System.out.println();
            }

            if (employee == null)
                System.out.println("Employee not found. Try again!");

        }
        return employee;
    }

    @Override
    public void findEmployeeById() {
        Employee employee = findEmployee();
        System.out.println(employee);
    }


}
