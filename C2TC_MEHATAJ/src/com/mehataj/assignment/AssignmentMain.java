package com.mehataj.assignment;
import com.mehataj.assignment.employee.Manager;
import com.mehataj.assignment.employee.Developer;

import com.mehataj.assignment.employeeutilities.EmployeeUtilities;
public class AssignmentMain {
 public static void main(String[] args) {
 Manager manager = new Manager("John", 101, 90000, "Sales");
 Developer developer = new Developer("Alice", 102, 80000, "Java");
 EmployeeUtilities.printEmployeeDetails(manager);
 EmployeeUtilities.printEmployeeDetails(developer);
 }
}