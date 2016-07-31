package ru.lesson.lessons;

/* Создать класс Square в нем один метод float calculate(int x).
Метод должен вычислять значение функции y = a*x2 + b * x + c;
параметры a b c задаются через конструктор.
Необходимо вывести на экран значение функции в диапазоне от x1 до x2 c шагом step.
Параметры задаются через аргументы запуска.

Например,
Java -d out ru.parsentev.Square 3 1 4 0 10 1
Параметр a b c x1 x2 step

Для того. Что бы получить параметры в программе нужно использовать обращение к массиву.
double a = Double.valueOf(args[0]);
double b = Double.valueOf(args[1]);
И тд
*/

public class QuadraticEquation {

	public double a;
	public double b;
	public double c;

	public QuadraticEquation(double a,double b,double c){

		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double equation(double x){
		return a*x*x+b*x+c;
	}

	public static void main (String[] args){

		QuadraticEquation oneMoreQuadraticEquation = new QuadraticEquation(Double.valueOf(args[0]),Double.valueOf(args[1]),Double.valueOf(args[2]));

		double x1,x2,step;
		x1 = Double.valueOf(args[3]);
		x2 = Double.valueOf(args[4]);
		step = Double.valueOf(args[5]);

		while(x1 < x2){
			System.out.println(oneMoreQuadraticEquation.equation(x1));
			x1 += step;

		}
	}
}