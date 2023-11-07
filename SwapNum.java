package Day5Assign;

import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2: " );
        int num2 = scanner.nextInt();


        // Swapping the numbers
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

}
