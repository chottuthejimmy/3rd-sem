/*Create a Java class called Student with the following details as variables within it.
USN
Name
Branch
Phone
Write a Java program to create n Student objects and 
print the USN, Name, Branch, and Phone of these objects with suitable headings. */
import java.util.Scanner; 
public class Program_2
{
String usn,name,branch;
long phone=0;
// void insertStudent(String reg,String nm, String br,long ph)
// {
// usn=reg;
// name=nm;
// branch=br;
// phone=ph;
// }
void displayStudent()
{
System.out.println("\t************************");
System.out.println("\t   USN = "+usn);
System.out.println("\t   NAME = "+name);
System.out.println("\t   BRANCH = "+branch);
System.out.println("\t   PHONE NUMBER = "+phone);
System.out.println("\t************************");
}
public static void main(String args[])
{
Program_2 st[]=new Program_2[100];
try (Scanner ip = new Scanner(System.in)) {
	{
	System.out.println("Enter the number of students");
	int n=ip.nextInt();
	// ip.nextLine();
	for(int i=0;i<n;i++)
	st[i]=new Program_2();
	// ip.useDelimiter("\r?\n");
	for(int j=0;j<n;j++)
	{
	System.out.format("Enter the Usn, Name, Branch, Phone Number of student %d :\n",j+1);
	ip.nextLine();
	st[j].usn=ip.nextLine();
	// usn+=ip.nextLine();
	st[j].name=ip.nextLine();
	// name+=ip.nextLine();
	st[j].branch=ip.nextLine();
	// branch+=ip.nextLine();
	// ip.nextLine();
	// long phone=0;
	st[j].phone = ip.nextLong();
	// ip.close();
	// st[j].insertStudent(usn,name,branch,phone);
	}
	System.out.println("\t************************");
	for( int m=0;m<n;m++)
	{		
	System.out.format("\t Student %d details are\n",m+1);
	st[m].displayStudent();
	}
	
}
}
}
}