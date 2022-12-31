package Program_6_1;
import java.text.DecimalFormat;
import java.util.Scanner;
public  class Distance {
	DecimalFormat df = new DecimalFormat("#.##");
double km ,m,mi;
Scanner in = new Scanner(System.in);
public void mtokm()
{
	System.out.print("Enter the distance in meters: ");
	m = in.nextDouble();
	km=m/1000;
	System.out.println(m+"m is equal to "+km+"km");
	System.out.println();
}
public void kmtom()
{
	System.out.print("Enter the distance in kilometer: ");
	km = in.nextDouble();
	m=km*1000;
	System.out.println(km+"km is equal to "+m+"m");
	System.out.println();
}
public void mitokm()
{
	System.out.print("Enter the distance in mile: ");
	mi = in.nextDouble();
	km=mi*1.60934;
	System.out.println(mi+"mile is equal to "+df.format(km)+"km");
	System.out.println();
}
public void kmtmi()
{
	System.out.print("Enter the distance in kilometers: ");
	km = in.nextDouble();
	mi=km*0.621371;
	System.out.println(km+"km is equal to "+df.format(mi)+"mile");
	System.out.println("\n");
}
}
