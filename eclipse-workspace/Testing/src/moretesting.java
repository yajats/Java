import java.util.Scanner;

public class moretesting {
	public static void main(String[] args) {
		int choice = 0;
		Scanner scanner = new Scanner ( System.in );

		do { 
		        // menu
		        System.out.println ( "\t\tMENU" );
		      System.out.println ( "1. Withdraw" );
		        System.out.println ( "2. Deposit" );
		        System.out.println ( "3. Show Balance" );
		        System.out.println ( "4. Quit" );
		        
		         // user choice request
		         System.out.print ( "Enter your choice (1-4): " );
		         choice = scanner.nextInt ( );
		         // process ATM user choice.
		         switch ( choice ) {
		                 // home work to be done.
		         }
		} while ( choice != 4 );
		scanner.close ( );
		
	}
}



