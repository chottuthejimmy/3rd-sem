import java.util.Scanner;

public class Program_1 {
	public static void main(String[] args) {
		int a, b, c;	// coefficients
		double root1, root2; 
		System.out.println("Enter the coefficients"); 
		try (Scanner in = new Scanner(System.in)) {
			a = in.nextInt(); 
			b = in.nextInt(); 
			c = in.nextInt();
		}
		// calculate the determinant (b2 - 4ac)
		double d = (b*b)-(4*a*c); 
		System.out.println("Determinant= "+d);
		if (d > 0)	// check if determinant is greater than 0
		{

		// two real and distinct roots
		root1 = (-b + Math.sqrt(d)) / (2 * a); 
		root2 = (-b - Math.sqrt(d)) / (2 * a);
		System.out.println("The roots are real and distinct"); 
		System.out.println("root1 = "+root1+"and root2 = "+root2);
		}

		else if (d == 0)	// check if determinant is equal to 0
		{

		// two real and equal roots
		// determinant is equal to 0
		// so -b + 0 == -b
		root1 = root2 = -b / (2 * a); 
		System.out.println("The roots are real and equal"); 
		System.out.println("root1 = root2 = "+root1);
		}

		else	// if determinant is less than zero
		{

		// roots are complex number and distinct
		 
		double real =((double)-b) / (2 * a);
		double imaginary = Math.sqrt(-d) / (2 * a); 
		System.out.println("The roots are imaginary"); 
		System.out.println("root1 = "+real+" + "+imaginary+"i"); 
		System.out.println("root1 = "+real+" - "+imaginary+"i"); 
		}
}
}
 