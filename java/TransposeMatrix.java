import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int r = s.nextInt();
        System.out.println("Enter number of columns:");
        int c = s.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        System.out.println("Transpose of given matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
