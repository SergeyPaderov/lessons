package ru.lesson.lessons;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

/**
 * Test for class RotationSquareArray
 *
 * @author SergeyPaderov
 * @since 06.09.2016
 * @version 1.0
 */

public class RotationSquareArrayTest {

    @Test
    public void testRotate() throws Exception {

        /** Create one array to be tested for equality */

        int[][] arr = new int[][]{{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};

        /** Create the other array to be tested for equality */

        int[][] expected = new int[][]{{2, 5, 8}, {1, 4, 7}, {0, 3, 6}};

        /** Create new object RotationSquareArray's type for test */

        RotationSquareArray testArrayStestRotation = new RotationSquareArray();
        testArrayStestRotation.Rotation(arr);
        assertArrayEquals(expected, arr);


    }
}