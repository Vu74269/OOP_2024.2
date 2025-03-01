public class AddMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 5, 2},
            {3, 4, 6},
            {0, 8, 7}
        };

        int[][] matrix2 = {
            {-3, 6, -10},
            {7, -8, 14},
            {-3, 8, 2}
        };
        int rows = 3;
        int cols = 3;
        int[][] sum = new int[3][3];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Tổng hai ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
