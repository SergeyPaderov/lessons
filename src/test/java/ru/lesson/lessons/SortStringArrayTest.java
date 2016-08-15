package ru.lesson.lessons;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author SergeyPaderov
 * @since 15.08.2016
 */
public class SortStringArrayTest {

    @Test
    public void testMain() throws Exception {

        String[] arr = new String[] {"Tom", "Jack", "Jim", "Tom"};
        String[] expected = new String [] {"Tom", "Jack", "Jim", null};

        SortStringArray testSortStringArray = new SortStringArray();

        testSortStringArray.main (arr);
        assertArrayEquals(expected, arr);
    }
}