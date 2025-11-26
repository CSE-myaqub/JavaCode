import java.util.Scanner;
import java.util.Arrays;

public class CompareArrays {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int[] arrayA = new int[10];
        int[] arrayB = new int[10];

        System.out.println("Enter 10 integers for Array A:");
        for(int i = 0; i < arrayA.length; i++) {
            arrayA[i] = key.nextInt();
        }

        System.out.println("Enter 10 integers for Array B:");
        for(int i = 0; i < arrayB.length; i++) {
            arrayB[i] = key.nextInt();
        }

        if(Arrays.equals(arrayA, arrayB)) {
            System.out.println("Both arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }

        key.close();
    }
}