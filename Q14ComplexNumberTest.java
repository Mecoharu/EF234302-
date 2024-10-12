package quiz_1;

import java.util.Scanner;

public class Q14ComplexNumberTest {

    public static void main(String[] args) {
        // Takes input
        Scanner input = new Scanner(System.in);

        
        System.out.println("Input first Complex number:");
        double real1 = input.nextDouble(); 

        System.out.println("Input first Imaginary number:");
        double imaginary1 = input.nextDouble();  

        Q14ComplexNumber num1 = new Q14ComplexNumber(real1, imaginary1); 

        
        System.out.println("Input second Complex number:");
        double real2 = input.nextDouble();  

        System.out.println("Input second Imaginary number:");
        double imaginary2 = input.nextDouble(); 

        Q14ComplexNumber num2 = new Q14ComplexNumber(real2, imaginary2);

        //Addition
        Q14ComplexNumber sum = num1.add(num2);
        System.out.println("Sum: " + sum);

        //Subtraction
        Q14ComplexNumber difference = num1.subtract(num2);
        System.out.println("Difference: " + difference);

        //Multiplication
        Q14ComplexNumber product = num1.multiply(num2);
        System.out.println("Product: " + product);
      
        input.close();

    }
}
