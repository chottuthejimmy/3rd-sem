/*Desisn, develop and Implement a menu driven program in C for the follwoing Array operations.
  a.Inserting an ELement (ELEM) at a given valid Position (POS)
  b. Deleting an Element at given valid Position (POS)
  c. Display of Array Elements
  d. Exit
  Support the program with functions for each of the above operations.*/

#include <stdio.h>
#include <stdlib.h>

int Insert(int[], int);
int Delete(int[], int);
void Display(int[], int);

int main()
{
  int A[50], i, n = 0;
  int ch;
  printf("Enter the number of Elements to be read\n");
  scanf("%d", &n);
  printf("Enter elements\n");
  for (i = 0; i < n; i++)
    scanf("%d", &A[i]);

  while (1)
  {
    printf("Enter the choice\n");
    printf("Insert:1\nDelete:2\nDisplay:3\nExit:4\n");
    scanf("%d", &ch);
    switch (ch)
    {
    case 1:  
      n = Insert(A, n);
      printf("******************\n");
      break;
    case 2:
      n = Delete(A, n);
      printf("******************\n");
      break;
    case 3:
      Display(A, n);
      printf("******************\n");
      break;
    case 4:
      exit(0);
    default:
      printf("Enter valid option\n");
      break;
    }
  }
}

int Insert(int A[], int n) // 1st base index is being considered to make it simple for the user.
{

  int i, pos, ELEM;

  printf("Enter position of the element to be inserted\n");
  scanf("%d", &pos);
  if (pos <= n + 1 && pos > 0)
  {
    printf("Enter the element\n");
    scanf("%d", &ELEM);
    n++;
    for (i = n - 1; i >= pos; i--)
      A[i] = A[i - 1];

    A[pos - 1] = ELEM;
    //   n = n+1;
  }
  else
    printf("Invalid Position for Insert operation\n");

  return (n);
}

int Delete(int A[], int n) ////1st base index is being considered to make it simple for the user.

{
  int i, pos, ELEM;
  if (n < 1)
    printf("Empty Array\n");
  else
  {
    printf("Enter position of the element to be Delete\n");
    scanf("%d", &pos);

    if (pos <= n && pos > 0)
    {

      for (i = pos - 1; i < n - 1; i++)
        A[i] = A[i + 1];

      n = n - 1;
    }
    else
      printf("Invalid Position for deletion Operation\n");
  }

  return (n);
}

void Display(int A[], int n)
{
  int i;

  if (n > 0)
  {
    printf("******************\n");
    printf("Number of elements in an Arrray = %d \n", n);
    printf("Elements of an array are: \n");
    for (i = 0; i < n; i++)
      printf("%d \n", A[i]);
  }
  else
    printf("Empty Array\n");
}