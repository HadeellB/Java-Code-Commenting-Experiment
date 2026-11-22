import java.util.Arrays;

public class C24_AnagramCheck {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        // Strings of different lengths cannot be anagrams.
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        // Convert the strings to character arrays so they can be sorted.
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        // Sorting places matching characters in the same order.
        Arrays.sort(a);
        Arrays.sort(b);

        // Equal sorted arrays contain the same characters with the same counts.
        if (Arrays.equals(a, b)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}