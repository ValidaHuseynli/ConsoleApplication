package org.example.model;

import org.example.Main;

import java.util.UUID;

public class Employee {

    private UUID employeeId;
    private String name;
    private String surname;
    private Position position;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String surname, Position position, double salary) {
        this.employeeId = UUID.randomUUID();
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
    }

    public UUID getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position=" + position +
                ", salary=" + salary +
                '}';
    }


}
