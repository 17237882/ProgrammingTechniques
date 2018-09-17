import java.util.Scanner;

public class CalorieWatcher {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int numCookies;
		double caloriesInServing;
		double cookiesInServing;
		double caloriesConsumed;
		
		cookiesInServing = 4.0;
		caloriesInServing = 300.0;
		
		System.out.print("How many cookies have you eaten?: ");
		numCookies = kb.nextInt();

		caloriesConsumed = numCookies * (caloriesInServing/cookiesInServing);
		System.out.println("You have consumed " + caloriesConsumed + " calories.");
		
		kb.close();
	}

}
