package ru.lesson.lessons;

        import static org.junit.Assert.*;
        import org.junit.Assert;
        import org.junit.Test;
        import static org.hamcrest.core.Is.is;

public class QuadraticEquationTest {

    @Test
    public void calcFuncOneValue(){

        QuadraticEquation testEquation = new QuadraticEquation(1,2,3);
        double check = 11;
        double result = testEquation.equation(2);
        Assert.assertThat(result,is(check));

    }

}