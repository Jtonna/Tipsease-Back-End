package com.lambdaschool.tipsease.services;

import com.lambdaschool.tipsease.models.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee save(Employee employee);
}
