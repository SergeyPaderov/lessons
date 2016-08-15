package ru.lesson.lessons;

import java.util.HashSet;
import java.io.PrintStream;
import java.util.Set;
import java.util.Arrays;

/**
 *Дано: Массив строк. String[] - нужно убрать дубликаты.
 *
 * @author SergeyPaderov
 * @since 15.08.2016
 * @version 1.0
 */

public class SortStringArray {

    public static void main(String[] args) {

        String[] phoneBook = {"Tom", "Jack", "Jim", "Tom"};

        Set<String> noteBook = new HashSet<String>(Arrays.asList(phoneBook));
        String[] result = noteBook.toArray(new String[noteBook.size()]);

    }
}