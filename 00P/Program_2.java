
/*Create a Java class called Student with the following details as variables within it.
USN
Name
Branch
Phone
Write a Java program to create n Student objects and 
print the USN, Name, Branch, and Phone of these objects with suitable headings. */
import java.util.Scanner;

public class Program_2 {
	String usn, name, branch;
	long phone = 0;

	void displayStudent() {
		System.out.println("\t************************");
		System.out.println("\t   USN = " + usn);
		System.out.println("\t   NAME = " + name);
		System.out.println("\t   BRANCH = " + branch);
		System.out.println("\t   PHONE NUMBER = " + phone);
		System.out.println("\t************************");
	}

	public static void main(String args[]) {
		Program_2 st[] = new Program_2[100];
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n = ip.nextInt();
		for (int j = 0; j < n; j++) {
			st[j] = new Program_2();
			System.out.println("Enter the Usn, Name, Branch, Phone Number of student " + (j + 1) + " :");
			ip.nextLine();
			st[j].usn = ip.nextLine();
			st[j].name = ip.nextLine();
			st[j].branch = ip.nextLine();
			st[j].phone = ip.nextLong();
		}
		ip.close();
		System.out.println("\t************************");
		for (int j = 0; j < n; j++) {
			System.out.println("\t Student " + (j + 1) + " details are: ");
			st[j].displayStudent();
		}

	}
}