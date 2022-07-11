package com.simranb.employeesystem.service;

import com.simranb.employeesystem.model.Employee;
import java.util.List;

public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
    public List<Employee> getAllEmployees();
}