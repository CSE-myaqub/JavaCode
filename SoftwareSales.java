// Muhammad Yaqub

import java.util.Scanner;

public class SoftwareSales {

	public static void main(String[] args) {
		final double packagePrice = 99.0;

		Scanner key = new Scanner(System.in);

        // asks the user the prompt
        System.out.println("Enter the total number of software packages ordered:");
        int quantity = key.nextInt();

        // checks if you put in a valid input
        if(quantity < 10) {
            System.out.println("Invalid value for package count! Exiting the program!");
            return; // Exit program
        }

        // calculates the total before discount
        double totalBeforeDiscount = quantity * packagePrice;

        // determines the discount rate
        double discountRate = 0.0;
        if(quantity >= 10 && quantity <= 19) {
            discountRate = 0.20;
        }
        else if(quantity >= 20 && quantity <= 49) {
            discountRate = 0.30;
        }
        else if(quantity >= 50 && quantity <= 99) {
            discountRate = 0.40;
        }
        else if(quantity >= 100) {
            discountRate = 0.50;
        }

        // calculates the discount and final total
        double discountAmount = totalBeforeDiscount * discountRate;
        double totalAfterDiscount = totalBeforeDiscount - discountAmount;

        // outputs the results
        System.out.println("Total Bill Amount (before discount) = $" + totalBeforeDiscount);
        System.out.println("Amount of discount = $" + discountAmount);
        System.out.println("Total Bill Amount (after discount) = $" + totalAfterDiscount);

        key.close();
	}

}
