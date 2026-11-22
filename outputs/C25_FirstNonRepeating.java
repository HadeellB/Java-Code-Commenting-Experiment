public class C25_FirstNonRepeating {
    public static void main(String[] args) {
        String str = "swiss";
        // Tracks whether a non-repeating character has been found.
        boolean found = false;

        // Examine characters from left to right to find the first unique one.
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            // Count all occurrences of the current character in the string.
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            // A character occurring exactly once is non-repeating.
            if (count == 1) {
                System.out.println("First non-repeating character: " + str.charAt(i));
                found = true;
                // Stop searching after finding the first match.
                break;
            }
        }

        // Report when no character occurs exactly once.
        if (found == false) {
            System.out.println("No non-repeating character");
        }
    }
}