

public class Program_5b {

	int id;
String name;
Program_5b()
{
System.out.println("This is Default Constuctor");
System.out.println("Student Id : "+id + "\nStudent Name : "+name);
}
Program_5b(int id, String name)
{
System.out.println("This is Parameterized Constructor:");
this.id = id;
this.name = name;
System.out.println("Student Id : "+id + "\nStudent Name : "+name);
}
public static void main(String[] args)
{
new Program_5b();
new Program_5b(10, "David");
}
}
