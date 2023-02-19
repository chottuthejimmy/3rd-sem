// Write a Java program to read two integers a and b.Compute a/b and print, when b is not zero.
// Raise an exception when b is equal to zero.

import java.util.*;
public class Program_10
{
    void div(int a,int b)
    {
        int c;
        try
        {
        c=a/b;
        System.out.println("Result="+c);
        }
        catch(ArithmeticException e)
        {
        System.out.println("Cannot divide by zero");
        }
    }
    public static void main(String args[])
    {
        Program_10 obj=new Program_10();
        Scanner in = new Scanner(System.in);
            System.out.println("Enter the values of a and b : ");
            int m=in.nextInt();
            int n=in.nextInt();
            in.close();
            obj.div(m,n);            
    }
}