#include<stdlib.h>
#include<stdio.h>
// #define max_size 5
int stack[100],top = -1;
int push(int);
void pop();
void display();
int main()
{
    int choice,sz;
    printf("Enter the size of the stack: ");
    scanf("%d",&sz);
while(1)
{
printf("********STACK OPERATIONS********\n");
printf("1.Push\n");
printf("2.Pop\n");
printf("3.Display\n");
printf("4.Exit\n");
printf("******************\n");
printf("Enter your choice: ");
scanf("%d",&choice);
switch(choice)
{
case 1: push(sz);
        break;
case 2: pop();
        break;
case 3: display();
        break;
case 4: exit(0);
default: printf("--Invalid choice!--\n");
        break;
}
}
return 0;
}
int push(int sz) //Inserting element into the stack
{
int item,n;
if(top==(sz-1))
{
printf("--Stack Overflow!--\n");
}
else
{
printf("Enter the element to be inserted: ");
scanf("%d",&item);
top++;
stack[top]=item;
}
}
void pop() //deleting an element from the stack
{
int item;
if(top==-1)
{
printf("--Stack Underflow!--\n");
}
else
{
item=stack[top];
top--;
printf("The poped element: %d\n",item);
}
}
void display()
{
int i;
if(top==-1)
{
printf("--Stack is Empty!--\n");
}
else
{
printf("The stack elements are:\n");
for(i=top;i>=0;i--)
{
printf("%d\n",stack[i]);
}
}
}