package Composite;

import java.util.List;

public class Department implements Employee {
    private List<Employee> employees;
    private String depName;
    public Department(List<Employee> employees, String depName) {
        this.employees = employees;
        this.depName = depName;
    }

    @Override
    public void showDetails() {
        System.out.println("Start Displaying Department ="+ depName);
        employees.forEach( emp -> emp.showDetails());
        System.out.println("End Displaying Department ="+ depName);
    }
}
