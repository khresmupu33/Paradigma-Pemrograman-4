package Soal1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CompanyDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Company company = new Company();
        Owner owner = new Owner(company);

        System.out.print("Owner first name: ");
        owner.setFirstName(scanner.nextLine());
        System.out.print("Owner last name: ");
        owner.setLastName(scanner.nextLine());
        System.out.println("Welcome, " + owner.getFullName());

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        while (true) {
            System.out.println("==================================================");
            System.out.println("1. Add new employee");
            System.out.println("2. View all employee");
            System.out.println("3. Exit");
            System.out.print("Choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Employee first name: ");
                String fName = scanner.nextLine();
                System.out.print("Employee last name: ");
                String lName = scanner.nextLine();
                System.out.print("Join date (yyyy-mm-dd):");
                String dateStr = scanner.nextLine();

                try {
                    Date joinDate = dateFormat.parse(dateStr);
                    Employee emp = new Employee("", joinDate, fName, lName);
                    owner.addEmployee(emp);
                } catch (ParseException e) {
                    System.out.println("Format tanggal tidak valid!");
                }
            } else if (choice == 2) {
                owner.viewAllEmployee();
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Wrong menu");
            }
        }
        scanner.close();
    }
}
