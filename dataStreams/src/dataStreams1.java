import java.util.Scanner;

public class dataStreams1 {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    byte number1;
    byte number2;
    float number3;
    String message;

    System.out.print("Please enter a whole number");
    number1 = kb.nextByte();
    System.out.print("Please enter a whole number");
    number2 = kb.nextByte();
    System.out.print("Please enter a fractional number");
    number3 = kb.nextFloat();
    System.out.print("Please enter a message");
    message = kb.next();

    System.out.println("Data entered was:");
    System.out.println("number 1: " + number1);
    System.out.println("number 2: " + number2);
    System.out.println("number 3: " + number3);
    System.out.println("message : " + message);

    kb.close();
  }

}
