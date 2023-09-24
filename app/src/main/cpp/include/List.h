#ifndef LIST_H
#define LIST_H

struct Node {
    int *data;
    struct Node *next;
};

struct Node new_node();

void insert(struct Node **, int);
void display(struct Node *);

#endif