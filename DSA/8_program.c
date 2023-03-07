#include <stdio.h>
#include <stdlib.h>
typedef struct BST {
int data;
struct BST *left;
struct BST *right;
}NODE;
NODE *node;
NODE* createtree(NODE *node, int data) {
if(node == NULL) {
NODE *temp;
temp= (NODE*)malloc(sizeof(NODE));
temp->data = data;
temp->left = temp->right = NULL;
return temp;
}
if (data < (node->data)) {
node->left = createtree(node->left,data);
}
else
if (data > node->data) {
node -> right = createtree(node->right,data);
}
return node;
}
void inorder(NODE *node) {
if(node != NULL) {
inorder(node->left);
printf("%d\t", node->data);
inorder(node->right);
}
}
void preorder(NODE *node) {
if(node != NULL) {
printf("%d\t", node->data);
preorder(node->left);
preorder(node->right);
}
}
void postorder(NODE *node) {
if(node != NULL) {
postorder(node->left);
postorder(node->right);
printf("%d\t", node->data);
}
}
void main() {
int data, ch, i, n;
NODE *root=NULL;
while (1) {
printf("\n1.Create a Binary Search Tree\n");
printf("2.Inorder\n");
printf("3.Preorder\n");
printf("4.Postorder\n");
printf("5.Exit\n");
printf("Enter your choice: \n");
scanf("%d", &ch);
switch (ch) {
case 1: printf("Enter the Number of nodes in a Tree: \n" );
scanf("%d", &n);
printf("Enter the values to create BST(first value should be the value of root node)\n");
for(i=0; i<n; i++) {
scanf("%d", &data);
root=createtree(root, data);
}
break;
case 2: printf("\nInorder Traversal: \n");
inorder(root);
break;
case 3: printf("\nPreorder Traversal: \n");
preorder(root);
break;
case 4: printf("\nPostorder Traversal: \n");
postorder(root);
break;
case 5: exit(0);
default: printf("Wrong option\n");
break;
}
}
}