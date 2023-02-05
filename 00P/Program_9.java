//    Write a program to perform string operations using ArrayList. Write functions for
//   the following a. Append - add at end b. Insert – add at particular index c. Search d. List all
//   string starts with given letter.

import java.util.*;

public class Program_9 {
    ArrayList<String> list = new ArrayList<String>(); // Creating arraylist
    Scanner scob1 = new Scanner(System.in);

    public void arraydisplay() {
        list.add("CSE");// Adding object in arraylist
        list.add("ISE");
        list.add("ME");
        System.out.println("ArrayList element are");
        System.out.println(list + "\n");// gives the elements of the list
        // System.out.println("");
    }

    public void appendatend() {
        System.out.println("Enter the element to append at end");
        String ele = scob1.next();
        list.add(ele.toUpperCase());
        System.out.println(list + "\n");
    }

    public void insertatpos() {
        System.out.println("Enter the position and element to insert");
        int posind = scob1.nextInt();
        if (posind > list.size() + 1 || posind < 1) {
            System.out.println("Invalid position\n");
            return;
        }
        String ele = scob1.next();
        list.add(posind - 1, ele.toUpperCase());
        System.out.println(list + "\n");
    }

    public void searchele() {
        System.out.println("Enter the Array element to search");
        String arele = scob1.next();
        int in = list.indexOf(arele.toUpperCase());
        if (in == -1) {
            System.out.println("Element not found\n");
        } else {
            System.out.println("Element found at " + (in + 1) + " position\n");
        }

    }

    void print()
    {
        System.out.println("Enter the starting character to print strings");
        String inputc = scob1.next();
        System.out.println("String starting with character " + inputc.toUpperCase() + " are");
        boolean flag = false;
        for (String i : list) {
            if (i.startsWith(inputc.toUpperCase())){
                System.out.println(i);
                flag = true;
            }

        }
        if (!flag)
            System.out.println("None");
    }

    public static void main(String args[]) {
        Program_9 obj = new Program_9();
        obj.arraydisplay();
        obj.appendatend();
        obj.insertatpos();
        obj.searchele();
        obj.print();
    }
}