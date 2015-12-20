#include <stdio.h>

/* A purpose of the program is to reverse a C-Style String 
CCI Task 1.2
Write code to reverse a C-Style String (C-String means that “abcd” is represented as five characters, including the null character )
*/

void swap_characters(char *a, char *b);
int main(int argc, char *argv[]) {
	char *str_beginning = argv[1];
	char *temp = argv[1];
	printf("Before change : %s\n", str_beginning);
	
	while (*temp != 0) {
		temp++;
	}
	--temp;
	//Now temp is pointing at one address before null:) 
	while (*temp != *str_beginning) {
		swap_characters(temp, str_beginning);
		temp--;
		str_beginning++;
	}	
	printf("After change: %s\n", argv[1]);	
}

void swap_characters(char *a, char *b) {
	char temp = *a;
	*a = *b;
	*b = temp;
}