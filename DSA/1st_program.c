/*Design, Develop and  Implement a menu driven Program in C for the following Array Operations
a. Creating an Array of N Integer Elements
b. Display of Array Elements with Suitable Headings
c. Exit.
Support the program with functions for each of the above operations.*/
#include<stdio.h> 
#include<stdlib.h>
int a[50];
int n,i;
/*Function Prototype*/
void create();
void display();
int main()
{
int choice;
while(1)
{
printf("*******MENU*******\n");
printf("1.CREATE\n");
printf("2.DISPLAY\n");
printf("3.EXIT\n");
printf("******************\n");
printf("Enter your choice: ");
scanf("%d",&choice);
switch(choice)
{
case 1:
create();
break;
case 2:
display();
break;
case 3:
exit(0);
default:
printf("Invalid choice!\n");
break;
}
}
return 0;
}
//creating an array
void create()
{
printf("Enter the size of the array elements: ");
scanf("%d",&n);
printf("Enter the elements for the array:\n");
for(i=0;i<n;i++)
{
scanf("%d",&a[i]);
}
}
//displaying an array elements
void display()
{
int i;
printf("The array elements are:\n");
printf("\t");
for(i=0;i<n;i++)
{
printf("%d  ",a[i]);
}
printf("\n");
}