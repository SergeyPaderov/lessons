

public class QuadraticEquation {

 private double a; // a,b,c
 private double b;
 private double c;
 

 public QuadraticEquation(double a,double b,double c){
 
	this.a = a;
	this.b = b;
	this.c = c;
	
}

public double calcFunction(double x){

	return a*x*x+b*x+c;

} 

public static void main (String[] args){


	QuadraticEquation oneMoreQuadraticEquation = QuadraticEquation(Double.valueOf(args[0]),Double.valueOf(args[1]),Double.valueOf(args[2]));
	
	double x1,x2,step;
	x1 = Double.valueOf(args[3]);
	x2 = Double.valueOf(args[4]);
	step = Double.valueOf(args[5]);
		
	while(x1 < x2){
	 System.out.println(oneMoreQuadraticEquation.calcFunction(x1));
	 x1 += step;
	}

	}

}
