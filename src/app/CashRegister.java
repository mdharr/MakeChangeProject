package app;

import java.util.Scanner;

public class CashRegister {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int twenty = 20;
		int twentyResult = 0;
		int ten = 10;
		int tenResult = 0;
		int five = 5;
		int fiveResult = 0;
		int one = 1;
		int oneResult = 0;
		int quarterResult = 0;
		double quarter = 0.25;
		int dimeResult = 0;
		double dime = 0.10;
		int nickelResult = 0;
		double nickel = 0.05;
		int pennyResult = 0;
		double penny = 0.01;

		
		// User enters price of item
		System.out.println("Please enter price of item: ");
		double itemCost = scanner.nextDouble();
		
		// User enters amount tendered
		System.out.println("Please enter amount tendered: ");
		double amountTendered = scanner.nextDouble();
		
		System.out.println("");
		
		// if statement to determine whether or not the customer provided enough money to cover the cost of the item
		if (itemCost == amountTendered) {
			System.out.println("Thankfully you provided the exact amount needed. I just ran out of change.");
		} else if (itemCost > amountTendered) {
			System.out.println("Hang on there pal! That's not enough!");
			double owedResult = calculateAmountStillOwed(itemCost, amountTendered);
			if (owedResult < 1) {
				int owedResultInCents = (int)(owedResult * 100);
				System.out.print("You still owe " + owedResultInCents + "c! Please pay the remaining amount.");
			} else {
				System.out.print("You still owe $" + owedResult + "! ");
			}
			System.out.println("");
			double remainder = itemCost - amountTendered;
			while (remainder < owedResult) {
				System.out.print("Please pay the remaining amount: ");
				remainder = scanner.nextDouble();
				if (remainder == owedResult) {
					System.out.println("Correct amount received. Thank you.");
				} else {
					continue;
				}
			}
		} else {
			System.out.println("One moment please while I calculate your change...");
			double changeResult = calculateTotalChange(itemCost, amountTendered);
			System.out.println("You are owed the amount of $" + changeResult + " in change.");
			System.out.println("One moment while your change is prepared...");
			if (changeResult >= 20) {
				while(changeResult / twenty >= 1) {
					twentyResult++;
				}
			}
			
			changeResult = changeResult - (twenty * twentyResult);
			
			if (changeResult >= 10) {
				while(changeResult / ten >= 1) {
					tenResult++;
				}
			}
			
			changeResult = changeResult - (ten * tenResult);
			
			if (changeResult >= 5) {
				while(changeResult / five >= 1) {
					fiveResult++;
				}
			}

			changeResult = changeResult - (five * fiveResult);
			
			if (changeResult >= 1) {
				while(changeResult / one >= 1) {
					oneResult++;
				}
			}

			changeResult = changeResult - (one * oneResult);
			
			if (changeResult >= 0.25) {
				while(changeResult / quarter >= 1) {
					quarterResult++;
				}
			}

			changeResult = changeResult - (quarter * quarterResult);
			
			if (changeResult >= 0.10) {
				while(changeResult / dime >= 1) {
					dimeResult++;
				}
			}			

			changeResult = changeResult - (dime * dimeResult);
			
			if (changeResult >= 0.05) {
				while(changeResult / nickel >= 1) {
					nickelResult++;
				}
			}

			changeResult = changeResult - (nickel * nickelResult);
			
			if (changeResult >= 0.01) {
				while(changeResult / penny >= 1) {
					pennyResult++;
				}
			}

			changeResult = changeResult - (penny * pennyResult);
			System.out.println("Your change comes out to: " + ifZeroTwenty(twentyResult) + ifZeroTen(tenResult) + ifZeroFive(fiveResult) + ifZeroOne(oneResult) + ifZeroQuarter(quarterResult) + ifZeroDime(dimeResult) + ifZeroNickel(nickelResult) + ifZeroPenny(pennyResult));
			System.out.println("Thank you, come again.");
			
			scanner.close();
		}
	}
	
	public static double calculateTotalChange(double cost, double change) {
		// Calculate the total amount to be returned to the customer
		double result = (cost - change) * -1;
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
	

}
