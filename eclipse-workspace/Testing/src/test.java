import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class test {

	public static void main(String[] args) {
		
		BufferedReader reader = null;
		reader = new BufferedReader  ( new InputStreamReader ( System.in ) );

		
		
		int size = 0;
		try {
			size = reader.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		double price = 0;
		switch(size) {
		case 32:
			price = 8.5;
		case 64:
			price = 13.0;
		case 128: 
			price = 21.50;
		case 256:
			price = 37.0;
		default:
			price = 50;
				
	}
		System.out.println(price);
}
}
