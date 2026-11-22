public class C16_RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int n = arr.length;

        // Reduce the rotation count because n rotations restore the original order.
        k = k % n;

        // Rotate the array one position to the right, k times.
        for (int i = 0; i < k; i++) {
            // Save the last element before shifting the remaining elements.
            int last = arr[n - 1];

            // Shift backward through the array to avoid overwriting needed values.
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }

        // Print the elements in their rotated order.
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}