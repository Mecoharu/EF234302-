package quiz_1;

public class Q16FractionTest {

	public static void main(String[] args) {
		// Declare two functions
		Q16Fraction f1 = new  Q16Fraction (1,2);
		Q16Fraction f2 = new Q16Fraction (3,7);
		
		//print the fraction in string with /
		System.out.println(f1.toString());
		//Get the current product of f2 and f1
		System.out.println(f2.getProduct(f1));
		//Get the sum of f2 and f1
		System.out.println(f2.getSum(f1));
	}

}
