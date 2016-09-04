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
    * Create new array with length of arrayBeforeSort
     */

    public String[] eraseDuplicate(String[] arrayBeforeSort){

        /**
         * If find duplicate, replace it with last unique element
         * and decrement elementInTheArray
         */

        int elementInTheArray = arrayBeforeSort.length;

        for (int i = 0; i < elementInTheArray; i++){
            for (int j = i + 1; j < elementInTheArray; j++){
                if (arrayBeforeSort[i].equals(arrayBeforeSort[j])){
                    arrayBeforeSort[j] = arrayBeforeSort[elementInTheArray - 1];
                    elementInTheArray--;
                    j--;
                }
            }
        }

        /**
         * Create new array with length of elementInTheArray
         */
        String[] arrayAfterSort = new String[elementInTheArray];
        for (int i = 0; i < elementInTheArray; i++){
            arrayAfterSort[i] = arrayBeforeSort[i];
        }

        return arrayAfterSort;
    }
}