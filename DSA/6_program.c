#include<stdio.h>
#include<stdlib.h>
typedef struct
{
int id;
char name[20],branch[30],area[40];
struct node *llink,*rlink;
}node;
node *first=NULL,*temp,*newnode;
int i,n;
void insert_rear();
void delete_front();
void delete_rear();
void DLL_stack();
void DLL_queue();
void display()
{
if(first==NULL)
{
printf("list is empty!\n");
return;
}
temp=first;
int total=0;
while(temp!=NULL)
{
printf("ID: %d\nName: %s\nBranch: %s\nArea: %s\n",temp->id,temp->name,temp->branch,temp->area);
printf("\n");
temp=temp->rlink;
total++;
}
printf("Total Professors=%d\n",total);
}
void delete_front()
{
if(first==NULL)
{
printf("\nlist is empty!\n");
return;
}
temp=first;
first=first->rlink;
free(temp);
}
void insert_rear()
{
newnode=(node*)malloc(sizeof(node));
printf("Enter Professor ID: ");
scanf("%d", &newnode->id);
printf("Enter Professor Name: ");
scanf("%s", newnode->name);
printf("Enter Professor Branch: ");
scanf("%s", newnode->branch);
printf("Enter Professor Area of Specialization: ");
scanf("%s", newnode->area);
newnode->rlink=NULL;
if(first==NULL)
{
newnode->llink=NULL;
first=newnode;
}
else
{
temp=first;
while(temp->rlink!=NULL)
temp=temp->rlink;
temp->rlink=newnode;
newnode->llink=temp;
}
}
void delete_rear()
{
if(first==NULL)
{
printf("\nlist is empty!\n");
return;
}
temp=first;
if(temp->rlink==NULL)
{
free(temp);
first=NULL;
return;
}
else
{
node *slast;
slast=temp=first;
while(temp->rlink!=NULL)
{
temp=temp->rlink;
}
slast=temp->llink;
slast->rlink=NULL;
free(temp);
}
}
void main()
{
menu();
}
void menu()
{
int ch;
while(1)
{
printf("\n DLL\n");
printf("1. DLL using stacks\n");
printf("2. DLL using queues\n");
printf("3. Display\n");
printf("4. Exit\n");
printf("Enter your choice\n");
scanf("%d",&ch);
switch(ch)
{
case 1: DLL_stack();
break;
case 2: DLL_queue();
break;
case 3: display();
break;
case 4: exit(0);
default: printf("\n INVALID CHOICE\n");
break;
}
}
}
void DLL_stack()
{
int ch;
while(1)
{
printf("DLL using Stack\n");
printf("1. Insert from rear\n");
printf("2. Delete from rear\n");
printf("3. Display\n");
printf("4. Exit \n");
printf("Enter your choice\n");
scanf("%d",&ch);
switch(ch)
{
case 1: insert_rear();
break;
case 2: delete_rear();
break;
case 3: display();
break;
case 4: menu();
break;
default: printf("\n wrong choice\n");
break;
}
}
}
void DLL_queue()
{
int ch;
while(1)
{
printf("DLL using Queue\n");
printf("1. Insert from rear\n");
printf("2. Delete from front\n");
printf("3. Display\n");
printf("4. Exit\n");
printf("Enter your choice\n");
scanf("%d",&ch);
switch(ch)
{
case 1: insert_rear();
break;
case 2: delete_front();
break;
case 3: display();
break;
case 4: menu();
break;
default: printf("Invalid\n");
break;
}
}
}