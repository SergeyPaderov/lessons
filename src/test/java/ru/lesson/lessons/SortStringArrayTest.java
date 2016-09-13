package ru.lesson.lessons;

import  org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import org.junit.Assert;

/**
 * @author SergeyPaderov
 * @since 29.08.2016
 * @version 1.0
 */

public class SortStringArrayTest {

    /**
     * @throws Exception if result will be not similar to String's array "sorted array" (expected)
     */

    @Test

    public void testDelete() throws Exception {

            SortStringArray duplicates = new SortStringArray();
            String[] notSortedArray = {"Tom", "Jack", "Tom", "Jim"};
            String[] sortedArray = {"Tom", "Jack", "Jim",null};

            String[] result = duplicates.dublicateErase(notSortedArray);

            Assert.assertThat(result, is(sortedArray));
        }
    }