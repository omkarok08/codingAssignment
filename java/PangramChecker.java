import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence to check if it's a pangram:");
        String input = scanner.nextLine();

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    private static boolean isPangram(String str) {
        // Convert the input string to lowercase to make the check case-insensitive
        str = str.toLowerCase();

        // Use a set to keep track of unique letters in the input
        Set<Character> uniqueLetters = new HashSet<>();

        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(c)) {
                // Add the lowercase letter to the set
                uniqueLetters.add(c);
            }
        }

        // Check if the set size is equal to 26 (number of letters in the alphabet)
        return uniqueLetters.size() == 26;
    }
}
