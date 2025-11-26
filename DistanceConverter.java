//Muhammad Yaqub
import java.util.Scanner;
public class DistanceConverter {
    public static void showKilometers(double meters) {
        double kilometers = meters * 0.001; //formula to convert distance to kilometers
        System.out.printf("%.2f meters is %.4f kilometers.%n", meters, kilometers);
    }
    public static void showInches(double meters) {
        double inches = meters * 39.37; //the formula to convert distance into inches
        System.out.printf("%.2f meters is %.2f inches.%n", meters, inches);
    }
    public static void showFeet(double meters) {
        double feet = meters * 3.281; //formula for distance to feet
        System.out.printf("%.2f meters is %.2f feet.%n", meters, feet);
    }
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("Enter a distance in meters: ");
        double meters = key.nextDouble();
        //checks if input is valid
        if (meters < 0) {
            System.out.println("Error: Distance cannot be negative. Program exiting.");
            return; //quits program if input is invalid
        }

        int choice;
        //keeps displaying the menu until the user chooses to quit (option 4)
        do {
            //displays the menu options
            System.out.println("\nSelect a conversion option:");
            System.out.println("1. Convert to kilometers");
            System.out.println("2. Convert to inches");
            System.out.println("3. Convert to feet");
            System.out.println("4. Quit the program");
            System.out.print("Enter your choice: ");
            choice = key.nextInt();
            //different actions the user can choose
            switch (choice) {
                case 1:
                    showKilometers(meters);
                    break;
                case 2:
                    showInches(meters);
                    break;
                case 3:
                    showFeet(meters);
                    break;
                case 4:
                    System.out.println("Exiting Program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1-4.");
            }

        } while (choice != 4);

        key.close();
	}

}
