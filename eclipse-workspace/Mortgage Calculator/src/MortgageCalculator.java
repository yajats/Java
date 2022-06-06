//============================================================================
// File Name   : MortgageCalculator.java
// Author      : Yajat Sharma
// Copyright   : None
// Description : This program is to calculate a person's mortgage. 

// Revision History:
// Date              Version         Author             Comment
// 04-27-22          1.0           Yajat Sharma       Initial creation
//============================================================================

import java.util.Scanner;

public class MortgageCalculator {

	public static void main(String[] args) {
		int zip = 0;
		String address = "";
		double interestRate = 0.0;
		int yearsFinance = 0;
		int price = 0;
		double downPayPercent = 0.0;
		double propTaxRate = 1.5;
	     
		Scanner ZIP = new Scanner(System.in);  
	    System.out.println("Enter property zip code: ");
	    zip = ZIP.nextInt();
	    
	    Scanner Address = new Scanner(System.in); 
	    System.out.println("Enter property address: ");
	    address = Address.nextLine(); 
	    
	    Scanner Rate = new Scanner(System.in);
	    System.out.println("Enter annual interest rate: ");
	    interestRate = Rate.nextDouble(); 
	    
	    Scanner YearsFinance = new Scanner(System.in);
	    System.out.println("Enter number of years financing: ");
	    yearsFinance = YearsFinance.nextInt();
	    
	    Scanner Price = new Scanner(System.in);
	    System.out.println("Enter property offer price: ");
	    price = Price.nextInt();
	    
	    Scanner DownPayment = new Scanner(System.in);
	    System.out.println("Enter down payment (in percentage %): ");
	    downPayPercent = DownPayment.nextDouble();
	    
	    System.out.println("Mortgage calculator is processing your data ... Please wait ...");
	    
	    try {
	        Thread.sleep (3000);   // sleep for 3 seconds.
	    }
	    catch (Exception e ) {
	         e.printStackTrace ( );   
	    }
	    
	    double downPayment = price * downPayPercent / 100.0;
	    double loanAmount = (1-downPayPercent/100) * price;
	    int maturityRate = 2022 + yearsFinance;
	    double mortMonthPay = ((1-downPayPercent/100) * price) * interestRate/1200 / (1-1/Math.pow(1+interestRate/1200, yearsFinance*12));
	    double monthPayTax = (((1-downPayPercent/100) * price) * interestRate/1200 / (1-1/Math.pow(1+interestRate/1200, yearsFinance*12))+ price * propTaxRate / 100 / 12);
	    double total = (((1-downPayPercent/100) * price) * interestRate/1200 / (1-1/Math.pow(1+interestRate/1200, yearsFinance*12))* 12 * yearsFinance);
	    
	    System.out.println("");
		System.out.println("	**************************************");
		System.out.println("");
		System.out.println("	     MORTGAGE CALCULATOR RESULTS");
		System.out.println("");
		System.out.println("	**************************************");
		System.out.println("");
		System.out.println("Property address: 				" + address + " " + zip);
		System.out.println("");
		System.out.println("Property offer price: 				$" + price);
		System.out.println("");
		System.out.println("Down payment: 					$" + downPayment);
		System.out.println("");
		System.out.println("Loan amount: 					$" + loanAmount);
		System.out.println("");
		System.out.println("Loan maturity date: 				12/31/" + maturityRate);
		System.out.println("");
		System.out.println("Mortgage monthly payment: 			$" + mortMonthPay);
		System.out.println("");
		System.out.println("Monthly payment (property tax included): 	$" + monthPayTax);
		System.out.println("");
		System.out.println("Total Payment: 					$" + total);
		System.out.println("");
		
	}

}
