/**
 * Week 5 example code. Not to be used without permission and appropriate
 * referencing
 */

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

  }
}
