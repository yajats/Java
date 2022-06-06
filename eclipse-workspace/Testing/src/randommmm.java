import java.util.Scanner;

public class randommmm {

	public static void main(String[] args) {
		
		
		String choice = "";
		Scanner scanner = new Scanner (System.in);
		
		do {
		System.out.println("***********************************");
		System.out.println("*            FUN MENU             *");
		System.out.println("***********************************");
		System.out.println("           <S>um of natural integers");
		System.out.println("           <L>eap year check");
		System.out.println("           <C>ount vowels");
		System.out.println("           <E>xit");
		
		System.out.print ( "Enter your choice (S, L, C, or E): " );
        choice = scanner.nextLine();
        System.out.println(choice);
		
	}while(true);

}

}