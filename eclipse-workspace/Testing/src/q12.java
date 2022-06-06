import java.util.Scanner;

public class q12 {

	public static void main(String[] args) {
		
		int distanceTraveled = 0;
		double travelCost = 0.0;
		String membershipStatus = "";
		
		if (distanceTraveled >= 0 && distanceTraveled <= 1000) {
			travelCost = 250.0;
			membershipStatus = "NA";
		}
		else if (distanceTraveled > 1000 && distanceTraveled < 5000) {
			travelCost = 750;
			membershipStatus = "NA";
		}
		else if (distanceTraveled > 10000) {
			travelCost = 1800;
			if (distanceTraveled < 20000) {
				membershipStatus = "Silver";
			}
			else {
				membershipStatus = "Gold";
			}
		}
		
		Scanner scanner = new Scanner (System.in);
		
		double price = 0.0;
		int size = 0;
		
		size = scanner.nextInt();
		
		switch(size) {
		case 32:
			price = 8.5;
		case 64:
			price = 13.0;
		case 128: 
			price = 21.50;
		case 256:
			price = 37.0;
		//default:
			//price = 50;
			
		
		}
		
		System.out.println(price);
		
	}

}
