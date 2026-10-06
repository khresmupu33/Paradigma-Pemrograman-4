package Soal1;

public class Owner extends Person {
    private Company company;

    public Owner(Company company) {
        super();
        this.company = company;
    }

    public void addEmployee(Employee employee) {
        employee.setId(company.getNextEmployeeId());
        company.getEmployees().add(employee);
    }

    public void viewAllEmployee() {
        if (company.getEmployees().isEmpty()) {
            System.out.println("No data");
            return;
        }

        System.out.printf("%-11s %-20s %s%n", "ID", "NAME", "JOIN DATE");
        for (Employee emp : company.getEmployees()) {
            System.out.printf("%-11s %-20s %s%n", emp.getId(), emp.getFullName(), emp.getJoinDate());
        }
    }
}

