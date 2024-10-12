package quiz_1;

import java.util.Scanner;

public class Q15WeightTest {

	public static void main(String[] args) {
	//Takes input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pounds:");
		double pound = Double.parseDouble(input.nextLine());
		
		//Makes a new weight object
		 Q15Weight weight = new Q15Weight(pound);
		 
		 System.out.println(weight.getPounds());
		 
		 //print the pounds and kilograms
		 System.out.println("Weight in pounds:" + weight.getPounds());
		 System.out.println("Weight in kilogram:" + weight.getKilograms());
		
		 input.close();
	}


}
