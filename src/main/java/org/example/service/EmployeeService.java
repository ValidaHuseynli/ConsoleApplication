package org.example.service;

import org.example.model.Employee;

public interface EmployeeService {

    void addEmployee();
    void employeeList();
    void deleteEmployee();
    void changeSalary();
    void promotion();
    Employee findEmployee();
    void findEmployeeById();

}
