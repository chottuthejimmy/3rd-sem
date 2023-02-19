
//Write a java program that prints all real solutions to the quadratic equation ax2+bx+c=0. 
//Read in a, b, c and use the quadratic formula.
import java.util.Scanner;

public class Program_1 {
	public static void main(String[] args) {
		int a, b, c; 
		double root1, root2;
		System.out.println("Enter the coefficients");
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		in.close();
		if (a == 0) {
			System.out.println("Not a quadratic equation");
			return;
		}
	
		double d = (b * b) - (4 * a * c);
		System.out.println("Determinant= " + d);
		if (d > 0)
{
			root1 = (-b + Math.sqrt(d)) / (2 * a);
			root2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.println("The roots are real and distinct");
			System.out.println("root1 = " + root1 + "and root2 = " + root2);
		}

		else if (d == 0)
		{
			root1 = root2 = -b / (2 * a);
			System.out.println("The roots are real and equal");
			System.out.println("root1 = root2 = " + root1);
		}

		else
		{
			double real = ((double) -b) / (2 * a);
			double imaginary = Math.sqrt(-d) / (2 * a);
			System.out.println("The roots are imaginary");
			System.out.println("root1 = " + real + " + " + imaginary + "i");
			System.out.println("root1 = " + real + " - " + imaginary + "i");
		}
	}
}
