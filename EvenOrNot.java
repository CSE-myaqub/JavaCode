import java.util.Scanner;
public class EvenOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a non-zero number:");
		int num = (int)key.nextDouble();
		//check if number is even or not
		//input validation
		if(num==0) {
			System.out.println("Invalid value entered");
			System.exit(0);   //exists the program
		}
		
		//check if the number is even or not
		if(num%2 == 0) {
			System.out.print("The number is even!");
		}
		else {
			System.out.print("The number is odd!");
		}
				//*
				//type casting
				//int num2 = (int)num;
				
				//*

	}

}
