package com.lambdaschool.tipsease.models;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee extends Auditable{

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

    public Employee() {
    }

    public Employee(String empname, String emplocation, String empimg, String empheader) {
        this.empname = empname;
        this.emplocation = emplocation;
        this.empimg = empimg;
        this.empheader = empheader;
    }

    // generated getters and setters


    public long getEmpid() {
        return empid;
    }

    public void setEmpid(long empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmplocation() {
        return emplocation;
    }

    public void setEmplocation(String emplocation) {
        this.emplocation = emplocation;
    }

    public String getEmpimg() {
        return empimg;
    }

    public void setEmpimg(String empimg) {
        this.empimg = empimg;
    }

    public String getEmpheader() {
        return empheader;
    }

    public void setEmpheader(String empheader) {
        this.empheader = empheader;
    }
}
