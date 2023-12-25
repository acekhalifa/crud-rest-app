package com.springboot.cruddemo.dao;

import com.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> findAll();
    public Employee findById(int employeeId);
    public Employee save(Employee employee);
    public void deleteById(int employeeId);

}
