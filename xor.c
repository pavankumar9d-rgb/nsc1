#include <stdio.h>

int main() {
   
    char *charpointer = "Helloworld";
    int i = 0;

    printf("Result after XOR with 0:\n");
    
  
    while (charpointer[i] != '\0') {
       
        char result = charpointer[i] ^ 0;
        printf("%c", result);
        i++;
    }
    printf("\n");

    return 0;
}
