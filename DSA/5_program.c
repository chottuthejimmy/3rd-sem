// //Singly Linked List (SLL) of Integer Data
// a. Create a SLL stack of N integer.
// b. Display of SLL
// c. Linear search. Create a SLL queue of N Students Data Concatenation of two SLL of integers.
#include<stdio.h>
#include<stdlib.h>
typedef struct node 
{
    int data;
    struct Node *link; 
} Node;

// typedef struct Node
// {
// int data;
// struct Node*link;
// }Node;
Node *first=NULL,*head=NULL;
void create()
{
int n;
printf("Enter the number of nodes: ");
scanf("%d", &n);
for (int i = 0; i < n; i++)
{
int x;
printf("Enter data for Node %d: ", i+1);
scanf("%d", &x);
Node* nn = (Node*)malloc(sizeof(Node));
nn->data= x;
nn->link= head;
head = nn;
}
}
void display()
{
if(head==NULL)
{
printf("list is empty");
return;
}
Node* ptr = head;
while (ptr != NULL)
{
printf("%d ", ptr->data);
ptr = ptr->link;
}
printf("\n");
}
void search()
{
if(head==NULL)
{
printf("list is empty");
return;
}
int x;
printf("Enter the value to search for: ");
scanf("%d", &x);
Node* ptr = head;
while (ptr != NULL)
{
if (ptr->data == x)
{
printf("%d found \n",x);
return;
}
ptr = ptr->link;
}
printf("%d not found in list\n", x);
}
void student()
{
typedef struct Student
{
char name[50];
char usn[10];
char branch[5];
char phone[10];
struct Student *next;
}STU;
struct Queue
{
struct Student *front;
struct Student *rear;
};
int n;
printf("Enter the number of students: ");
scanf("%d", &n);
struct Queue q;
q.front=q.rear=NULL;
for (int i=1;i<=n;i++)
{
STU *temp = (STU*)malloc(sizeof(STU));
printf("Enter student %d name: ",i);
scanf("%s",temp->name);
printf("Enter student %d USN: ",i);
scanf("%s",temp->usn);
printf("Enter student %d branch: ",i);
scanf("%s",temp->branch);
printf("Enter student %d phone: ",i);
scanf("%s",temp->phone);
temp->next = NULL;
if (q.rear==NULL)
{
q.front=q.rear=temp;
continue;
}
q.rear->next=temp;
q.rear=temp;
}
STU *temp = q.front;
int i=1;
while (temp != NULL)
{
printf("Details of Student %d\n",i);
printf("Name: %s\n", temp->name);
printf("USN: %s\n", temp->usn);
printf("Branch: %s\n", temp->branch);
printf("Phone: %s\n", temp->phone);
temp = temp->next;
i++;
}
}
void createcat()
{
Node *prev,*a=NULL,*b=NULL,*p;
int n,i;
printf ("number of elements in a:");
scanf("%d",&n);
for(i=0;i<n;i++)
{
printf("enter integer: ");
p=malloc(sizeof(Node));
scanf("%d",&p->data);
p->link=NULL;
if(a==NULL)
a=p;
else
prev->link=p;
prev=p;
}
printf ("number of elements in b:");
scanf("%d",&n);
for(i=0;i<n;i++)
{
printf("enter integer: ");
p=malloc(sizeof(Node));
scanf("%d",&p->data);
p->link=NULL;
if(b==NULL)
b=p;
else
prev->link=p;
prev=p;
}
concatenate(a,b);
if(a!= NULL)
{
displaycat(a);
}
}
void concatenate(struct node *a,struct node *b)
{
if( a!=NULL && b!=NULL )
{
if (a->link == NULL)
a->link = b;
else
concatenate(a->link,b);
}
else
printf("Either a or b is NULL\n");
}
void displaycat(struct node *head)
{
if(head == NULL)
{
printf("NULL\n");
}
else
{
printf("%d->", head -> data);
displaycat(head->link);
}
}
int main()
{
int ch;
while(1)
{
printf("\nSLL\n");
printf("1.Create\n");
printf("2.Display\n");
printf("3.Search\n");
printf("4.Student details\n");
printf("5.Concatenate\n");
printf("6.Exit\n");
printf("Enter your choice\n");
scanf("%d",&ch);
switch(ch)
{
case 1: create();
break;
case 2: display();
break;
case 3: search();
break;
case 4: student();
break;
case 5: createcat();
break;
case 6: exit(0);
}
}
}