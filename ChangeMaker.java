package Practice;

import java.util.Scanner;
import java.math.*;

public class ChangeMaker {

	public static void main(String[] args) {
						
		Scanner input = new Scanner(System.in);

		System.out.print("Enter amount due: ");
		BigDecimal dueAmount = input.nextBigDecimal();

		System.out.print("Enter amount paid: ");
		BigDecimal paidAmount = input.nextBigDecimal();
		
		BigDecimal changeDue = paidAmount.subtract(dueAmount);
		System.out.println("Change Due: " +changeDue);
		changeDue = changeDue.multiply(new BigDecimal(100));	
		int coinsDue = changeDue.intValue();
		System.out.println("Coin Amount Due: " + coinsDue);
		
		coinsDue = CalcQuarters(coinsDue);	
		coinsDue = CalcDimes(coinsDue);	
		coinsDue  = CalcNickels(coinsDue);	
		coinsDue = CalcPennies(coinsDue);	

		input.close();
	}
		//Change Calculator 
		//A retail store is building a kiosk to enter sales and handle transactions. When 
		//people use cash to pay for an item, the kiosk needs to tell the cashier how much 
		//change should be given back to the customer. 
		//RESULT: Quarters: 3 
		//Dimes: 0 
		//Nickels: 1 
		//Pennies: 2
		
	public static int CalcQuarters(int coinsDue) {
		System.out.println();
		int quarterCount = coinsDue / 25;
		System.out.println("Quarters Due: " + quarterCount);
		coinsDue = coinsDue - (quarterCount*25);	
		return coinsDue;
	}
	public static int CalcDimes(int coinsDue) {
		int dimeCount = coinsDue / 10;
		System.out.println("   Dimes Due: " + dimeCount);
		coinsDue = coinsDue - (dimeCount*10);
		return coinsDue;
	}
	public static int CalcNickels(int coinsDue) {	
		int nickelCount = coinsDue / 5;
		System.out.println(" Nickels Due: " + nickelCount);
		coinsDue = coinsDue - (nickelCount*5);
		return coinsDue;
	}
	public static int CalcPennies(int coinsDue) {
		int pennyCount = coinsDue / 1;
		System.out.println(" Pennies Due: " + pennyCount);
		coinsDue = coinsDue - (pennyCount*1);
		return coinsDue;
	}
}
