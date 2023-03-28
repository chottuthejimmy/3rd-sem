
/* Write a program for Arithmetic calculator using switch case menu */
import java.util.*;

public class Program_3b {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the operator");
		char op = ip.next().charAt(0);
		System.out.println("Enter the first operand");
		double first = ip.nextDouble();
		System.out.println("Enter the second operand");
		double second = ip.nextDouble();
		ip.close();
		double result = 0;
		switch (op) {
			case '+':
				result = first + second;
				break;
			case '-':
				result = first - second;
				break;
			case '*':
				result = first * second;
				break;
			case '/':
				result = first / second;
				break;
			default:
				System.out.println("Invalid Operator");
				return;
		}
		System.out.println(first + " " + op + " " + second + " = " + result);
	}

}
