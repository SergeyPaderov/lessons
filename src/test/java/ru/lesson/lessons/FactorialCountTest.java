package ru.lesson.lessons;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by SergeyPaderov on 17.07.2016.
 */
public class FactorialCountTest {

    @Test
    public void testFactorial() throws Exception {

        FactorialCount factorialCount = new FactorialCount();

            assertThat((int) factorialCount.factorial(3), is(6));
        }
}
