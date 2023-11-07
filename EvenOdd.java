package Day5Assign;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num1 = scanner.nextInt();
    if(num1%2==0){
        System.out.println("This is Even number");
    }
    else {
        System.out.println("This is odd number");
    }

    }
}
