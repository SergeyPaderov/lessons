package ru.lesson.lessons;

/**
 *Дано: Массив строк. String[] - нужно убрать дубликаты.
 *
 * @author SergeyPaderov
 * @since 15.08.2016
 * @version 1.0
 */

public class SortStringArray {

    /**
     * Method with loops for sort array
     * @param arrayForSort - array of strings with duplicate
     * @return -  array without duplicates
     */
    public String[] dublicateErase(String[] arrayForSort) {

        for (int i = 0; i < arrayForSort.length - 1; i++) {
            if(arrayForSort[i]!= null) {
                for (int j = i + 1; j < arrayForSort.length; j++) {

                    if (arrayForSort[i].equals(arrayForSort[j])) {
                        for (int k = j; k < arrayForSort.length - 1; k++) {
                            arrayForSort[k] = arrayForSort[k + 1];
                        }
                        arrayForSort[arrayForSort.length - 1] = null;
                    }
                }
            } else break;
        }

        return arrayForSort;
    }
}