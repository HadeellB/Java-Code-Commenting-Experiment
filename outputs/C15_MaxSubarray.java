public class C15_MaxSubarray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Initialize both sums with the first element to handle all-negative arrays.
        int currentSum = arr[0];
        int maxSum = arr[0];

        // Use Kadane's algorithm to find the maximum sum of a contiguous subarray.
        for (int i = 1; i < arr.length; i++) {
            if (currentSum < 0) {
                // Start a new subarray because the previous sum would reduce it.
                currentSum = arr[i];
            } else {
                // Extend the current subarray with this element.
                currentSum = currentSum + arr[i];
            }

            // Keep the largest subarray sum found so far.
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}