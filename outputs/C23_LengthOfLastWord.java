import java.util.Scanner;

public class C23_LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        // Read the entire line and remove leading and trailing whitespace.
        String s = sc.nextLine().trim();

        int count = 0;
        // Scan backward, counting characters in the last word.
        for (int i = s.length() - 1; i >= 0; i--) {
            // Stop when a space separates the last word from preceding text.
            if (s.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        System.out.println("Length of last word: " + count);
        sc.close();
    }
}