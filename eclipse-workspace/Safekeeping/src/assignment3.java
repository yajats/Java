//============================================================================
// File Name   : FunMenu.java
// Author      : Yajat Sharma
// Copyright   : None
// Description : This program is just a fun menu of features. 

// Revision History:
// Date              Version         Author             Comment
// 05-09-22          1.0           Yajat Sharma       
//============================================================================

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class assignment3 {

	public static void main(String args[]){
		
		
		String choice = "";
		Scanner scanner = new Scanner (System.in);
		BufferedReader reader = null;
		reader = new BufferedReader  ( new InputStreamReader ( System.in ) );
		
		do {
		System.out.println("***********************************");
		System.out.println("*            FUN MENU             *");
		System.out.println("***********************************");
		System.out.println("           <S>um of natural integers");
		System.out.println("           <L>eap year check");
		System.out.println("           <C>ount vowels");
		System.out.println("           <A>rmstrong check");
		System.out.println("           <E>xit");
		
		System.out.print ( "Enter your choice (S, L, C, A, or E): " );
		try {
			choice = reader.readLine ( );
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        switch (choice) {
        	case "S":
        	case "s":
        		
        		System.out.println("Enter an integer: ");
        		
        		int integer = 0;
        		integer = scanner.nextInt();
        		int sum = 0;
        		
        		for(int x = 1; x <= integer; ++x)
                {
                    sum += x;
                }

                System.out.println("Sum = " + sum);
        		
                break;
                
        	case "L":
        	case "l":
        		
        		int year = 0;
        		
        		System.out.println("Input year to be checked: ");
        		year = scanner.nextInt();
        		
        		if (year % 4 == 0) {
        			if ((year % 100 == 0) && (year % 400 == 0)) {
        				System.out.println(year + " is a leap year.");
        			}
        			else if ((year % 100 == 0) && (year % 400 != 0)) {
        				System.out.println(year + " is not a leap year.");
        			}
        			else {
        				System.out.println(year + " is a leap year.");
        			}
        		}
        		else {
        			System.out.println(year + " is not a leap year.");
        		}
        		
        		break;
        		
        	case "C":
        	case "c":
        		
        		String string = "";
        		int count = 0;
        		int incrementer = 0;
        		
        		System.out.println("What is your sentence?: ");
			try {
				string = reader.readLine ( );
			} catch (IOException e) {
				e.printStackTrace();
			}
        		
        		while (incrementer < string.length()) {
        			char ch=string.charAt(incrementer);
        			if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
        		            count++;
        		         }
        			
        			incrementer++;
        		      }
        		 System.out.println("Number of vowels in the given sentence is "+count);
        		 
        		break;
        	
        	case "A":
        	case "a":
        		armstrong();
        		break;
        	case "E":
        	case "e":
        		
        		System.out.println("The fun is over. Have a nice day!!!");
        		
        		System.exit(0);
        		
        		break;
        		
        	default:
        		
        		System.out.println("Invalid letter: " + choice);
        		System.out.println("");
        		
       
        	
        }
		
		} while (!choice.equals("E") && !choice.equals("e"));
		scanner.close();
	}
	
	public static void armstrong(){
		  int num = 0;
		  int number = 0;
		  int temp = 0; 
		  int total = 0;
		  System.out.println("Enter 3 Digit Number");
		  BufferedReader reader = null;
		  reader = new BufferedReader  ( new InputStreamReader ( System.in ) );
		  try {
			num = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  number = num;
		  for( ;number!=0;number /= 10) {
		   temp = number % 10;
		   total = total + temp*temp*temp;
		  }
		 if(total == num) {
		  System.out.println(num + " is an Armstrong number");
		 }
		 else {
		  System.out.println(num + " is not an Armstrong number");
		 }
	}

}
