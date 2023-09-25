#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "include/List.h"
#include "include/Stack.h"
#include "include/Thread.h"

#include "/usr/local/include/json-c/json.h"
#include "/usr/local/include/curl/curl.h"

int main(void)
{
    CURL *curl = NULL;
    CURLcode response;

    struct json_object *json_obj = NULL;
/*
    curl = curl_easy_init();

    if(curl) {
        curl_easy_setopt(curl, CURLOPT_URL, "https://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita");
        curl_easy_setopt(curl, CURLOPT_FOLLOWLOCATION, 1L);
    }
    */
    //char *url = "https://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita";
    //char url[1024] = {0};

    // strcpy(url,"https://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita");

    /*
    if((curl = curl_easy_init()) == NULL) {
        exit(EXIT_FAILURE);
    }

    curl_easy_setopt(curl, CURLOPT_URL, "https://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita");

    printf("Good Morning\n");
    */

    return 0;
}