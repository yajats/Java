import javax.swing.JOptionPane;

public class IFELSEandRANDOMtest {

	public static void main(String[] args) {
		double grade = 0.0;
		String lettergrade = "";
		String message = new String ( "" );
		String grades = JOptionPane.showInputDialog ( null, "What's your grade? " );
		

		try {
			grade = Integer.parseInt (grades);
		}
		catch ( NumberFormatException e ) {
			e. printStackTrace ();
		}

		if (grade >= 90.0) {
			lettergrade = "A";
		}
		
		else if (grade >= 80.0 && grade <= 89.99) {
			lettergrade = "B";
		}
		
		else if (grade >= 70.0 && grade <= 79.99) {
			lettergrade = "C";
		}
		
		else if (grade >= 60.0 && grade <= 69.99) {
			lettergrade = "D";
		}
		
		else {
			lettergrade = "F";
		}

		
		message = "Grade: "+ lettergrade;
		JOptionPane.showMessageDialog( null, message );

	}

}
