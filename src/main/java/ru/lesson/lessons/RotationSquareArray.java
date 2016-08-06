package ru.lesson.lessons;

/**
 *Дано:
 *Двухмерный квадратный массив int values[][].
 *Необходимо написать метод, который будет
 *поворачивать данный массив на 90 градусов.
 * @author SergeyPaderov
 * @version 1.0
 */

public class RotationSquareArray {

    public static void main(String[] args) {

        int m = 3;
        int[][] A = new int[m][m];

        // Fill in the cells of the array

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = m * i + j;
            }
        }

        // Print array before rotation

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d ", A[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println();

        // Rotation

        for (int k = 0; k < m / 2; k++) {
            for (int j = k; j < m - 1 - k; j++) {

                // Move corners

                int tmp = A[k][j];
                A[k][j] = A[j][m - 1 - k];
                A[j][m - 1 - k] = A[m - 1 - k][m - 1 - j];
                A[m - 1 - k][m - 1 - j] = A[m - 1 - j][k];
                A[m - 1 - j][k] = tmp;
            }
        }
        // Print rotated array

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d ", A[i][j]);
            }
            System.out.print("\n");
        }
    }
}