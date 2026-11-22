import java.util.Scanner;

public class C04_GradeCalculator {
    public static void main(String[] args) {
        // Read an integer mark from standard input.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks:");
        int marks = sc.nextInt();

        // Check thresholds from highest to lowest; only the first matching branch runs.
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else {
            // Marks below 60 receive a failing grade.
            System.out.println("Grade: F, you have failed. Try better next time!");
        }
        sc.close();
    }
}