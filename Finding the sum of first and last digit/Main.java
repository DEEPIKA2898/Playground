#include <stdio.h>
int main() {
	//Type your code
int n,sum = 0, first_digit, last_digit;
  scanf("%d",&n);
  last_digit=n%10;
  first_digit = n;
  while(n >=10)
  {
    n=n/10;
  }
  first_digit = n;
  sum = first_digit + last_digit;
  printf("%d", sum);
  return 0;
}