/*
Student ID: 17237882
Name: Dhammika Emmanuel Mendis
Campus: Parramatta
Tutor Name: Nick Tothill
Class Day: Monday
Class Time: 2pm
*/

import java.util.Scanner;

public class PaintJob_17237882 {

	public static void main(String[] args) {
    // Declare and Initialise Keyboard scanner to receive user input
		Scanner keyboard = new Scanner(System.in);
        
    // Input Variables - Contain information provided by user
		int numRoomstoPaint;
		double paintGallonPrice;
		double totalWallSpace = 0.0; // Initialised totalWallSpace to use += assignment operator
		double roomWallSpace;
		
    // Calculated Variables - Contain information derived from user information
		double gallonsPaintRequired;
		double hoursLabourRequired;
		double totalCostOfPaint;
		double labourCharges;
		double totalJobCost;
		
		// Static Variables - Predefined values to be used in the application
		double wallSpaceConstant = 115.0;
		double numHoursConstant = 8.0;
		double labourPerHourCharge = 18.0;
		
    // Message Variables - Contain String messages to be displayed to the user
		String bullPoint = "• ";
		String roomsPaintMess = "How many rooms are to be painted?: ";
		String roomsPaintMessErr = "You need at least 1 room to paint.";
		String priceGallonMess = "How much does 1 Gallon of paint cost? (No $ sign): ";
		String priceGallonMessErr = "Paint Price per Gallon must be more than $0.";
		String roomWallSpaceMess;
		String roomWallSpaceMessErr = "Sqaure Feet of wall space must be more than 0.";
		String resultIntro;
		String gallonsPaintRequiredMess;
		String hoursLabourRequiredMess;
		String totalCostOfPaintMess;
		String labourChargesMess;
		String totalJobCostMess;

    // Ask for number of rooms to be painted and capture into variable
		numRoomstoPaint = getInt(roomsPaintMess, keyboard);
		// Validate number of rooms provided is a positive, non zero integer value
		numRoomstoPaint = valPositiveNonZeroInt(numRoomstoPaint, roomsPaintMess,
		                                          roomsPaintMessErr, keyboard);
		
    // Ask for cost of a single gallon of paint and capture into variable
		paintGallonPrice = getDouble(priceGallonMess, keyboard);
    // Validate cost of paint provided is a positive, non zero double value
		paintGallonPrice = valPositiveNonZeroDouble(paintGallonPrice, priceGallonMess,
		                                              priceGallonMessErr, keyboard);
		
    // Loop through each room, starting at room 1, continuing until
    // the number of rooms provided are reached
		for (int roomCount = 1; roomCount <= numRoomstoPaint; roomCount++) {
		  // Ask for how many square feet of wall space needs painting in this room,
		  // using roomCount to denote room number 
			roomWallSpaceMess = "How many square feet of wall space needs to be painted in room "
			                      + roomCount +"?: ";
			
			roomWallSpace = getDouble(roomWallSpaceMess, keyboard);
			roomWallSpace = valPositiveNonZeroDouble(roomWallSpace, roomWallSpaceMess,
			                                          roomWallSpaceMessErr, keyboard);
			
      // Aggregate wall space in each room consecutively
			totalWallSpace += roomWallSpace;
		}
		
    // Calculate Total Gallons of Paint Required, Total number of hours or labour required,
		// total cost of the paint, total cost of the labour charges, and total cost of the paint job
		gallonsPaintRequired = totalWallSpace / wallSpaceConstant;
		hoursLabourRequired = totalWallSpace / wallSpaceConstant * numHoursConstant;
		totalCostOfPaint = gallonsPaintRequired * paintGallonPrice;
		labourCharges = hoursLabourRequired * labourPerHourCharge;
		totalJobCost = labourCharges + totalCostOfPaint;
		
    // Initialise Message Strings containing results for user
		resultIntro = "For your " + String.format("%,d", numRoomstoPaint) + " rooms:";
		
		gallonsPaintRequiredMess = bullPoint + String.format("%,.2f", gallonsPaintRequired)
		                          + " gallons of paint are required.";
		
		hoursLabourRequiredMess = bullPoint + String.format("%,.2f", hoursLabourRequired)
		                          + " hours of labour are required.";
		
		totalCostOfPaintMess = bullPoint + "the paint will cost $"
		                          + String.format("%,.2f", totalCostOfPaint);
		
		labourChargesMess = bullPoint + "the labour will cost $"
		                          + String.format("%,.2f", labourCharges);
		
		totalJobCostMess = bullPoint + "the total cost for the job will be $"
		                          + String.format("%,.2f", totalJobCost);
		
    // Display Results
		System.out.println(resultIntro);
		System.out.println(gallonsPaintRequiredMess);
		System.out.println(hoursLabourRequiredMess);
		System.out.println(totalCostOfPaintMess);
		System.out.println(labourChargesMess);
		System.out.println(totalJobCostMess);
		
    // Close Keyboard Scanner to prevent memory leak
		keyboard.close();
	}

	// Method to present message to user and return next integer entered
	public static int getInt(String inputMess, Scanner keyboard) {
		System.out.print(inputMess);
		return keyboard.nextInt();
	}
	
	// Method to validate user has provided valid positive, non-zero integer,
	// if invalid, ask for integer again
	public static int valPositiveNonZeroInt(int numToVal, String inputMess,
	                                          String errMess, Scanner keyboard) {
		while (numToVal <= 0) {
			System.out.println(errMess);
			numToVal = getInt(inputMess, keyboard);
		}
		
		return numToVal;
	}

  // Method to present message to user and return next double entered
	public static double getDouble(String inputMess, Scanner keyboard) {
		System.out.print(inputMess);
		return keyboard.nextDouble();
	}
  
  // Method to validate user has provided valid positive, non-zero double,
  // if invalid, ask for double again
	public static double valPositiveNonZeroDouble(double numToVal, String inputMess,
	                                                String errMess, Scanner keyboard) {
	  while (numToVal <= 0) {
			System.out.println(errMess);
      numToVal = getDouble(inputMess, keyboard);
		}
		
		return numToVal;
	}
}
