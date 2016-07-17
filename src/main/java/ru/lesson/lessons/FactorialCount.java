package ru.lesson.lessons;
/**
 * Created by SergeyPaderov on 06.07.2016.
 */
// Task: Написать программу для вычисления факториала. Использовать циклы.

public class FactorialCount {

    public long factorial (int n)
    {
        if (n <= 1)

            return 1;

        else

            return n * factorial (n - 1);

    }

    public static void main (String [] args)    {

        FactorialCount fac = new FactorialCount();

        for (int i = 1; i <= 10; i++)

            System.out.println (fac.factorial (i));
    }
}