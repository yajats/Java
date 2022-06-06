//============================================================================
// File Name   : AmcTicket.java
// Author      : Yajat Sharma
// Copyright   : None
// Description : This program is to display a AMC movie ticket stub. 

// Revision History:
// Date              Version         Author             Comment
// 04-14-22          1.0           Yajat Sharma       Initial creation
//============================================================================

import java.util.*;

public class AmcTicket {

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
		
		timeHour = 3;
		timeMinute = 20;
		dateMonth = 04;
		dateDay = 15;
		dateYear = 2022; 
		location = 10;
		admissionPrice = 12.75;
		title = "A Star is Born Encore";
		AmPm = "PM";
		rating = "PG-13";
		
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
