package ru.lesson.lessons;


import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

/**
 * Created by SergeyPaderov on 30.07.2016.
 */
public class ArraySortBubbleTest {

    @Test
    public void testSort() throws Exception {

        int[] arr = new int[] {6, 2, 4, 9, 8};
        int[] expected = new int [] {2, 4, 6, 8, 9};

        ArraySortBubble testArraySortBubble = new ArraySortBubble();

        testArraySortBubble.sortBubble (arr);
        assertArrayEquals(expected, arr);
    }
}
