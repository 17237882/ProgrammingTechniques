
/*
Student ID: 17237882
Name: Dhammika Emmanuel Mendis
Campus: Parramatta
Tutor Name: Nick Tothill
Class Day: Monday
Class Time: 2pm
*/

import java.util.Scanner;

public class TestAverage_17237882 {

  public static void main(String[] args) {
    // Declare and Initialise Keyboard scanner to receive user input
    Scanner keyboard = new Scanner(System.in);

    // Static Variables - Predefined values to be used in the application
    int maxGrades = 5;
    
    // Input Variable - Contain information provided by user
    int[] userScores = new int[maxGrades];

    // Calculated Variables - Contain information derived from user information
    double averageScore;

    // Message Variables - Contain String messages to be displayed to the user
    String introMess = "Please enter 5 of your scores";
    String scoreEntryMess;
    String scoreEntryMessErr = "Your score cannot be negative or greater than 100.";
    String resultIntro = "Your Scores and Grades are as follows:";
    String gradeResMess;
    String averageResMess;

    // Introduce user to application by asking to enter scores
    System.out.println(introMess);

    // Loop through asking user to enter scores, repeat until maxGrades static value is hit
    for (int scoreCount = 0; scoreCount < maxGrades; scoreCount++) {
      scoreEntryMess = "Please enter Score " + (scoreCount + 1) + ": ";

      // Ask for score and capture into variable
      userScores[scoreCount] = getInt(scoreEntryMess, keyboard);
      // Validate score provided is a positive, less than or equal to 100, non zero double value
      userScores[scoreCount] = valPositiveLessHundredInt(userScores[scoreCount], scoreEntryMess,
                                                          scoreEntryMessErr, keyboard);
    }

    // Initialise Intro Message for results for user
    System.out.println(resultIntro);

    // Loop through determining the grade for each score, repeat until maxGrades static value is hit
    for (int scoreCount = 0; scoreCount < maxGrades; scoreCount++) {
      // Initialise/Reset Grade Result Message based on grade determined
      gradeResMess = "Score " + (scoreCount + 1) + ": " + userScores[scoreCount] + " | "
                      + determineGrade(userScores[scoreCount]);
      
      // Display score alongside determined grade
      System.out.println(gradeResMess);
    }
    
    // Calculate user's average score and create message
    averageScore = calcAverage(userScores);
    averageResMess = "Your average test score is " + String.format("%.2f", averageScore) + ".";
    
    // Display average score result
    System.out.println(averageResMess);
    
    // Close Keyboard Scanner to prevent memory leak
    keyboard.close();
  }

  // Method to present message to user and return next integer entered
  public static int getInt(String inputMess, Scanner keyboard) {
    System.out.print(inputMess);
    return keyboard.nextInt();
  }
  
  // Method to validate user has provided valid positive, less than or equal to 100,
  // non-zero integer, if invalid, ask for integer again
  public static int valPositiveLessHundredInt(int numToVal, String inputMess,
                                                String errMess, Scanner keyboard) {
    while (numToVal < 0 || numToVal > 100) {
      System.out.println(errMess);
      numToVal = getInt(inputMess, keyboard);
    }

    return numToVal;
  }
  
  // Method to calculate average value of all values in an integer array
  public static double calcAverage(int[] values) {
    // Initialise arrSum to use += assignment operator
    int arrSum = 0;
    
    // Loop through each value in the array, adding the value of each to arrSum
    for (int count = 0; count < values.length; count++) {
      arrSum += values[count];
    }
    
    // Divide the sum of all values in the array by number of values in the array
    return (double) arrSum / (double) values.length;
  }
  
  // Method to determine the Grade Letter based on a provided score
  public static char determineGrade(int score) {
    
    if (score >= 90) {
      return 'A';
    } else if (score >= 80) {
      return 'B';
    } else if (score >= 70) {
      return 'C';
    } else if (score >= 60) {
      return 'D';
    } else {
      return 'F';
    }
  }
}
