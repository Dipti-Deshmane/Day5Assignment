package Day5Assign;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        System.out.println("Enter the number of times to flip the coin");
        Scanner sc = new Scanner(System.in);

        int totalFlips = sc.nextInt();
        int headsCount = 0;
        int tailsCount = 0;

        Random random = new Random();

        for (int i = 0; i < totalFlips; i++) {
            // Generate a random number (0 or 1) to represent heads or tails
            int result = random.nextInt(2);

            if (result == 0) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }

        double headsPercentage = (double) headsCount / totalFlips * 100;
        double tailsPercentage = (double) tailsCount / totalFlips * 100;

        System.out.println("Number of flips: " + totalFlips);
        System.out.println("Heads count: " + headsCount);
        System.out.println("Tails count: " + tailsCount);
        System.out.println("Percentage of heads: " + headsPercentage + "%");
        System.out.println("Percentage of tails: " + tailsPercentage + "%");
    }
}
