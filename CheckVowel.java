package Day5Assign;

import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        char alphabet = scanner.next().toLowerCase().charAt(0);

        if (isVowel(alphabet)) {
            System.out.println(alphabet + " is a vowel.");
        } else {
            System.out.println(alphabet + " is a consonant.");
        }
    }

    public static boolean isVowel(char alphabet) {
        // Convert the alphabet to lowercase for easier comparison
        alphabet = Character.toLowerCase(alphabet);

        // Check if the alphabet is a vowel
        return alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u';
    }
}
