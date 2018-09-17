/*
Student ID: 17237882
Name: Dhammika Emmanuel Mendis
Campus: Parramatta
Tutor Name: Nick Tothill
Class Day: Monday
Class Time: 2pm
*/

import java.util.Scanner;

public class CarDemo_17237882 {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    Car_17237882 car1 = new Car_17237882();
    
    System.out.println("Car 1 has been created: " + car1.getMake() + " " + car1.getYearModel());

    String car2Make = getString("Please enter the Make of Car 2: ", keyboard);
    int car2Model = getInt("Please enter the Year of Model for Car 2: ", keyboard);    

    Car_17237882 car2 = new Car_17237882(car2Model, car2Make);
    
    keyboard.nextLine();
    String car3Make = getString("Please enter the Make of Car 3: ", keyboard);
    int car3Model = getInt("Please enter the Year of Model for Car 3: ", keyboard);
    int car3Speed = getInt("Please enter the Starting speed for Car 3: ", keyboard);
    
    Car_17237882 car3 = new Car_17237882(car3Model, car3Make, car3Speed);
    
    
    keyboard.nextLine();
    String car1Name = "Car 1" + " (" + car1.getMake() + ")";
    accelerateAndBreakDemo(car1, car1Name, keyboard);
    keyboard.nextLine();
    String car2Name = "Car 2" + " (" + car2.getMake() + ")";
    accelerateAndBreakDemo(car2, car2Name, keyboard);
    keyboard.nextLine();
    String car3Name = "Car 3" + " (" + car3.getMake() + ")";
    accelerateAndBreakDemo(car3, car3Name, keyboard);
    
    System.out.println("\n");    
    displayCar(car1, "Car 1");
    displayCar(car2, "Car 2");
    displayCar(car3, "Car 3");
    
    keyboard.close();
  }
  
  public static void accelerateAndBreakDemo(Car_17237882 demoCar, String carName, Scanner keyboard) {
    
    System.out.print("\nPress enter to accelerate " + carName + " by 5.");
    keyboard.nextLine();
    demoCar.accelerate();
    displayCurrentSpeed(carName, demoCar);
    
    System.out.print("\nEnter an integer to accelerate " + carName + " further by that amount: ");
    demoCar.accelerate(keyboard.nextInt());
    displayCurrentSpeed(carName, demoCar);
    keyboard.nextLine();
    
    System.out.print("\nPress enter to brake " + carName + " by 5.");
    keyboard.nextLine();
    demoCar.brake();
    displayCurrentSpeed(carName, demoCar);
    
    System.out.print("\nEnter an integer to brake " + carName + " further by that amount: ");
    demoCar.brake(keyboard.nextInt());
    displayCurrentSpeed(carName, demoCar);
    
  }
  
  public static void displayCar(Car_17237882 demoCar, String carName) {   
    System.out.println(carName + " Make: " + demoCar.getMake());
    System.out.println(carName + " Model: " + demoCar.getYearModel());
    System.out.println(carName + " Speed: " + demoCar.getSpeed() + "\n");
  }
  
  public static String getString(String inputMess, Scanner keyboard) {
    System.out.print(inputMess);
    return keyboard.nextLine();
  }
  
  public static int getInt(String inputMess, Scanner keyboard) {
    System.out.print(inputMess);
    return keyboard.nextInt();
  }
  
  public static void displayCurrentSpeed(String carName, Car_17237882 demoCar) {
    System.out.println(carName + " Current Speed: " + demoCar.getSpeed());
  }
}
