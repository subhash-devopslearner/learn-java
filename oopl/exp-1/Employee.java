/*
Aim:  Implement a program using classes, objects, data members and member functions. 

Problem Statement:
Create a class "Employee" to read and print information about an employee with the 
following data members: 
    1. Name of the employee
    2. ID of the employee
    3. Department of the employee
    4. Basic salary. 

Tasks: 
Perform the following functions to complete the operations: 
    1. Write a member function read_Employee( ) to initialize the object
    2. Write a member function to Calculate Gross salary and its components 
    (declare them as data members) based on the following conditions:
    - Dearness allowance (DA) = 50 % of basic salary
    - HRA = 30 % basic salary 
    - TA = 10 % basic salary 
    - Gross Salary = basic salary + DA + HRA + TA.  
    3. Write a member function to display employee details with Gross Salary 
    and all other components. 
*/

import java.util.Scanner;

class Employee {

    // Data members
    String name;
    int id;
    String department;
    double basicSalary;

    double da, hra, ta, grossSalary;

    // Member function to read employee details
    void readEmployee() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Department: ");
        department = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();

        sc.close();
    }

    // Member function to calculate salary
    void calculateSalary() {
        da = 0.50 * basicSalary;
        hra = 0.30 * basicSalary;
        ta = 0.10 * basicSalary;

        grossSalary = basicSalary + da + hra + ta;
    }

    // Member function to display employee details
    void displayEmployee() {
        System.out.println("\n----- Employee Details -----");
        System.out.println("Name          : " + name);
        System.out.println("ID            : " + id);
        System.out.println("Department    : " + department);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("DA (50%)      : " + da);
        System.out.println("HRA (30%)     : " + hra);
        System.out.println("TA (10%)      : " + ta);
        System.out.println("Gross Salary  : " + grossSalary);
    }

    // Main method
    public static void main(String[] args) {
        Employee emp = new Employee();  // Object creation

        emp.readEmployee();
        emp.calculateSalary();
        emp.displayEmployee();
    }
}
