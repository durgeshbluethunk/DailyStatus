package org.example;

public class Emp {

    private String empName;
    private String empEmail;


    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public Emp(String empName, String empEmail) {
        this.empName = empName;
        this.empEmail = empEmail;
    }

    public Emp() {
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empName='" + empName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                '}';
    }
}
