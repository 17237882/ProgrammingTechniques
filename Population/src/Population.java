
import java.util.Scanner;
//Decimal Format declaration from Mkyong.com: Java - Display double comma separated to 2 decimal places - https://www.mkyong.com/java/java-display-double-in-2-decimal-points/
import java.text.DecimalFormat;
//End Code Segment

public class Population {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);

    // Decimal Format declaration from Mkyong.com: Java - Display double comma separated to 2 decimal places - https://www.mkyong.com/java/java-display-double-in-2-decimal-points/
    DecimalFormat commTwoDecimal = new DecimalFormat("#,##0.##");
    // End Code Segment

    // Input Variables
    double startOrgNumber;
    double avgPopIncrease;
    int numMultDays;

    // Calculating Variables
    double popSize;

    System.out.print("How many organisms are in the population?: ");
    startOrgNumber = kb.nextDouble();

    while (startOrgNumber < 2) {
      System.out.println("You need at least 2 organisms in the population.");
      System.out.print("How many organisms are in the population?: ");
      startOrgNumber = kb.nextInt();
    }

    System.out.print("What is the average daily increase of the population as a percentage (Do not provide % sign)?: ");
    avgPopIncrease = kb.nextDouble();

    while (avgPopIncrease < 0) {
      System.out.println("The daily increase percentage cannot be negative.");
      System.out
          .print("What is the average daily increase of the population as a percentage (Do not provide % sign)?: ");
      avgPopIncrease = kb.nextDouble();
    }

    System.out.print("In how many days will the population be multiplying?: ");
    numMultDays = kb.nextInt();

    while (numMultDays < 1) {
      System.out.println("You need at least 1 day for the population to multiply.");
      System.out.print("In how many days will the population be multiplying?: ");
      numMultDays = kb.nextInt();
    }

    popSize = startOrgNumber;

    for (int daysCount = 1; daysCount <= numMultDays; daysCount++) {
      popSize += popSize * (avgPopIncrease / 100);
      // Decimal Format declaration from Mkyong.com: Java - Display double comma separated to 2 decimal places - https://www.mkyong.com/java/java-display-double-in-2-decimal-points/
      System.out.println("On Day " + daysCount + " the Population Size will be " + commTwoDecimal.format(popSize));
      // End Code Segment (Only commTwoDecimal usage)
    }

    kb.close();
  }

}
