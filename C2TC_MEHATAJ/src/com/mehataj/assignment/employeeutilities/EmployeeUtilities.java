package com.mehataj.assignment.employeeutilities;
import com.mehataj.assignment.employee.Developer;
import com.mehataj.assignment.employee.Employee;
import com.mehataj.assignment.employee.Manager;
public class EmployeeUtilities {
 public static void printEmployeeDetails(Employee employee) {
 System.out.println("Employee Name: " + employee.getName());
 System.out.println("Employee ID: " + employee.getEmployeeId());
 System.out.println("Salary: " + employee.getSalary());
 if (employee instanceof Manager) {
 Manager manager = (Manager) employee;
 System.out.println("Department: " + manager.getDepartment());
 } else if (employee instanceof Developer) {
 Developer developer = (Developer) employee;
 System.out.println("Programming Language: " + developer.getProgrammingLanguage());
 }
 System.out.println();
 }
}
