public class C19_RemoveDuplicateChars {
    public static void main(String[] args) {
        String str = "programming";
        String result = "";

        // Process characters in their original order.
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Append only characters not already in result, preserving first occurrences.
            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}