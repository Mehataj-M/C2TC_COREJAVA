package com.mehataj.assignment2;

import java.util.Scanner;

// Main class
public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter Employee Type (Employee/Manager):");
            String type = scanner.nextLine();

            System.out.println("Enter Name:");
            String name = scanner.nextLine();

            System.out.println("Enter Age:");
            int age = scanner.nextInt();
            if (age <= 0 || age > 100) {
                throw new InvalidInputException("Age must be between 1 and 100.");
            }

            scanner.nextLine(); // Consume newline

            System.out.println("Enter Designation:");
            String designation = scanner.nextLine();

            System.out.println("Enter Salary:");
            double salary = scanner.nextDouble();
            if (salary < 0) {
                throw new InvalidInputException("Salary cannot be negative.");
            }

            scanner.nextLine(); // Consume newline

            if (type.equalsIgnoreCase("Manager")) {
                System.out.println("Enter Department:");
                String department = scanner.nextLine();

                // Creating Manager object
                Manager manager = new Manager(name, age, designation, salary, department);
                System.out.println("\nManager Details:");
                manager.displayDetails();
            } else if (type.equalsIgnoreCase("Employee")) {
                // Creating Employee object
                Employee employee = new Employee(name, age, designation, salary);
                System.out.println("\nEmployee Details:");
                employee.displayDetails();
            } else {
                throw new InvalidInputException("Invalid Employee Type. Must be 'Employee' or 'Manager'.");
            }
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
