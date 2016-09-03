package ru.lesson.lessons;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author SergeyPaderov
 * @since 29.08.2016
 * @version 1.0
 */
public class SortStringArrayTest {

    @Test

    public void testRemoveDuplicates() throws Exception {

        /** Create one array to be tested for equality */

        String[] arr = new String[]{"Tom", "Jack", "Jim", "Tom"};

        /** Create the other array to be tested for equality */

        String[] expected = new String[]{"Tom", "Jack", "Jim", "Tom"};

        /** Create new object SortStringArray's type for test */

        SortStringArray testSortStringArray = new SortStringArray();
        testSortStringArray.removeDuplicates(arr);
        assertArrayEquals(expected, arr);

    }
}