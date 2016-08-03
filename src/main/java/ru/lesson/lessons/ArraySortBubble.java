package ru.lesson.lessons;

/**
 * Created by SergeyPaderov on 30.07.2016.
 */

/** Дано: Массив int values[].
*Нужно написать метод,
*который будет сортировать данный массив,
*использую алгоритм пузырька.
*/

public class ArraySortBubble {

    public void sortBubble(int[] values) {

        for (int i = values.length - 1; i >= 2; i--) {

            for (int j = 0; j < i; j++) {

                if (values[j] > values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;

                }
            }
        }
    }
}