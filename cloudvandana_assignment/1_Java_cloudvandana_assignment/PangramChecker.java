package corejava.strings;

public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; // Replace with your input
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        // Create an array to mark the presence of each alphabet letter
        boolean[] alphabetPresent = new boolean[26];
        int count = 0;

        for (char c : sentence.toCharArray()) {
            // Check if the character is an uppercase letter
            if ('A' <= c && c <= 'Z') {
                int index = c - 'A';
                if (!alphabetPresent[index]) {
                    alphabetPresent[index] = true;
                    count++;
                }
            }
            // Check if the character is a lowercase letter
            if ('a' <= c && c <= 'z') {
                int index = c - 'a';
                if (!alphabetPresent[index]) {
                    alphabetPresent[index] = true;
                    count++;
                }
            }
        }

        // If we have encountered all 26 letters, it's a pangram
        return count == 26;
    }
}

