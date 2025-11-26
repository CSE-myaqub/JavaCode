//Muhammad Yaqub
import java.util.Scanner;
public class CoffeeTester {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Welcome to Coffee Hour!!!");
        //creates 2 coffee objects
        Coffee coffee1 = new Coffee();
        Coffee coffee2 = new Coffee();
        System.out.println("What's the name of the first coffee?");
        String name1 = key.nextLine().trim();
        if (!name1.isEmpty()) {
            coffee1.setName(name1);
        }
        //loops until a valid number is entered for first coffee
        while (true) {
            System.out.println("What's the caffeine content?");
            String input = key.nextLine().trim();
            try {
                int mg = Integer.parseInt(input);
                if (coffee1.setCaffeineContent(mg)) {
                    break;
                } else {
                    System.out.println("Invalid caffeine amount. Enter a value 50-300.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid value (50-300).");
            }
        }
        System.out.println("What's the name of the second coffee?");
        String name2 = key.nextLine().trim();
        if (!name2.isEmpty()) {
            coffee2.setName(name2);
        }
        //loops until a valid number is entered for second coffee
        while (true) {
            System.out.println("What's the caffeine content?");
            String input = key.nextLine().trim();
            try {
                int mg = Integer.parseInt(input);
                if (coffee2.setCaffeineContent(mg)) {
                    break;
                } else {
                    System.out.println("Invalid caffeine amount. Enter a value 50-300.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid value (50-300).");
            }
        }
        //calculates risky amounts and shows the results
        double cups1 = coffee1.riskyAmount();
        double cups2 = coffee2.riskyAmount();
        System.out.printf("It would take %.1f cups of %s before it's dangerous to drink more.%n", cups1, coffee1.getName());
        System.out.printf("It would take %.1f cups of %s before it's dangerous to drink more.%n",cups2, coffee2.getName());
        key.close();
    }
}