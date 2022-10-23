package app;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CashRegister {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int twenty = 20;
		int twentyResult = 0;
		
		int ten = 10;
		int tenResult = 0;
		
		int five = 5;
		int fiveResult = 0;
		
		int one = 1;
		int oneResult = 0;
		
		double quarter = 0.25;
		int quarterResult = 0;		

		double dime = 0.10;
		int dimeResult = 0;

		double nickel = 0.05;
		int nickelResult = 0;
		
		double penny = 0.01;
		int pennyResult = 0;

		
		// User enters price of item
		System.out.println("Please enter price of item: ");
		double itemCost = scanner.nextDouble();
		scanner.nextLine();
		
		// User enters amount tendered
		System.out.println("Please enter amount tendered: ");
		double amountTendered = scanner.nextDouble();
		scanner.nextLine();
		
		// if statement to determine whether or not the customer provided enough money to cover the cost of the item
		if (itemCost == amountTendered) {
			System.out.println("Thankfully you provided the exact amount needed. I just ran out of change.");
		} 
		
		if (itemCost > amountTendered) {
			double owedResult = calculateAmountStillOwed(itemCost, amountTendered);
			if (owedResult < 1) {
				int owedResultInCents = (int)(owedResult * 100);
				System.err.print("Hang on there pal! You still owe " + owedResultInCents + "c!");
			} else {
				System.err.print("Hang on there pal! You still owe $" + df.format(owedResult) + "! ");
			}
		} 
		
		double changeResult = calculateTotalChange(itemCost, amountTendered);
		
		if (amountTendered > itemCost) {
			System.out.println("Your change comes out to $" + df.format(changeResult) + ".");

		}
		
		if(amountTendered > itemCost) {
			// step by step calculations for change to be given back to customer
			
			changeResult = Math.round(changeResult * 100.0) / 100.0;
			
			//	System.out.println(changeResult);
					
			
			twentyResult = (int) (changeResult / twenty);

			changeResult = changeResult - (twenty * twentyResult);
			
			changeResult = Math.round(changeResult * 100.0) / 100.0;

			
			//	System.out.println(changeResult);
			

			tenResult = (int) changeResult / ten;

			changeResult = changeResult - (ten * tenResult);
			
			changeResult = Math.round(changeResult * 100.0) / 100.0;

			
			//	System.out.println(changeResult);


			fiveResult = (int) changeResult / five;
			
			changeResult = changeResult - (five * fiveResult);
			
			changeResult = Math.round(changeResult * 100.0) / 100.0;

			
			//	System.out.println(changeResult);
			

			oneResult = (int) changeResult / one;
			
			changeResult = changeResult - (one * oneResult);
			
			changeResult = Math.round(changeResult * 100.0) / 100.0;

			
			//	System.out.println(changeResult);
			

			quarterResult = (int) (changeResult / quarter);
			
			changeResult = changeResult - (quarter * quarterResult);
			
			changeResult = Math.round(changeResult * 100.0) / 100.0;

			
			//	System.out.println(changeResult);
			
			
			dimeResult = (int) (changeResult / dime);
			
			changeResult = changeResult - (dime * dimeResult);
			
			changeResult = Math.round(changeResult * 100.0) / 100.0;

			
			//	System.out.println(changeResult);

			
			nickelResult = (int) (changeResult / nickel);
			
			changeResult = changeResult - (nickel * nickelResult);
			
			changeResult = Math.round(changeResult * 100.0) / 100.0;

			
			//	System.out.println(changeResult);

			
			pennyResult = (int) (changeResult / penny);
			
			changeResult = changeResult - (penny * pennyResult);
			
			changeResult = Math.round(changeResult * 100.0) / 100.0;

			
			//	System.out.println(changeResult);
			
			// created String to output exact change in dollars and cents
			
			String makeChangeFinale = "Your change comes out to: " + ifZeroTwenty(twentyResult) + ifZeroTen(tenResult) + ifZeroFive(fiveResult) + ifZeroOne(oneResult) + ifZeroQuarter((int) quarterResult) + ifZeroDime((int) dimeResult) + ifZeroNickel((int) nickelResult) + ifZeroPenny((int) pennyResult);
			if(makeChangeFinale.endsWith(", ")) {
				String substring = makeChangeFinale.substring(0, makeChangeFinale.length() - 2);
				String makeChangeFinaleV2 = substring + ".";
				System.out.println(makeChangeFinaleV2);
				farewell();
			} else {
				System.out.println(makeChangeFinale);
				farewell();
			}
						
		}
	
	}	

	
	public static double calculateTotalChange(double cost, double change) {
		// Calculate the total amount to be returned to the customer
		double result = (change - cost);
		return result;
	}
	
	public static double calculateAmountStillOwed(double cost, double given) {
		// Calculate the amount still owed in the case that the full amount was not provided
		double result = (cost - given);
		return result;
	}
	
	public static String ifZeroTwenty(int a) {
		String result = "";
		if (a == 0) {
			result = "";
		} else if (a == 1){
			result = Integer.toString(a) + " twenty dollar bill, ";
		} else {
			result = Integer.toString(a) + " twenty dollar bills, ";
		}
		return result;
	}
	
	public static String ifZeroTen(int a) {
		String result = "";
		if (a == 0) {
			result = "";
		} else if (a == 1){
			result = Integer.toString(a) + " ten dollar bill, ";
		} else {
			result = Integer.toString(a) + " ten dollar bills, ";
		}
		return result;
	}
	
	public static String ifZeroFive(int a) {
		String result = "";
		if (a == 0) {
			result = "";
		} else if (a == 1){
			result = Integer.toString(a) + " five dollar bill, ";
		} else {
			result = Integer.toString(a) + " five dollar bills, ";
		}
		return result;
	}
	
	public static String ifZeroOne(int a) {
		String result = "";
		if (a == 0) {
			result = "";
		} else if (a == 1){
			result = Integer.toString(a) + " one dollar bill, ";
		} else {
			result = Integer.toString(a) + " one dollar bills, ";
		}
		return result;
	}
	
	public static String ifZeroQuarter(int a) {
		String result = "";
		if (a == 0) {
			result = "";
		} else if (a == 1){
			result = Integer.toString(a) + " quarter, ";
		} else {
			result = Integer.toString(a) + " quarters, ";
		}
		return result;
	}
	
	public static String ifZeroDime(int a) {
		String result = "";
		if (a == 0) {
			result = "";
		} else if (a == 1){
			result = Integer.toString(a) + " dime, ";
		} else {
			result = Integer.toString(a) + " dimes, ";
		}
		return result;
	}
	
	public static String ifZeroNickel(int a) {
		String result = "";
		if (a == 0) {
			result = "";
		} else if (a == 1){
			result = Integer.toString(a) + " nickel, ";
		} else {
			result = Integer.toString(a) + " nickels, ";
		}
		return result;
	}
	
	public static String ifZeroPenny(int a) {
		String result = "";
		if (a == 0) {
			result = "";
		} else if (a == 1){
			result = Integer.toString(a) + " penny.";
		} else {
			result = Integer.toString(a) + " pennies.";
		}
		return result;
	}
	public static void farewell() {
		System.out.println("Thank you, come again!");
	}

}
