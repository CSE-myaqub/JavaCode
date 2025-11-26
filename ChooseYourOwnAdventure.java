//Muhammad Yaqub
import java.util.Scanner;
public class ChooseYourOwnAdventure {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Welcome to the Food Adventure!");
		System.out.println("Make choices by typing the letter or number shown and pressing Enter.");
		System.out.println("Try different paths to find all endings.\n");
		// First decision: choose location (string comparison used later)
        System.out.println("Where do you want to go?");
        System.out.println("A) Street Food Festival");
        System.out.println("B) Fancy Restaurant");
        System.out.println("C) Farmer's Market");
        String first = getChoice(key, new String[] {"A", "B", "C"});
        boolean hasCoupon = false; 
        int money = 0; // Variables for later decisions
        // Street Food Festival Branch
        if (first.equalsIgnoreCase("A")) {
            System.out.println("\nAt the festival you see a coupon booth and an ATM.");
            System.out.println("A) Take a coupon");
            System.out.println("B) Withdraw $10");
            System.out.println("C) Ignore both");
            String festChoice = getChoice(key, new String[] {"A", "B", "C"});

        if (festChoice.equalsIgnoreCase("A")) {
                hasCoupon = true;
            } 
        else if (festChoice.equalsIgnoreCase("B")) {
                money = 10;
            }
            System.out.println("\nYou find a noodle stall. Do you buy noodles?");
            System.out.println("A) Yes");
            System.out.println("B) No");
            String noodleChoice = getChoice(key, new String[] {"A", "B"});
            if (noodleChoice.equalsIgnoreCase("A")) {
                if (hasCoupon && money > 0) { // Compound boolean check
                    System.out.println("The vendor accepts both coupon and cash and gives you extra noodles.");
                    System.out.println("Ending 1: Big Noodle Feast.");
                } 
                else if (money > 5) { // Numeric comparison
                    System.out.println("You buy noodles at full price. They are tasty but very spicy.");
                    System.out.println("Ending 2: Spicy Burn.");
                } 
                else {
                    System.out.println("You cannot pay the vendor and are asked to wash dishes in exchange.");
                    System.out.println("Ending 3: Dish Duty.");
                }
            } 
            else {
                System.out.println("You decide not to buy noodles and leave the festival early, still hungry.");
                System.out.println("Ending 4: No Dinner.");
            }
            }
            // Fancy Restaurant Branch
            else if (first.equalsIgnoreCase("B")) {
                System.out.println("\nYou enter the restaurant. Do you:");
                System.out.println("A) Sit at the Chef's Table");
                System.out.println("B) Try the Buffet");
                String restChoice = getChoice(key, new String[] {"A", "B"});

                if (restChoice.equalsIgnoreCase("A")) {
                    System.out.println("\nThe chef asks you to choose an ingredient to feature:");
                    System.out.println("A) Truffle");
                    System.out.println("B) Hot Sauce");
                    String ingChoice = getChoice(key, new String[] {"A", "B"});

                    if (ingChoice.equalsIgnoreCase("A")) {
                        System.out.println("The chef crafts a delicate, memorable meal for you.");
                        System.out.println("Ending 5: Fine Dining.");
                    } 
                    else {
                        System.out.println("The chef overuses hot sauce and the dish is overwhelmingly spicy.");
                        System.out.println("Ending 6: Too Spicy.");
                    }
                } 
                else {
                    System.out.println("\nThe buffet charges by plate size (1 to 5). Enter your plate size:");
                    int size = getNumber(key, 1, 5);

                    if (size < 3) {
                        System.out.println("You choose a moderate serving and enjoy a balanced meal.");
                        System.out.println("Ending 7: Healthy Choice.");
                    } 
                    else {
                        System.out.println("You overload your plate, eat too much, and fall into a food coma.");
                        System.out.println("Ending 8: Food Coma.");
                    }
                }
            }

            // Farmer's Market Branch
            else {
                System.out.println("\nYou arrive at the farmer's market. Do you:");
                System.out.println("A) Buy vegetables");
                System.out.println("B) Sample fruit");
                String marketChoice = getChoice(key, new String[] {"A", "B"});

                if (marketChoice.equalsIgnoreCase("A")) {
                    System.out.println("You buy fresh vegetables and cook a meal at home.");
                    System.out.println("Ending 9: Stir Fry Success.");
                } 
                else {
                    System.out.println("You sample fresh fruit and enjoy a light snack.");
                    System.out.println("Ending 9: Fruit Snack.");
                }
            }

            System.out.println("\n--- The Food Adventure Ends ---");
            key.close();
        }

        // Ensures you have a valid letter
        private static String getChoice(Scanner key, String[] allowed) {
            while (true) {
                System.out.print("Enter choice: ");
                String entry = key.nextLine().trim();
                for (String a : allowed) {
                    if (entry.equalsIgnoreCase(a)) {
                        return a.toUpperCase();
                    }
                }
                System.out.println("Invalid choice. Try again.");
            }
        }

        // Ensures a valid number inputed
        private static int getNumber(Scanner key, int min, int max) {
            while (true) {
                System.out.print("Enter a number (" + min + "-" + max + "): ");
                String line = key.nextLine().trim();
                try {
                    int n = Integer.parseInt(line);
                    if (n >= min && n <= max) {
                        return n;
                    } else {
                        System.out.println("Out of range. Try again.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Enter a valid integer.");
                }
        }

	}

}
