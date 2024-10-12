package quiz_1;

public class Q15Weight {
	
	//Declare a double to get accurate value
	private double pound;
	private double kilogram;
	
	//constructor to take pound input and set to pound
	//set kilogram to pound *0.45359237 
	//1 pound = 0.45359237 kilogram
	
//Constructor to initialize the weight	
public Q15Weight(double pounds){
		this.pound = pounds;
		this.kilogram = this.convertToKilo(pounds);
		
	}
	//Convert pound to kilogram
	public double convertToKilo(double pounds) {
		return pounds * 0.45359237; 
	}
	
	//Getters for pounds and kilogram
	public double getPounds() {
		return pound;
	}
	public double getKilograms() {
		return kilogram;
	}
	 
}
