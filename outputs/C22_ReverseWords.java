public class C22_ReverseWords {
    public static void main(String[] args) {
        String sentence = "Java is powerful";
        // Split the sentence into words using a single space as the delimiter.
        String[] words = sentence.split(" ");
        String result = "";

        // Traverse the words from last to first to reverse their order.
        for (int i = words.length - 1; i >= 0; i--) {
            result = result + words[i];
            // Add a space between words, avoiding a trailing space.
            if (i != 0) {
                result = result + " ";
            }
        }
        System.out.println(result);
    }
}