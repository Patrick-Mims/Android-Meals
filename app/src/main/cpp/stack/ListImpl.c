#include <stdio.h>
#include <stdlib.h>

#include "../include/List.h"

struct Node new_node()
{
    struct Node *node = NULL;

    if((node = malloc(sizeof(struct Node *))) == NULL)
        exit(EXIT_FAILURE);

    return *node;
}