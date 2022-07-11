package com.simranb.employeesystem.controller;

import com.simranb.employeesystem.model.Employee;
import com.simranb.employeesystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public String add(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return "New employee is added";
    }
    
    @GetMapping("/getAll")
    public List<Employee> list(){
        return employeeService.getAllEmployees();
    }
}