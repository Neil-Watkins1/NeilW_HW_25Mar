package Staff.Management;

import Staff.Employee;

public class Manager extends Employee {

    private String deptName;


    public Manager(String name, String niNumber, double salary, String deptName) {
        super(name, niNumber, salary);
        this.deptName = deptName;
    }

    public String getDept() {
        return deptName;
    }

    public void setDepartment(String department) {
        this.deptName = department;
    }
}

