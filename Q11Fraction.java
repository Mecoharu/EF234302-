package quiz_1;

import java.util.Scanner;

public class Q11Fraction {
	public static int findGCD(int num1,int num2) {
		if (num2 == 0) {
			return num1;
		}
		return findGCD(num2, num1 % num2);
		}
	
	// Java function to add two fraction
public static String Operation (int mode,int num1,int num2,int den1,int den2) {
	int num = 0, den ,gcd;
 
	//numerator of the fraction
	//denominator of the fraction
	
	// if mode ==1 , we're gonna do addition, and else multiplication
if (mode == 1) {
	num = (num1 * den2) + (num2 * den1); 
} else if(mode == 2) {
	num = num1 * num2;
}
	den = den1 * den2;
	
	// get the GCD to simplify the fraction
	gcd = findGCD(num,den);
	num = num / gcd;
	den = den / gcd;
	
	return num + "/" + den;
}

public static void main(String[] args) {
	//Take the input
	
	Scanner input = new Scanner(System.in);
	System.out.println("Input first fraction(Numerator,denominator):");
	int num1 = input.nextInt();
	int den1 = input.nextInt();
	
	System.out.println("Now your second fraction:");
	int num2 = input.nextInt();
	int den2 = input.nextInt();
	
	//Operate and print accordingly
	String add_result = Operation(1, num1, num2, den1, den2);
	String multi_result = Operation (2, num1, num2, den1, den2);
	System.out.println("Addition:" + add_result + "\n" + "Multiplication:" + multi_result);
	
	input.close();
	
	}

}