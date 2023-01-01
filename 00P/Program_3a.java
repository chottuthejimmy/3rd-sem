/* Write a program to check prime number */
import java.util.Scanner;
public class Program_3a {

	public static void main(String[] args) {
		
		int i,n;
		System.out.println("Enter the number");
		Scanner ip = new Scanner(System.in);
		n = ip.nextInt();
		ip.close();
		if(n<0)
		{
			System.out.println("Enter a positive Number");
			
		}
		else if(n==0 || n==1)
		{
			System.out.println("It is neither prime nor composite");
			
		}
		else{
		for(i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				System.out.println("It is not a prime number");
				return;
			}
		}
		System.out.println("It is a prime number");
	}
}

}
