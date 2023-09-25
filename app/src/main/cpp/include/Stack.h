/*
 * Author: Patrick Mims
 * Date: September 21, 2023
 * File: Stack.h
 * */

#ifndef STACK_H
#define STACK_H

struct Stack *create_stack(int);

int isFull(struct Stack *);
int isEmpty(struct Stack *);
int peek(struct Stack *);
void pop(struct Stack *);
void push(struct Stack *, int);

#endif