
public class Program_5a {
	static int add(int a, int b)
	{
		int sum=a+b;
		return sum;
	}
	static int add(int a, int b,int c)
	{
		int sum=a+b+c;
		return sum;
	}
	static float add(float a, float b)
	{
		float sum=a+b;
		return sum;
	}
	public static void main(String[] args)
{
// Program_5a obj = new Program_5a();
int s1=Program_5a.add(10, 20);
int s2=Program_5a.add(10, 20, 30);
float s3=Program_5a.add(2.2f,2.2f);
System.out.println("Method Overload Sum1 = "+s1);
System.out.println("Method Overload Sum2 = "+s2);
System.out.println("Method Overload Sum3 = "+s3);
}
	
}
