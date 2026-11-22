import java.util.Scanner;

public class C10_FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Process integers from 1 through n; nonpositive n produces no loop output.
        for (int i = 1; i <= n; i++) {
            // Check divisibility by both numbers first so their multiples print "FizzBuzz".
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                // Print the number when it is divisible by neither 3 nor 5.
                System.out.println(i);
            }
        }
        sc.close();
    }
}