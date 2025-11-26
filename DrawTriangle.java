//Muhammad Yaqub
import java.util.Scanner;
public class DrawTriangle {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter the height of the triangle: ");
		int height = key.nextInt();
		//increasing stars
		for (int i = 1; i <= height; i++) {   //loops from 1 up to the height
			for (int j = 1; j <= i; j++) {    //prints i stars
			System.out.print("*");
			}
			System.out.println();            //moves to the next line after printing the stars
			}
		//decreasing stars
		for (int i = height - 1; i >= 1; i--) { //loops down from height-1 to 1
			for (int j = 1; j <= i; j++) {      //prints i stars
			System.out.print("*");
			}
			System.out.println();
			}
		System.out.println("End of program!");
	}

}
