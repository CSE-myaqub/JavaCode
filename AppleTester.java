//Muhammad Yaqub
import java.util.Scanner;
public class AppleTester {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Welcome to the Apple tester!!!");
        System.out.println("Creating the first apple!");
        System.out.println("Default values of the first apple object:");
        Apple apple1 = new Apple();//creates first apple using default constructor
        apple1.writeOutput();//displays default apple info
        System.out.println("Enter the type of the second apple object:");
        String type = key.nextLine();
        System.out.println("Enter the weight of the second apple object:");
        double weight = key.nextDouble();
        System.out.println("Enter the price of the second apple object:");
        double price = key.nextDouble();
        System.out.println("Creating the second apple object!");
        Apple apple2 = new Apple(type, weight, price);
        System.out.println("Values of the second apple object:");
        apple2.writeOutput();//displays the second apple’s info
        key.close();
	}

}
