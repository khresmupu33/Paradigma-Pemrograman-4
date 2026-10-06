package Soal1;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees;

    public Company() {
        this.employees = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getNextEmployeeId() {
        if (employees.isEmpty()) {
            return "E-00000001";
        }
        int nextId = employees.size() + 1;
        return String.format("E-%08d", nextId);
    }
}
