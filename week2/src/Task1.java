import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }                                      //先沿垂直中线翻转
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1-i; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][n-1-i];
                matrix[n-1-j][n-1-i] = temp;
            }                                             //再沿副对角线翻转
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j<n-1)
                System.out.print(matrix[i][j]+"\t");
                if(j==n-1)
                    System.out.println(matrix[i][j]+"\t");     //按矩阵形式打印出来
            }
        }
    }
}
