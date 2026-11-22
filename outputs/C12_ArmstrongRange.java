public class C12_ArmstrongRange {
    public static void main(String[] args) {
        int start = 100;
        int end = 1000;

        // Check each number in the inclusive range for the Armstrong property.
        for (int i = start; i <= end; i++) {
            int temp = i;
            int digits = 0;
            // Count the digits by repeatedly removing the last digit.
            while (temp > 0) {
                digits++;
                temp = temp / 10;
            }

            // Reset the working copy to process the number's digits again.
            temp = i;
            int sum = 0;
            while (temp > 0) {
                // Extract the last digit.
                int d = temp % 10;
                int power = 1;
                // Raise the digit to the number of digits using repeated multiplication.
                for (int p = 0; p < digits; p++) {
                    power = power * d;
                }
                sum = sum + power;
                temp = temp / 10;
            }

            // An Armstrong number equals the sum of its digits raised to its digit count.
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}