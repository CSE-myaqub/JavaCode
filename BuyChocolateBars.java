//Muhammad Yaqub
import java.util.Scanner;
public class BuyChocolateBars {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("How many dollars would you like to spend on chocolate from the vending machine?");
		int dollars = key.nextInt();
		//Checks if input is valid
		if (dollars < 0) {
            System.out.println("Invalid value for amount! Exiting the program!");
            return; //stops the program here
        }
		int totalBars = dollars;
		int coupons = dollars;
		//Redeems coupons as long as theres 6 or more
        while (coupons >= 6) {
            int freeBars = coupons / 6;
            totalBars += freeBars;
            coupons = (coupons % 6) + freeBars; 
            //remaining coupons = leftover + new coupons from free bars
        }
        System.out.println("You can buy " + totalBars + " chocolate bars and will have " + coupons + " coupons left!");
	}

}
