public class C14_PairWithSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 5, 3};
        int target = 9;

        // Check each pair of distinct indices once.
        for (int i = 0; i < arr.length; i++) {
            // Start after i to avoid pairing an element with itself or revisiting a pair.
            for (int j = i + 1; j < arr.length; j++) {
                // Print the pair if its values add up to the target.
                if (arr[i] + arr[j] == target) {
                    System.out.print("(" + arr[i] + ", " + arr[j] + ") ");
                }
            }
        }
        System.out.println();
    }
}