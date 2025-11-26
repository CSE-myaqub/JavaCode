//Muhammad Yaqub
import java.util.Scanner;
public class ShipNavigator {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Welcome to ShipNavigator!!!");
        //loop until the user answers "no" to constructing another ship
        while (true) {
            System.out.println("Enter the name of the ship:");
            String name = key.nextLine().trim();
            System.out.println("Enter its launch date (mm/dd/yyyy):");
            String launchDate = key.nextLine().trim();
            System.out.println("Is it a cruise ship or a cargo ship?");
            String type = key.nextLine().trim();
            if (type.equalsIgnoreCase("cruise ship") || type.equalsIgnoreCase("cruise")) {
                //cruise ship branch
                System.out.println("Enter the ship's passenger capacity:");
                int passengers = readInt(key);
                System.out.println("How many crew members are on this ship?");
                int crew = readInt(key);
                System.out.println("Creating a cruise ship...");
                CruiseShip cruise = new CruiseShip(name, launchDate, passengers, crew);
                System.out.println("Printing the ship's details:");
                System.out.println(cruise.toString());
            } else {//treat anything else as cargo ship
                System.out.println("Enter the ship's tonnage (DWT):");
                int tonnage = readInt(key);
                System.out.println("Enter the maximum speed of the ship (in mph):");
                double speed = readDouble(key);
                System.out.println("Creating a cargo ship...");
                CargoShip cargo = new CargoShip(name, launchDate, tonnage, speed);
                System.out.println("Printing the ship's details:");
                System.out.println(cargo.toString());
            }
            System.out.println("Do you want to construct another ship object? Enter yes or no:");
            String again = key.nextLine().trim().toLowerCase();
            if (again.equals("no") || again.equals("n")) {
                System.out.println("Goodbye!");
                break;
            }
        }
        key.close();
    }
    private static int readInt(Scanner key) {
        while (true) {
            String s = key.nextLine().trim();
            try {
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer:");
            }
        }
    }
    private static double readDouble(Scanner key) {
        while (true) {
            String s = key.nextLine().trim();
            try {
                return Double.parseDouble(s);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number (for example 26.2):");
            }
        }
    }
}
