import java.util.Scanner;

public class C08_AddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Repeat digit summation until num is less than 10.
        // Negative input skips this loop and is printed unchanged.
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                // Add the last digit to the sum.
                sum += num % 10;
                // Remove the last digit using integer division.
                num /= 10;
            }
            // Use the digit sum for the next iteration or final result.
            num = sum;
        }
        System.out.println("Result: " + num);
        sc.close();
    }
}