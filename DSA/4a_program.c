//Design, Develop and Implement a Program in C for the following Stack Applications
//a. Evaluation of Suffix expression with single digit operands and operators: +, -, *, /, %, ^

#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<math.h>
#define MAX 50
int stack[MAX];
char post[MAX];
int top= -1;
/*fUNCTION PROTOYPE */
void pushstack(int tmp);
void calculator(char c);
int main()
{
int i;
printf("Insert a postfix notation : ");
  fgets(post, sizeof(post), stdin);
// scanf("%s",post);
for(i=0;i<strlen(post);i++)
{
if(post[i]>='0' && post[i]<='9')
{
pushstack(i);
}
else if(post[i]=='+' || post[i]=='-' || post[i]=='*' || post[i]=='/' || post[i]=='^')
{
calculator(post[i]);
}
else
{
printf("Invalid input!");
return 0;
}
}
printf("Result =  %d",stack[top]);
}
void pushstack(int tmp)
{
top++;
stack[top]=(int)(post[tmp]-48);
}
void calculator(char c)
{
int a,b,ans;
a=stack[top];
stack[top]='\0';
top--;
b=stack[top];
stack[top]='\0';
top--;
switch(c)
{
case '+': ans=b+a;
          break;
case '-': ans=b-a;
          break;
case '*': ans=b*a;
          break;
case '/': ans=b/a;
          break;
case '^': ans=pow(b,a);
          break;
default: ans=0;
}
top++;
stack[top]=ans;
}