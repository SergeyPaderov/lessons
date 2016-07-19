package ru.lesson.lessons;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by SergeyPaderov on 17.07.2016.
 */
public class FactorialCountTest {

    @Test
    public void testFactorial() throws Exception {

        FactorialCount factorialCount = new FactorialCount();
        for (int n = 1; n <= 3; n++) {
            assertThat(factorialCount.factorial(6), is(6));
        }
    }
}
