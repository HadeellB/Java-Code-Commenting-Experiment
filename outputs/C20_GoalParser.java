import java.util.Scanner;

public class C20_GoalParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter command: ");
        // Read the command as a whitespace-delimited token.
        String command = sc.next();

        // Replace each "()" with "o" and each "(al)" with "al".
        // Other characters remain unchanged.
        String result = command.replace("()", "o").replace("(al)", "al");

        System.out.println("Interpreted command: " + result);
        sc.close();
    }
}