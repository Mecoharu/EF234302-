package quiz_1;

public class Q14ComplexNumber {

		// Program to store the real and imaginary number of the complex number
		private double real;
		private double imaginary;
		
		//Constructor to initialize the complex number with its real and imaginary parts
	public  Q14ComplexNumber (double real, double imaginary) {
		this.real = real;
		this.imaginary= imaginary;
	}
	
	// Getter for the real part
    public double getReal() {
        return real;
    }

    // Getter for the imaginary part
    public double getImaginary() {
        return imaginary;
    }
    
	//Method to add the two complex numbers
	public Q14ComplexNumber add (Q14ComplexNumber num) {
		double newReal = this.real + num.real;
		double newImaginary = this.imaginary + num.imaginary;
		
		return new Q14ComplexNumber(newReal, newImaginary);
	}
	//Method to subtract  
	public Q14ComplexNumber subtract(Q14ComplexNumber num) {
		double newReal = this.real - num.real;
		double newImaginary = this.imaginary - num.imaginary;
		
		return new Q14ComplexNumber(newReal, newImaginary);
	}
	
	//Method to multiply
	public Q14ComplexNumber multiply (Q14ComplexNumber num) {
		double newReal = (this.real * num.real) - (this.imaginary * num.imaginary);
        double newImaginary = (this.real * num.imaginary) + (this.imaginary * num.real);
        
        return new Q14ComplexNumber(newReal, newImaginary);
    }
	// Format  the complex number to a string with a form "a + bi"
	public String toString() {
		return real + "+" + imaginary + "i";
	}
	
}

		
