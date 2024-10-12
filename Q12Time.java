package quiz_1;

 import java.util.Scanner;
 
public class Q12Time {
	
	//Function  to compute the angle between hours and minutes hand
public static double computeAngle(double hours, double minutes) {
	//Declare a double to get accurate value
	//Normalize hours and minutes to be within the valid range
	//And calculate the angle clock in degree
	
	double hour_hand = (hours % 12)* 30;
	hour_hand += minutes / 2;
	double minute_hand = minutes * 6;
	
	double result;
	
	//Calculate the smaller angle ,either angle difference or 360 - angle difference
	if(hour_hand <minute_hand) {
		result = 360 - Math.abs(hour_hand -  minute_hand);
	} else {
		result = Math.abs(hour_hand - minute_hand);
	}
	 return result; // the compute angle is returned as a double 
 }

public static void main(String[]args) {
	//Takes the input
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input the hour (0-24): ");
		double hours = Double.parseDouble(scanner.nextLine());
		System.out.println("Input the minutes (0-60):");
		double minutes = Double.parseDouble(scanner.nextLine());
		
		double angle = computeAngle(hours,minutes);
		
	//Round the angle otherwise the result will have a decimal value + a less accurate answer
		 System.out.println("Angle at " + (int)hours + ":" + (int)minutes + " = " + (Math.round(angle / 2) * 2) + "°");
		
	scanner.close();
		}

	}