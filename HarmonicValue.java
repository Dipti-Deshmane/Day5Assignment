package Day5Assign;

import java.util.Scanner;

public class HarmonicValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();

        double harmonicValue = 0;

        for (int i = 1; i <= n; i++) {
            harmonicValue += 1.0 / i;
        }

        System.out.println("The Nth harmonic value is: " + harmonicValue);

        sc.close();

    }
}