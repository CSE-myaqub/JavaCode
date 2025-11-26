//Muhammad Yaqub
import java.util.Scanner;
public class StockSold {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Welcome to the Stock Transaction Program!");
		//Gets the initial price per share
		System.out.print("Enter the initial price paid for 1 share of Pelican Corp.: ");
		double initialPrice = key.nextDouble();
		//Checks for a valid input
		if (initialPrice <= 0) {
            System.out.println("Invalid value entered for initial price! Exiting the program!");
            return;
        }
		//Gets the number of shares purchased
		System.out.print("Enter the number of Pelican Corp. shares purchased: ");
        int sharesPurchased = key.nextInt();
        if (sharesPurchased <= 0) {
            System.out.println("Invalid value entered for number of shares purchased! Exiting the program!");
            return;
        }
        //Calculates the total cost and commission during purchase
        double totalCost = initialPrice * sharesPurchased;
        double commissionPurchase = totalCost * 0.02;
        System.out.println("Total Cost for all shares purchased: $" + totalCost);
        System.out.println("Amount of commission paid to the stockbroker during purchase: $" + commissionPurchase);
        //Gets the sale price per share
        System.out.print("Enter the sale price of 1 share of Pelican Corp.: ");
        double salePrice = key.nextDouble();
        if (salePrice <= 0) {
            System.out.println("Invalid value entered for sale price! Exiting the program!");
            return;
        }
        //Gets the number of shares to sell
        System.out.print("Enter the number of Pelican Corp. shares you want to sell: ");
        int sharesSold = key.nextInt();
        if (sharesSold <= 0 || sharesSold > sharesPurchased) {
            System.out.println("Invalid value entered. The maximum of shares that can be sold is: " + sharesPurchased);
            System.out.println("Exiting the program!");
            return;
        }
        //Calculates the total sales and commission
        double totalSales = salePrice * sharesSold;
        double commissionSale = totalSales * 0.02;
        System.out.println("Total Sales Amount: $" + totalSales);
        System.out.println("Amount of commission paid to the stockbroker during sale: $" + commissionSale);
        //Calculates profit or loss
        double profit;
        if (sharesPurchased == sharesSold) {
            profit = totalSales - (totalCost + commissionPurchase + commissionSale);
        } else {
            profit = totalSales - ((initialPrice * sharesSold) + commissionPurchase + commissionSale);
        }
        //Displays profit or loss
        if (profit > 0) {
            System.out.println("The user made a profit of $" + profit + " on the stock sale");
        } else if (profit < 0) {
            System.out.println("The user made a loss of $" + "-"+(-profit) + " on the stock sale");
        }

        key.close();

	}

}
