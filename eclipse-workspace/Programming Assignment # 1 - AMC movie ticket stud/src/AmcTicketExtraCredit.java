//============================================================================
// File Name   : AmcTicketExtraCredit.java
// Author      : Yajat Sharma
// Copyright   : None
// Description : This program is to display a AMC movie ticket stub and the user can input whatever they want. 

// Revision History:
// Date              Version         Author             Comment
// 04-14-22          2.0           Yajat Sharma       Second creation
//============================================================================

import java.util.*;


public class AmcTicketExtraCredit {

	public static void main(String[] args) {
		
		int timeHour = 0;
		int timeMinute = 0;
		int dateMonth = 0;
		int dateDay = 0;
		int dateYear = 0;
		int location = 0;
		double admissionPrice = 0.0;
		String title = "";
		String AmPm = "";
		String rating = "";
		
		Scanner hour = new Scanner(System.in);  
	    System.out.println("Enter hour");
	    timeHour = hour.nextInt();
	    
	    Scanner min = new Scanner(System.in);  
	    System.out.println("Enter minute");
	    timeMinute = min.nextInt();
	    
	    Scanner month = new Scanner(System.in);  
	    System.out.println("Enter month");
	    dateMonth = month.nextInt();
	    
	    Scanner day = new Scanner(System.in);  
	    System.out.println("Enter day");
	    dateDay = day.nextInt();
	    
	    Scanner year = new Scanner(System.in); 
	    System.out.println("Enter year");
	    dateYear = year.nextInt();
	    
	    Scanner loc = new Scanner(System.in); 
	    System.out.println("Enter theater number");
	    location = loc.nextInt();
	    
	    Scanner price = new Scanner(System.in);
	    System.out.println("Enter price");
	    admissionPrice = price.nextDouble();
	    
	    Scanner name = new Scanner(System.in);
	    System.out.println("Enter title");
	    title = name.nextLine();
	    
	    Scanner TOD = new Scanner(System.in);  
	    System.out.println("Enter AM or PM");
	    AmPm = TOD.nextLine();
	    
	    Scanner rate = new Scanner(System.in);  
	    System.out.println("Enter rating");
	    rating = rate.nextLine();
		
		System.out.println ("                                        AMC Universal CityWalk");
		System.out.println ("");
		System.out.println ("                                              Presenting");
		System.out.println ("");
		System.out.println ("             			        " + title);
		System.out.println ("");
		System.out.print ("       				 Show Time: " + timeHour + ":" + timeMinute + " " + AmPm );
		System.out.println ("  Date: " + "0" + dateMonth + "/" + dateDay + "/" + dateYear);
		System.out.println ("");
		System.out.print ("                                 Theater: " + location);
		System.out.println ("             " + rating);
		System.out.println ("");
		System.out.println ("                                 Adult Admission $" + admissionPrice);
		System.out.println ("");
		System.out.print("                                 Don't forget to get your free small popcorn with 4 tickets or more!!!");
		
	}

}
