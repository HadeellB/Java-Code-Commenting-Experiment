public class C21_LongestWord {
    public static void main(String[] args) {
        String sentence = "Java programming is interesting";
        // Split the sentence into words using a single space as the delimiter.
        String[] words = sentence.split(" ");
        // Use the first word as the initial longest word.
        String longest = words[0];

        // Compare the remaining words with the longest word found so far.
        for (int i = 1; i < words.length; i++) {
            // Update only for a longer word, keeping the first word in a tie.
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }
        System.out.println("Longest word: " + longest);
    }
}