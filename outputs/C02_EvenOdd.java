import java.util.Scanner;

public class C02_EvenOdd {
    public static void main(String[] args) {
        // Read an integer from standard input.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();

        // A remainder of zero when divided by 2 means the number is even.
        if (a % 2 == 0) {
            System.out.println(a + " is even");
        } else {
            System.out.println(a + " is odd");
        }
        sc.close();
    }
}