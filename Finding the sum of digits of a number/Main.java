#include <stdio.h>
int main() {
int n,t,remainder;
  int sum = 0;
  scanf("%d",&n);
  t = n;
  while(t != 0)
  {
    remainder = t % 10;
    sum = sum + remainder;
    t = t/10;
  }
  printf("%d",sum);	
	return 0;
}