/**
 * Week 5 example code. Not to be used without permission and appropriate
 * referencing
 */

import java.util.Scanner;

public class employeeDemo {
  public static void main(String[] args) {
    /*
     * This program demonstrates the use of the Employee class and some of its
     * methods including the two constructors
     */

    Employee person = new Employee(54545, "Bob", "Down", 7.5);
    System.out.println("Values for person object:");
    System.out.println("Staff ID: " + person.getStaffID());
    System.out.println("First Name: " + person.getFirstName());
    System.out.println("Long Service Leave: " + person.getLongServiceLeave());
    System.out.println("Home Address: " + person.getAddress());

    System.out.println("\nValues for accountant object:");
    Employee accountant = new Employee();
    System.out.println("Staff ID: " + accountant.getStaffID());
    System.out.println("First Name: " + accountant.getFirstName());
    System.out.println("Long Service Leave: " + accountant.getLongServiceLeave());
    System.out.println("Home Address: " + accountant.getAddress());

    Scanner keyboard = new Scanner(System.in);    

    int staffID;              // employees unique identifier
    String firstName;
    String surname;
    String address;           // home address
    double annualLeave;       // accrued annual leave available
    String department;
    String position;
    int supervisorID;
    double payRate;
    double hoursWorked;

    System.out.print("\nStaff ID: ");
    staffID = keyboard.nextInt();

    keyboard.nextLine();
    
    System.out.print("First Name: ");
    firstName = keyboard.nextLine();

    System.out.print("Surname: ");
    surname = keyboard.nextLine();

    System.out.print("Address: ");
    address = keyboard.nextLine();
    
    System.out.print("Annual Leave: ");
    annualLeave = keyboard.nextDouble();

    keyboard.nextLine();
    
    System.out.print("Department: ");
    department = keyboard.nextLine();

    System.out.print("Position Title: ");
    position = keyboard.nextLine();

    System.out.print("Supervisor ID: ");
    supervisorID = keyboard.nextInt();

    System.out.print("Hourly Pay Rate: ");
    payRate = keyboard.nextDouble();

    System.out.print("Hours Worked: ");
    hoursWorked = keyboard.nextDouble();

    Employee person2 = new Employee(staffID, firstName, surname, address, annualLeave, department, position, supervisorID, payRate, hoursWorked);
    System.out.println("Staff ID: " + person2.getStaffID());
    System.out.println("First Name: " + person2.getFirstName());
    System.out.println("Surname: " + person2.getSurname());
    System.out.println("Annual Leave: " + person2.getAnnualLeave());
    System.out.println("Long Service Leave: " + person2.getLongServiceLeave());
    System.out.println("Home Address: " + person2.getAddress());
    System.out.println("Department: " + person2.getDepartment());
    System.out.println("Supervisor: " + person2.getSupervisorID());
    System.out.println("Position: " + person2.getPosition());
    System.out.println("Hourly Pay Rate: " + person2.getPayRate());
    System.out.println("Hours Worked: " + person2.getHoursWorked());
    
    keyboard.close();
  }
}
