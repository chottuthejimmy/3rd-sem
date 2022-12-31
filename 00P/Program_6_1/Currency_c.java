package Program_6_1;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Currency_c {
static	DecimalFormat df = new DecimalFormat("#.##");
static double inr,usd,euro,yen;
static Scanner in = new Scanner(System.in);
public static void dtr()
{
	System.out.print("Enter Dollar to convert into Rupees: ");
	usd = in.nextInt();
	inr = usd*81.83;
	System.out.println("Dollar = "+usd+" equal to INR = "+df.format(inr));
	System.out.println();
}
public static void rtd()
{
	System.out.print("Enter Rupees to convert into Dollar: ");
	inr = in.nextInt();
	usd = inr/81.33;
	System.out.println("INR = "+inr+" equal to Dollar = "+df.format(usd));
	System.out.println();
	}
public static void etr()
{
	System.out.print("Enter Euro to convert into Rupees: ");
	euro=in.nextInt();
	inr=euro*79.06;
	System.out.println("Euro = "+euro+" equal to INR = "+df.format(inr));
	System.out.println();
	}
public static void rte()
{
	System.out.print("Enter Rupees to convert into Euro: ");
	inr=in.nextInt();
	euro=(inr/79.06);
	System.out.println("Rupee = "+inr+" equal to Euro = "+df.format(euro));
	System.out.println();
	}
public static void ytr()
{
	System.out.print("Enter Yen to convert into Rupees: ");
	yen=in.nextInt();
	inr=yen*0.57;
	System.out.println("Yen = "+yen+" equal to INR = "+df.format(inr));
	System.out.println();
	}
public static void rty()
{
	System.out.print("Enter Rupee to convert into Yen: ");
	inr=in.nextInt();
	yen=(inr/0.57);
	System.out.println("INR = "+inr +" equal to YEN = "+df.format(yen));
	System.out.println("\n");
	}
}
