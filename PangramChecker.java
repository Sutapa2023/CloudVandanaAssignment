package cloudvandanaAssignment.cloudvandanaProject;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        boolean isPangram = checkIfPangram(sentence);

        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }

    public static boolean checkIfPangram(String sentence) {
        // Convert the sentence to lowercase to handle case-insensitivity
        sentence = sentence.toLowerCase();

        // Use a set to store unique alphabets in the sentence
        Set<Character> alphabetSet = new HashSet<>();

        // Iterate through each character in the sentence
        for (char c : sentence.toCharArray()) {
            // Check if the character is an alphabet (a to z)
            if (Character.isAlphabetic(c)) {
                alphabetSet.add(c);
            }
        }

        // Check if the set size is 26, which indicates all alphabets are present
        return alphabetSet.size() == 26;
    }
}
