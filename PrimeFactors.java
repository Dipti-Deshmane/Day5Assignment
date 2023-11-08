package Day5Assign;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.print("Prime factors of " + n + " are: ");

        // Print all the 2s that are factors of n
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n = n / 2;
        }

        // n must be odd at this point. So we can skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i = i + 2) {
            // While i divides n, print i and divide n
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }

        // This condition is to handle the case when n is a prime number greater than 2
        if (n > 2) {
            System.out.print(n);
        }

        input.close();
    }
    }
