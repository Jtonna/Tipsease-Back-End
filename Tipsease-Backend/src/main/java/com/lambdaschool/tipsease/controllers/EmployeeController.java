package com.lambdaschool.tipsease.controllers;

import io.swagger.annotations.Api;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Employees%20Actions", produces = "MediaType.APPLICATION_JSON_VALUE", tags = {"Employees Actions"})
@RestController
@PreAuthorize("hasAuthority('ROLE_USER')")
@RequestMapping(value = "/employees")
public class EmployeeController {

    // used for deleting an employee

    // used for getting transactions between user's and employee's


}
