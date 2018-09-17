/*
Student ID: 17237882
Name: Dhammika Emmanuel Mendis
Campus: Parramatta
Tutor Name: Nick Tothill
Class Day: Monday
Class Time: 2pm
*/

import java.util.Scanner;

public class HotelOccupancy_17237882 {

  public static void main(String[] args) {
    // Declare and Initialise Keyboard (kb) scanner to receive user input
    Scanner kb = new Scanner(System.in);
    
    // Input Variables - Contain information provided by user
    int numFloors;
    int numRoomsInFloor;
    int numOccupiedInFloor;
    
    // Calculated Variables - Contain information derived from user information
    int totalNumRooms;
    int totalNumOccupied;
    int vacantRooms;   
    double occupancyRate;
    double occupancyRatePerc;
    
    // Message Variables - Contain String messages to be displayed to the user
    String bullPoint = "\u2022 "; // Bullet Point and Space for messages
    String resultIntro;
    String roomsResult;
    String occupiedRoomsResult;
    String vacantRoomsResult;
    String occupancyRateResult;
    String floorRoomsMess;
    String occupiedRoomsMess;
    String occRoomsMessErrGreater;
    String occRoomsMessErrNeg;    
    
    // Ask for number of hotels in floor and capture into variable
    System.out.print("How many floors are in the Hotel?: ");
    numFloors = kb.nextInt();
    
    // Check if numFloors provided is less than 1,
    // if so invalid, and ask for number of floors again
    while (numFloors < 1) {
      // Number of Floors invalid Error Message
      System.out.println("You need at least 1 floor in the hotel.");
      System.out.print("How many floors are in the Hotel?: ");
      numFloors = kb.nextInt();
    }
    
    // Initialise Number of Rooms and Number of Rooms Occupied to 0
    // to allow use of the += assignment operator
    totalNumRooms = 0;
    totalNumOccupied = 0;
    
    // Loop through each floor, starting at floor 1, continuing until
    // the number of floors provided are reached
    for (int floorCount = 1; floorCount <= numFloors; floorCount++) {
      // Initialise numRoomsInFloor to 0 for start/repeat of loop
      numRoomsInFloor = 0;
      // Ask for how many rooms are in this floor, using floorCount to denote floor number 
      floorRoomsMess = "\n" + "How many rooms are in Floor " + floorCount + ": ";
      System.out.print(floorRoomsMess);
      numRoomsInFloor = kb.nextInt();

      // Check if numRoomsInFloor provided is less than 10,
      // if so invalid, and ask for number of rooms again
      while (numRoomsInFloor < 10) {
        // Number of Rooms on floor invalid Error Message
        System.out.println("Your hotel floor must have at least 10 rooms.");
        System.out.print(floorRoomsMess);
        numRoomsInFloor = kb.nextInt();
      }
      
      // Aggregate number of rooms in each floor consecutively
      totalNumRooms += numRoomsInFloor;
      
      // Initialise numOccupiedInFloor to 0 for first time/repeat of loop
      numOccupiedInFloor = 0;
      
      // Ask how many rooms in the floor are occupied, using floorCount to denote floor Number 
      occupiedRoomsMess = "Of the " + numRoomsInFloor + " rooms in Floor "
                          + floorCount + ", how many are occupied?: ";
      System.out.print(occupiedRoomsMess);
      numOccupiedInFloor = kb.nextInt();

      // Check if numOccupiedInFloor provided is less than 0 (negative),
      // or if numOccupiedInFloor is greater than the number of rooms in the floor 
      // if so invalid, and ask for number of occupied rooms again
      while (numOccupiedInFloor > numRoomsInFloor || numOccupiedInFloor < 0) {

        if (numOccupiedInFloor > numRoomsInFloor) {
          // Number of Occupied Rooms on floor too many Error Message
          occRoomsMessErrGreater = "Floor " + floorCount + " only has " + numRoomsInFloor
                                        + " rooms, you cannot have " + numOccupiedInFloor
                                        + " rooms occupied.";
          
          System.out.println(occRoomsMessErrGreater);          
        } else if (numOccupiedInFloor < 0) {
          // Number of Occupied Rooms on floor negative Error Message
          occRoomsMessErrNeg = "Floor " + floorCount + " cannot have negative occupied rooms.";
          System.out.println(occRoomsMessErrNeg);
        }
        
        System.out.print(occupiedRoomsMess);
        numOccupiedInFloor = kb.nextInt();        
      }
      
      // Aggregate number of occupied rooms in each floor consecutively
      totalNumOccupied += numOccupiedInFloor;
    }
    
    // Calculate Vacant Room Number, Occupancy Rate and Percentage for Occupancy Rate
    vacantRooms = totalNumRooms - totalNumOccupied;
    occupancyRate = (double) totalNumOccupied / (double) totalNumRooms;
    occupancyRatePerc = occupancyRate * 100.0;
    
    // Initialise Message Strings containing results for user
    resultIntro = "\n" + "Your Hotel has:";
    roomsResult = bullPoint + totalNumRooms + " rooms in total.";
    occupiedRoomsResult = bullPoint + totalNumOccupied + " rooms occupied.";
    vacantRoomsResult = bullPoint + vacantRooms + " rooms vacant.";
    occupancyRateResult = bullPoint + "An Occupancy Rate of " + String.format("%.2f", occupancyRate)
                          + " (" + String.format("%.2f", occupancyRatePerc) +"%).";
    
    // Display Results
    System.out.println(resultIntro);
    System.out.println(roomsResult);
    System.out.println(occupiedRoomsResult);
    System.out.println(vacantRoomsResult);
    System.out.println(occupancyRateResult);
    
    // Close Keyboard Scanner to prevent memory leak
    kb.close();
  }

}
