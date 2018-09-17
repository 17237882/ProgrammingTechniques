import java.util.Scanner;

public class SpeedOfSound {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		double speedInAir = 1100;
		double speedInWater = 4900;
		double speedInSteel = 16400;
		
		String medium;
		double distance;
		double timeTaken = 0;
		boolean mediumCheck = false;
		
		System.out.print("Please enter the medium of sound travel (Air, Water, or Steel): ");
		medium = kb.next();
		medium = medium.toLowerCase();
		
		if(medium.equals("air")) {
			mediumCheck = true;
		}
		else if(medium.equals("water")) {
			mediumCheck = true;
		}
		else if(medium.equals("steel")) {
			mediumCheck = true;
		}
		
		while(!mediumCheck) {		 
			System.out.println("Please enter a valid medium of sound travel.");
			System.out.print("Please enter the medium of sound travel (Air, Water, or Steel): ");
			medium = kb.next();
			medium = medium.toLowerCase();
			
			if(medium.equals("air")) {
				mediumCheck = true;
			}
			else if(medium.equals("water")) {
				mediumCheck = true;
			}
			else if(medium.equals("steel")) {
				mediumCheck = true;
			}		 
		}
		
		System.out.print("Please enter the distance in feet: ");
		distance = kb.nextDouble();
		
		while(distance <= 0) {
			System.out.println("Please enter a number greater than 0.");
			System.out.print("Please enter the distance in feet: ");
			distance = kb.nextDouble();
		}
		
		switch(medium){
			case "air":
				timeTaken = distance/speedInAir;
				break;
			case "water":
				timeTaken = distance/speedInWater;
				break;
			case "steel":
				timeTaken = distance/speedInSteel;
				break;
		}
		
		System.out.println("It will take " + timeTaken + " seconds for sound to travel " + distance + " feet.");
		
		kb.close();
	}

}
