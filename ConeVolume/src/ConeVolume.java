import java.util.Scanner;

public class ConeVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		double radius;
		double height;
		double pi = 3.1415926;
		double calculatedVolume;
		
		System.out.print("What is the radius of the base circle in cm?: ");
		
		radius = kb.nextDouble();

		System.out.print("What is the perpendicular height of the cone in cm?: ");
		
		height = kb.nextDouble();
		
		calculatedVolume = (pi/3.0) * radius * radius * height;
		
		System.out.println("Volume of the cone is " + calculatedVolume + "cm³.");
		
		kb.close();
	}

}
