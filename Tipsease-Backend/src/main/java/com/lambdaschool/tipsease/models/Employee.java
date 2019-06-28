package com.lambdaschool.tipsease.models;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    // hides the fields with hidden = isHidden if set to true.
    private final boolean isHidden = false;

    @Id
    @ApiModelProperty(notes = "The database generated employee ID", hidden = isHidden)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long empid;

    @ApiModelProperty(notes = "Whole name of an employee")
    private String empname;

    @ApiModelProperty(notes = "Location of the employee")
    private String emplocation;

    @ApiModelProperty(notes = "Images relevant to the employee object")
    private String empimg, empheader;

}
