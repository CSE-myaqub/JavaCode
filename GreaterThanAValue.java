import java.util.Scanner;
public class GreaterThanAValue {
	public static final int VALUE = 1000;
	public static void main(String[] args) {
		//
		Scanner key = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int number = key.nextInt();
		//if-else statement
		if(number > VALUE) {
			//IF block
			System.out.println(number +" is greater than "+VALUE);
		}
		else {
			
			//ELSE block
			
			System.out.println(number+" is less than or equal to "+VALUE);
		}

	}

}
