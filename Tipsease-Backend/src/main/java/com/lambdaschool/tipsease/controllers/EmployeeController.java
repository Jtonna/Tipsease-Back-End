package com.lambdaschool.tipsease.controllers;

import com.google.common.net.HttpHeaders;
import com.lambdaschool.tipsease.models.Employee;
import com.lambdaschool.tipsease.services.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Api(value = "Employees%20Actions", produces = "MediaType.APPLICATION_JSON_VALUE", tags = {"Employees Actions"})
@RestController
@PreAuthorize("hasAuthority('ROLE_USER')")
@RequestMapping(value = "/employees")
public class EmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private EmployeeService employeeService;

    // used for deleting an employee

    // used for getting transactions between user's and employee's

    // Lists all employees
    // localhost:2019/employees/employees
    @ApiOperation(value = "this lists all of the employees and their associated properties, this should be used for testing and not production")
    @GetMapping(value = "/employees", produces = {"application/json"})
    public ResponseEntity<?> listAllEmployees (HttpServletRequest request)
    {
        logger.trace(request.getRequestURI() + " was accessed");

        List<Employee> theEmployees = employeeService.findAll();
        return new ResponseEntity<>(theEmployees, HttpStatus.I_AM_A_TEAPOT);
    }

}
