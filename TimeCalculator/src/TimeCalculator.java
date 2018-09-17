import java.util.Scanner;

public class TimeCalculator {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double secondsInDay = 86400;
		double secondsInHour = 3600;
		double secondsInMinutes = 60;
		double seconds;
		double daysCalc;
		double hoursCalc;
		double minutesCalc;
		
		System.out.print("Please enter a number of seconds: ");
		
		seconds = kb.nextDouble();
		
		while(seconds <= 0) {
			System.out.println("Please enter a number greater than 0.");
			System.out.print("Please enter a number of seconds: ");
			seconds = kb.nextDouble();			 
		}
		
		daysCalc = seconds/secondsInDay;
		
		if (daysCalc >= 1) {
			System.out.println(seconds + " seconds is " + daysCalc + " days.");
		}
		else {
		hoursCalc = seconds/secondsInHour;
		
			if (hoursCalc >= 1) {
				System.out.println(seconds + " seconds is " + hoursCalc + " hours.");
			}
			else {
				minutesCalc = seconds/secondsInMinutes;
		
				if (minutesCalc >= 1) {
					System.out.println(seconds + " seconds is " + minutesCalc + " minutes.");
				}
				else {
					System.out.println(seconds + " seconds is less than a minute.");
				}
			}
		}
		kb.close();
	}

}
