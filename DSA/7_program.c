/*
Given an array of elements, construct a complete binary tree from this array in level order
fashion. That is, elements from left in the array will be filled in the tree level wise starting from
level 0. Ex: Input :
arr[] = {1, 2, 3, 4, 5, 6}
Output : Root of the following tree
     1
    / \
   2   3
  / \  /\
 4    5  6
*/

#include<stdio.h>
#include<stdlib.h>
#include<math.h>
typedef struct Tree {
int data;
struct BST *ll,*rl;
}BT;
BT *node;
BT *newNode(int data) {
BT* node = (BT*)malloc(sizeof(BT));
node->data = data;
node->ll = node->rl= NULL;
return (node);
}
BT* insertLevelOrder(int arr[],int i, int n) {
BT *root = NULL;
if(i<n) {
root = newNode(arr[i]);
root->ll = insertLevelOrder(arr,2 * i + 1, n);
root->rl = insertLevelOrder(arr, 2 * i + 2, n);
}
return root;
}
void inorder(BT* root) {
if (root != NULL) {
inorder(root->ll);
printf("%d\t",root->data);
inorder(root->rl);
}
}
void preorder(BT* root) {
if(root!=NULL) {
printf("%d\t",root->data);
preorder(root->ll);
preorder(root->rl);
}
}
void postorder(BT* root) {
if (root!=NULL) {
postorder(root->ll);
postorder(root->rl);
printf("%d\t",root->data);
}
}
void represent(int a[100]) {
int m,n;
printf("Enter the height of the node\n");
scanf("%d",&m);
n=m+1;
int x=0;
for(int i=1;i<n;i++){
for(int j=0;j<pow(2,n-1-i)-1;j++)
printf(" ");
for(int k=0;k<pow(2,i-1);k++){
printf("%d",a[x++]);
for(int l=0;l<pow(2,n-i)-1;l++)
printf(" ");
}
printf("\n");
}
}
int main() {
int n,i, a[10];
printf("Enter the no of elements\n");
scanf("%d",&n);
printf("Enter the elements\n");
for(i=0;i<n;i++)
scanf("%d", &a[i]);
BT* root = insertLevelOrder(a, 0, n);
represent(a);
printf("\nInorder traversal\n");
inorder(root);
printf("\nPreorder traversal\n");
preorder(root);
printf("\nPostorder traversal\n");
postorder(root);
}