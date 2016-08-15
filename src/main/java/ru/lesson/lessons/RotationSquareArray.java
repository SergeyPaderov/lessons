package ru.lesson.lessons;

/**
 *Дано:
 *Двухмерный квадратный массив int values[][].
 *Необходимо написать метод, который будет
 *поворачивать данный массив на 90 градусов.
 *
 * @author SergeyPaderov
 * @since 06.08.2016
 * @version 1.0
 */

public class RotationSquareArray {

    int m = 3;

    public static void main(String[] args) {
        int m =3;
        /** Create array */

                int[][] SquareArray = new int[m][m];

        /** Fill in the cells of the array */

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                SquareArray[i][j] = m * i + j;
            }
        }

        /** Print array before rotation */

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d ", SquareArray[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println();
    }

        /** Rotation */

    public void Rotation(int[][] SquareArray) {

        for (int k = 0; k < m / 2; k++) {
            for (int j = k; j < m - 1 - k; j++) {

                /** Move the corners */

                int tmp = SquareArray[k][j];
                SquareArray[k][j] = SquareArray[j][m - 1 - k];
                SquareArray[j][m - 1 - k] = SquareArray[m - 1 - k][m - 1 - j];
                SquareArray[m - 1 - k][m - 1 - j] = SquareArray[m - 1 - j][k];
                SquareArray[m - 1 - j][k] = tmp;
            }
        }
        /** Print rotated array */

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d ", SquareArray[i][j]);
            }
            System.out.print("\n");
        }
    }
}
