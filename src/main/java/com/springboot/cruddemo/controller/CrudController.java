package com.springboot.cruddemo.controller;

import com.springboot.cruddemo.entity.Employee;
import com.springboot.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@EnableJpaRepositories
@RestController
@RequestMapping("/api")
public class CrudController {
    private final EmployeeService employeeService;

    @Autowired
    public CrudController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return employeeService.findAll();
    }
    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId){
        return employeeService.findById(employeeId);
    }
    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee){
        employee.setId(0);
        return employeeService.save(employee);
    }
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.save(employee);
    }
    @DeleteMapping("/employees/{employeeId}")
    public void deleteEmployee(@PathVariable int employeeId){
        employeeService.deleteById(employeeId);
    }
}
