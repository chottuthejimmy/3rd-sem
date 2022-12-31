package Program_6_1;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Time {
	DecimalFormat df = new DecimalFormat("#.##");
Double h,s,m;
Scanner in = new Scanner(System.in);
public void htm()
{
	System.out.print("Enter the no of hour to convert into mintues: ");
	h = in.nextDouble();
	m=h*60;
	System.out.println(h+" hour is equal to "+df.format(m)+" minutes");
	System.out.println();
}
public void mth()
{
	System.out.print("Enter the no of mintues to convert into hours: ");
	m = in.nextDouble();
	h=m/60;
	System.out.println(m+" minutes is equal to "+df.format(h)+" hours");
	System.out.println();
}
public void hts()
{
	System.out.print("Enter the no of hour to convert into seconds: ");
	h = in.nextDouble();
	s=h*3600;
	System.out.println(h+" hour is equal to "+df.format(s)+" seconds");
	System.out.println();
}
public void sth()
{
	System.out.print("Enter the no of seconds to convert into hours: ");
	s = in.nextDouble();
	h=s/3600;
	System.out.println(s+" seconds is equal to "+df.format(h)+" hours");
	System.out.println();
}
}
