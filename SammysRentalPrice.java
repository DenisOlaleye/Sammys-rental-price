/*Sammy’s Seashore Supplies rents beach equipment such as kayaks, canoes, beach
chairs, and umbrellas to tourists. Write a program that prompts the user for the
number of minutes he rented a piece of sports equipment. Compute the rental
cost as $40 per hour plus $1 per additional minute. (You might have surmised
already that this rate has a logical flaw, but for now, calculate rates as described
here. You can fix the problem after you read the chapter on decision making.)
Display Sammy’s motto with the border that you created in the SammysMotto2
class in Chapter 1. Then display the hours, minutes, and total price. Save the file
as SammysRentalPrice.java.*/

import java.util.Scanner;

public class SammysRentalPrice {

	public static void main(String[] args) 
	{
		int numberOfMinutes;
		final int COST = 40;
		final int MINUTES_OVER = 1;
		int hours;
		int minutes;
		int totalPrice;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Who long will you use the equipment? (minutes)");
		numberOfMinutes = input.nextInt();
		
		
		hours = numberOfMinutes/60;
		minutes = numberOfMinutes%60;
		
		int hoursPrice = hours*40;
		int minutesPrice = minutes;
		totalPrice = hoursPrice+minutesPrice;
		
		System.out.println("You used equipment for " +hours+ " hours and " +minutes+ " minutes.\n"
				+"Total price is " +totalPrice);
		
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS\n"
		         + "SS                                SS\n"
			     + "SS Sammy's make it fun in the sun SS\n"
				 + "SS                                SS\n"				         
				 + "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		
	}
}
