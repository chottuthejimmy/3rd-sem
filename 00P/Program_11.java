
// Write a java program that reads a file name from the user, displays information about
// whether the file exists, whether the file is readable, or writable, the type of file 
// and the length of the file in byte.

import java.io.File;
import java.util.Scanner;
class Program_11
{
    public static void main(String args[ ])
    {
        Scanner obj = new Scanner(System.in);
            System.out.println("Enter the file name");
            String fname=obj.next();
            obj.close();
            File f1 = new File(fname);//the information given by the user is fetched here
            System.out.println("File Name: " + f1.getName());
            if(f1.exists())
            {
            System.out.println("File exists");
            System.out.println(f1.canWrite() ? "File is writeable" : "File is not writeable");
            System.out.println(f1.canRead() ? "File is readable" : "File is not readable");
            int index = fname.lastIndexOf('.');
            String type = fname.substring(index + 1);//substring function extracts the remaining part of the string
            System.out.println("File type is " + type);
            System.out.println("File size: " + f1.length() + " Bytes");
            }
            else
            {
            System.out.println("File doesn't exist");
            }        
    }
}    