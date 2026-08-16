#include <stdio.h>

int main() {
    char *charpointer = "Helloworld";
    int i;

    printf("Original string: %s\n", charpointer);

    printf("\nAfter AND with 127:\n");
    i = 0;
    while (charpointer[i] != '\0') {
        printf("%c", charpointer[i] & 127);
        i++;
    }
    printf("\n");

    printf("\nAfter OR with 127:\n");
    i = 0;
    while (charpointer[i] != '\0') {
        printf("%c", charpointer[i] | 127);
        i++;
    }
    printf("\n");

    printf("\nAfter XOR with 127:\n");
    i = 0;
    while (charpointer[i] != '\0') {
        printf("%c", charpointer[i] ^ 127);
        i++;
    }
    printf("\n");

    return 0;
}
