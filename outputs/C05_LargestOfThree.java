import java.util.Scanner;

public class C05_LargestOfThree {
    public static void main(String[] args) {
        // Read three integers from standard input.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Enter the third number:");
        int c = sc.nextInt();

        int largest;
        // Select a if it is at least as large as both other numbers.
        if (a >= b && a >= c) {
            largest = a;
        // Otherwise, select b if it is at least as large as both other numbers.
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            // If neither earlier condition holds, c is the largest.
            largest = c;
        }
        System.out.println("The largest number: " + largest);
        sc.close();
    }
}