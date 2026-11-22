import java.util.Scanner;

public class C09_CommonFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Count common factors found among the positive integers checked below.
        int count = 0;

        // Check candidates from 1 through the smaller input.
        // If either input is nonpositive, the loop does not run.
        for (int i = 1; i <= Math.min(a, b); i++) {
            // A candidate is a common factor if it divides both inputs evenly.
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }
        System.out.println("Number of common factors: " + count);
        sc.close();
    }
}