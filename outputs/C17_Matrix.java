public class C17_Matrix {
    public static void main(String[] args) {
        // Store a 3-by-3 matrix as a two-dimensional array.
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Traverse each row of the matrix.
        for (int i = 0; i < 3; i++) {
            // Print each element in the current row, separated by spaces.
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            // Start a new line after printing the current row.
            System.out.println();
        }
    }
}