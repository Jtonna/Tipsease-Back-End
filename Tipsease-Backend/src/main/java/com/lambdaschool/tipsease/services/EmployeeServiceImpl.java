package com.lambdaschool.tipsease.services;

import com.lambdaschool.tipsease.models.Employee;
import com.lambdaschool.tipsease.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "employeeService")
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository emprepo;

    @Override
    public List<Employee> findAll() {
        List<Employee> emplist = new ArrayList<>();
        emprepo.findAll().iterator().forEachRemaining(emplist::add);
        return emplist;
    }

}
