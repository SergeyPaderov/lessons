package ru.lesson.lessons;

/**
 *Дано: Массив строк. String[] - нужно убрать дубликаты.
 *
 * @author SergeyPaderov
 * @since 15.08.2016
 * @version 1.0
 */

public class SortStringArray {

    public String[] removeDuplicates(String[] incomingArray) {

        String[] tempArray = new String[incomingArray.length];

        int lastIndexOfTempArray = 0;

        for (int i = 0; i < incomingArray.length; i++) {

            String currentString = incomingArray[i];

            if (!consistInTempArray(currentString, tempArray)) {

                tempArray[lastIndexOfTempArray] = currentString;

                lastIndexOfTempArray++;
            }
        }

        String[] finalArray = new String[lastIndexOfTempArray];

        for (int i = 0; i < tempArray.length; i++) {

            if (tempArray[i] != null) {

                finalArray[i] = tempArray[i];
            }
        }

        return finalArray;
    }

    public boolean consistInTempArray(String value, String[] tempArray) {

        if (tempArray.length == 0) return false;

        for (int i = 0; i < tempArray.length; i++) {

            if (tempArray[i] == null) {

                continue;

            } else {

                if (tempArray[i].equals(value)) {

                    return true;
                }
            }
        }

        return false;
    }
}