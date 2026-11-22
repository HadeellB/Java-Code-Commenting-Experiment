public class C11_PrimeRange {
    public static void main(String[] args) {
        int start = 10;
        int end = 50;
        int count = 0;

        System.out.print("Prime numbers: ");
        // Check each integer in the inclusive range from start to end.
        for (int i = start; i <= end; i++) {
            // Numbers less than 2 are not prime.
            if (i < 2) {
                continue;
            }
            boolean isPrime = true;
            // Test divisors up to the square root of i; any composite
            // number has at least one factor within this limit.
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    // A divisor was found, so no further checks are needed.
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                // Display the prime number and include it in the total.
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Count: " + count);
    }
}