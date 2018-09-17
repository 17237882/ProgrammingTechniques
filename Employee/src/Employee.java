/**
 * Week 5 example code. Not to be used without permission and appropriate
 * referencing
 */

public class Employee {
  private int staffID;              // employees unique identifier
  private String firstName;
  private String surname;
  private String address;           // home address
  private double annualLeave;       // accrued annual leave available
  private double longServiceLeave;  // accrued long service leave available
  private String department;
  private String position;
  private int supervisorID;
  private double payRate;
  private double hoursWorked;
  // other data fields from lecture 4 not implemented in this example to keep it
  // brief

  /**
   * Constructor - create the new employee object using the values from the
   * parameters as listed
   * 
   * @param ID
   *          - The new employees staff ID.
   * @param fName
   *          - The new employees first name
   * @param sName
   *          - The new employees surname
   * @param leave
   *          - The new employees annual leave
   */
  public Employee(int ID, String fName, String sName, double leave) {
    staffID = ID;
    firstName = fName;
    surname = sName;
    annualLeave = leave;
    longServiceLeave = 10.0; // new staff are given a bonus 10 hours long
                             // service leave
  }

  /**
   * No-Arg Constructor - create the new employee object with some default
   * values. Note: these values are for the purpose of the example only and are
   * not particularly sensible values to choose.
   */
  public Employee() {
    staffID = 99999;
    firstName = "Fred";
    surname = "Smith";
  }

  /**
   * Constructor - create the new employee object using the values from the
   * parameters as listed
   * 
   * @param ID
   *          - The new employees staff ID.
   * @param fName
   *          - The new employees first name
   * @param sName
   *          - The new employees surname
   * @param leave
   *          - The new employees annual leave
   */
  public Employee(int ID, String fName, String sName, String empAddress, double leave, String empDepartment, String empPosition, int supID, double empPayRate, double empHoursWorked) {
    staffID = ID;
    firstName = fName;
    surname = sName;
    address = empAddress;
    annualLeave = leave;
    longServiceLeave = 10.0; // new staff are given a bonus 10 hours long
                             // service leave
    department = empDepartment;
    position = empPosition;
    supervisorID = supID;
    payRate = empPayRate;
    hoursWorked = empHoursWorked;
  }
  /**
   * @param ID
   *          - The new employees staff identification number
   */
  public void setStaffID(int ID) {
    staffID = ID;
  }

  /**
   * @param empDepartment
   *          - The new employees department name
   */
  
  public void setDepartment(String empDepartment) {
    department = empDepartment;
  }

  /**
   * @param empPosition
   *          - The new employees position title
   */
  
  public void setPosition(String empPosition) {
    position = empPosition;
  }

  /**
   * @param supID
   *          - The new employees supervisor's staff ID
   */
  
  public void setSupervisorID(int supID) {
    supervisorID = supID;
  }

  /**
   * @param empPayRate
   *          - The new employees hourly pay rate
   */
  
  public void setPayRate(double empPayRate) {
    payRate = empPayRate;
  }

  /**
   * @param empHoursWorked
   *          - The employees hours worked
   */
  
  public void setHoursWorked(double empHoursWorked) {
    hoursWorked = empHoursWorked;
  }

  /**
   * @return staff Identification number
   */
  public int getStaffID() {
    return staffID;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getSurname() {
    return surname;
  }
  
  public String getAddress() {
    return address;
  }

  public double getAnnualLeave() {
    return annualLeave;
  }

  public double getLongServiceLeave() {
    return longServiceLeave;
  }

  /**
   * @return employee department
   */
  public String getDepartment() {
    return department;
  }

  /**
   * @return employee position title
   */
  public String getPosition() {
    return position;
  }

  /**
   * @return employee's supervisor's staff ID
   */
  public int getSupervisorID() {
    return supervisorID;
  }

  /**
   * @return employee pay rate
   */
  public double getPayRate() {
    return payRate;
  }

  /**
   * @return employee's hours worked
   */
  public double getHoursWorked() {
    return hoursWorked;
  }


  /**
   * Determines if the employee has sufficient accrued leave to cover the
   * requested number of hours of leave.
   * 
   @param leaveType
   *          – the type of leave requested. A = Annual, L = long service
   * @param requestedHours
   *          – the number of hours of leave requested by the employee
   * @return true if leave is approved, false otherwise
   */
  public boolean requestLeave(char leaveType, float requestedHours) {
    if (leaveType == 'A') {
      if (annualLeave > requestedHours) {
        return true;
      } else {
        return false;
      }
    } else {
      if (longServiceLeave > requestedHours) {
        return true;
      } else {
        return false;
      }
    }
  }

} // end Employee class