import java.util.Scanner;
//Decimal Format library from Mkyong.com: Java - Display double in 2 decimal places -
//https://www.mkyong.com/java/java-display-double-in-2-decimal-points/
import java.text.DecimalFormat;
//End Code Segment

public class ConversionProgram {

  public static void main(String[] args) {
    // Declare and Initialise Keyboard scanner to receive user input
    Scanner keyboard = new Scanner(System.in);

    // Input Variables
    double metres;
    int menuChoice;

    // Message Variables - Contain String messages to be displayed to the user
    String distMetresMess = "Enter a distance in metres: ";
    String distMetresMessErr = "Distance must not be negative.";
    String menuChoiceMess = "\n" + "Enter your choice: ";
    String menuChoiceMessErr = "Your menu choice must be 1, 2, 3 or 4.";
    metres = getDouble(distMetresMess, keyboard);
    metres = valPositiveDouble(metres, distMetresMess,
        distMetresMessErr, keyboard);
    
    // Display menu options
    menuChoice = 0;
    
    while(menuChoice != 4) {
      menu();
      menuChoice = getInt(menuChoiceMess, keyboard);
      menuChoice = valMenuInt(menuChoice, menuChoiceMess, menuChoiceMessErr, keyboard);
    
      switch (menuChoice) {
        case 1:
          showKilometres(metres);
          break;
        case 2:
          showInches(metres);
          break;
        case 3:
          showFeet(metres);
          break;
        case 4:
          System.out.println("Bye!");
          break;
        default:
      }
    }
    
    keyboard.close();
  }

  // Method to display menu options
  public static void menu() {
    System.out.println("1. Convert to kilometres");
    System.out.println("2. Convert to inches");
    System.out.println("3. Convert to feet");
    System.out.println("4. Quit the program");
  }

  // Method to present message to user and return next integer entered
  public static int getInt(String inputMess, Scanner keyboard) {
    System.out.print(inputMess);
    return keyboard.nextInt();
  }
  
  // Method to validate user has provided valid integer from the menu list,
  // if invalid, show menu and ask for integer again
  public static int valMenuInt(int numToVal, String inputMess,
                                            String errMess, Scanner keyboard) {
    while (numToVal <= 0 || numToVal >= 5) {
      System.out.println("\n" + errMess + "\n");
      menu();
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
  public static double valPositiveDouble(double numToVal, String inputMess,
                                                  String errMess, Scanner keyboard) {
    while (numToVal < 0) {
      System.out.println("\n" + errMess);
      numToVal = getDouble(inputMess, keyboard);
    }
    
    return numToVal;
  }
  
  public static void showKilometres(double metres) {

    // Decimal Format library from Mkyong.com: Java - Display double in 2 decimal places -
    // https://www.mkyong.com/java/java-display-double-in-2-decimal-points/
    DecimalFormat commTwoDecimal = new DecimalFormat("#,##0.##");
    // End Code Segment
    double multiplier = 0.001;
    double kilometres;
    String kmResultMess;
    
    kilometres = metres * multiplier;
    
    kmResultMess = commTwoDecimal.format(metres) + " metres is " + commTwoDecimal.format(kilometres) + " kilometres.";
    System.out.println(kmResultMess + "\n");
  }
  
  public static void showInches(double metres) {

    // Decimal Format library from Mkyong.com: Java - Display double in 2 decimal places -
    // https://www.mkyong.com/java/java-display-double-in-2-decimal-points/
    DecimalFormat commTwoDecimal = new DecimalFormat("#,##0.##");
    // End Code Segment
    double multiplier = 39.37;
    double inches;
    String inResultMess;
   
    inches = metres * multiplier;
    
    inResultMess = commTwoDecimal.format(metres) + " metres is " + commTwoDecimal.format(inches) + " inches.";
    System.out.println(inResultMess + "\n");
  }
  
  public static void showFeet(double metres) {

    // Decimal Format library from Mkyong.com: Java - Display double in 2 decimal places -
    // https://www.mkyong.com/java/java-display-double-in-2-decimal-points/
    DecimalFormat commTwoDecimal = new DecimalFormat("#,##0.##");
    // End Code Segment
    double multiplier = 3.281;
    double feet;
    String ftResultMess;
    
    feet = metres * multiplier;
    
    ftResultMess = commTwoDecimal.format(metres) + " metres is " + commTwoDecimal.format(feet) + " feet.";
    System.out.println(ftResultMess + "\n");
  }
}
