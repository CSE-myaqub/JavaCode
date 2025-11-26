//Muhammad Yaqub
import java.util.Scanner;
public class GasPrice {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		 double[] prices = new double[7]; //stores gas prices for 7 days
	        double total = 0; //calculates the sum of all gas prices

	        //loop to get gas prices
	        for (int i = 0; i < prices.length; i++) {
	            System.out.print("Enter the gas price(per gallon) on Day " + (i + 1) + ": ");
	            prices[i] = key.nextDouble();
	            total += prices[i];
	        }
	        double average = total / prices.length;
	        System.out.printf("The average price for 1 gallon of gas during the last 7 days = $%.2f%n", average);
	        System.out.println("The price was above average on");
	        for (int i = 0; i < prices.length; i++) {
	            if (prices[i] > average) { //checks if the price on that day is above average
	                System.out.printf("Day %d: $%.2f%n", (i + 1), prices[i]);
	            }
	        }
	        key.close();
	}

}
