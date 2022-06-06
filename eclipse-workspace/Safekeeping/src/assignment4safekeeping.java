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
import java.util.Random;
import java.util.Scanner;

public class CarDealerApp {

    private static BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));


    public static void  main ( String [] args ) {
    	
    	final int arraySize = 16;
    	
    	String [] makeModels = new String [arraySize];
    	int [] years = new int [arraySize];
    	double [] prices = new double [arraySize];
    	loadVehicleInventory(makeModels, years, prices);
    	
    	do {
    		menu();
    		
    		int userChoice = getUserChoice();
    		
    		
    		switch(userChoice) {
    			case 1: 
    				viewInventory(makeModels, years, prices);
    				break;
    			
    			case 2:
    				
    				System.out.println("case was 2");
    				break;
    			case 3:
    				
    				System.out.println("case was 3");
    				break;
    			default:
    				
    				System.out.println("invalid choice bruh");
    				break;
    		}
    		
    	} while (getUserChoice() != 3);
    	
    	
   
   }

   public static int getUserChoice() {

	   String choice = null;
		try {
			choice = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        return Integer.parseInt(choice);

   }
   
   public static void loadVehicleInventory(String [] makeModels, int [] years, double [] prices){

       String makeModel= "";

       int year = 0;

       double price = 0.0;

       int randomNumber = 0;

       double LO = 0.0;

       double HI = 0.0;

     

      System.out.println ( "\t\tWelcome to Foothill Dealership\n" + "\tLoading vehicles from Inventory. Please wait ...\n\n");



      try {
	        Thread.sleep (3000);   // sleep for 3 seconds.
	    }
	    catch (Exception e ) {
	         e.printStackTrace ( );   
	    }



       Random generator = new Random();   // import the right Java package for this Random class

      

       for (int i = 0; i < makeModels.length; i++){

              randomNumber = generator.nextInt(4);

              switch (randomNumber){
              
              	case 0:
              		makeModel = "Ford Taurus";
              		LO = 9000;
              		HI = 27000;
              		break; 
              		
              	case 1: 
              		makeModel = "Toyota Camry";
              		LO = 12000;
              		HI = 30000;
              		break;
              	
              	case 2:
              		makeModel = "BMW 335i";
              		LO = 39500;
              		HI = 53500;
              		break;
              	
              	case 3:
              		makeModel = "Rolls-Royce Phantom Coupe";
              		LO = 40000;
              		HI = 99999;
              		break;
              						
              }


            price = LO + generator.nextDouble ( ) * ( HI - LO );
            int randYear = generator.nextInt(7);
            year = randYear + 2010;
                            
            makeModels[i] = makeModel;
            years[i] = year;
            prices[i] = price;
            

                      

       }
}
   
   public static void viewInventory (String [] makeModels, int [] years, double [] prices) {
	   
	   System.out.println("   --------------------------------------------");
	   System.out.println("");
	   System.out.println("                |           VEHICLE INVENTORY     |");
	   System.out.println("");
	   System.out.println("   --------------------------------------------");
	   
	   for (int i = 0; i < 16; i++) {
			
		   	System.out.printf("%25s", makeModels[i]);	
			System.out.print(" ");
			System.out.print(" ");
			System.out.print("  " + years[i]);
			System.out.print(" ");
			System.out.print(" ");
			System.out.println("  " + prices[i]);
			
		
   }
 }
   
   public static void menu () {
	   	System.out.println("                 Welcome to Foothill Dealership");
		System.out.println("       Loading vehicles from Inventory. Please wait ...");
		System.out.println("");
		System.out.println("");
		System.out.println("             SMART CAR INQUIRY");
		System.out.println("1. View Vehicle Inventory ");
		System.out.println("2. Search by make and model");
		System.out.println("3. Quit");
		System.out.println("");
		System.out.print("Enter your choice (1, 2, or 3): ");
   }
   
   public static void quit ( ) {
         // close reader in here -- must use a try/catch block for it
   }
}