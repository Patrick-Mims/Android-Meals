#include <stdio.h>
#include <stdlib.h>

#include "../include/Stack.h"

struct Stack {
    int *data;
    int ptr;
    int size;
};

struct Stack *create_stack(int size)
{
    //stack_t stack;
    struct Stack *stack = NULL;
    // stack_t stack;

    if((stack = malloc(sizeof(struct Stack))) == NULL)
    {
        exit(EXIT_FAILURE);
    }

    if((stack->data = malloc(size * sizeof(int))) == NULL)
    {
        free(stack);
        exit(EXIT_FAILURE);
    }

    stack->ptr = 0;
    stack->size = size;

    return stack;
}

int isFull(struct Stack *stack)
{
    return stack->ptr == stack->size;
}

int isEmpty(struct Stack *stack)
{
    return stack->ptr == 0;
}

void push(struct Stack *stack, int item)
{
    if(isFull(stack))
    {
        printf("Stack Full\n");
        exit(EXIT_FAILURE);
    }

    stack->data[stack->ptr] = item;
    stack->ptr++;
}

void pop(struct Stack *stack)
{
    if(isEmpty(stack)) {
        printf("Stack Empty\n");
        exit(EXIT_FAILURE);
    }

    stack->ptr--;
}

int peek(struct Stack *stack) {
    return stack->ptr;
}