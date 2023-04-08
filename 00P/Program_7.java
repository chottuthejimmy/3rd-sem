//Write a java program to generate the resume. Create 2 Java classes: teacher (data: personal information, qualification, experience, achievements) and student (data: personal information, result, discipline) which implements the Java interface resume with the method biodata().

import java.util.Scanner;

interface resume {
    public void biodata();
}

class teacher implements resume {
    String name, emailid, qualification, acheivements, address;
    long phone;
    int age;
    float experience;

    @Override
    public void biodata() {
        System.out.println("\t***********************");
        System.out.println("\tThe Teacher details are :");
        System.out.println("\tName : " + name);
        System.out.println("\tEmail id : " + emailid);
        System.out.println("\tPhone No : " + phone);
        System.out.println("\tAddress : " + address);
        System.out.println("\tAge : " + age);
        System.out.println("\tQualification : " + qualification);
        System.out.println("\tExperience : " + experience);
        System.out.println("\tAcheivements : " + acheivements);
        System.out.println("\t***********************");
    }
}

class student implements resume {
    String name, emailid, address, discipline;
    long phone;
    int age;
    float result;

    @Override
    public void biodata() {
        System.out.println("\t***********************");
        System.out.println("\tThe Student details are :");
        System.out.println("\tName : " + name);
        System.out.println("\tEmail id : " + emailid);
        System.out.println("\tPhone : " + phone);
        System.out.println("\tAddress : " + address);
        System.out.println("\tAge : " + age);
        System.out.println("\tResult : " + result);
        System.out.println("\tDiscipline : " + discipline);
        System.out.println("\t***********************");
    }
}

public class Program_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        teacher t = new teacher();
        student s = new student();
        System.out.println("Enter the name of the teacher:");
        t.name = sc.next();
        t.name += sc.nextLine();
        System.out.println("Enter the email id of the teacher:");
        t.emailid = sc.next();
        System.out.println("Enter the phone no of the teacher:");
        t.phone = sc.nextLong();
        System.out.println("Enter the address of the teacher:");
        t.address = sc.next();
        t.address += sc.nextLine();
        System.out.println("Enter the age of the teacher:");
        t.age = sc.nextInt();
        System.out.println("Enter the qualification of the teacher:");
        t.qualification = sc.next();
        System.out.println("Enter the experience of the teacher:");
        t.experience = sc.nextFloat();
        System.out.println("Enter the acheivements of the teacher:");
        t.acheivements = sc.next();
        t.acheivements += sc.nextLine();
        t.biodata();
        System.out.println("Enter the name of the student:");
        s.name = sc.next();
        s.name += sc.nextLine();
        System.out.println("Enter the email id of the student:");
        s.emailid = sc.next();
        System.out.println("Enter the phone no of the student:");
        s.phone = sc.nextLong();
        System.out.println("Enter the address of the student:");
        s.address = sc.next();
        s.address += sc.nextLine();
        System.out.println("Enter the age of the student:");
        s.age = sc.nextInt();
        System.out.println("Enter the result of the student:");
        s.result = sc.nextFloat();
        System.out.println("Enter the discipline of the student:"); 
        s.discipline = sc.next();
        s.discipline += sc.nextLine();
        sc.close();
        s.biodata();
    }
}