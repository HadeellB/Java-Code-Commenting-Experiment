public class C13_MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        int n = 6;
        // Calculate the expected sum of all integers from 1 to n.
        int total = n * (n + 1) / 2;
        int sum = 0;

        // Add the values present in the array.
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        // The difference between the expected and actual sums is the missing number.
        int missing = total - sum;
        System.out.println("Missing Number: " + missing);
    }
}