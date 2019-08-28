#include <stdio.h>
int main() {
int n,factorial,remainder,sum;
  scanf("%d",&n);
  int temp=n;
  for( temp = n; temp>0; temp=temp/10)
  {
    factorial = 1;
    remainder = temp % 10;
    for(int i =1; i<=remainder; i++)
    {
      factorial = factorial * i;
    }
    sum = sum + factorial;
  }
  if( n == sum)
    printf("Yes",n);
  else
    printf("No",n);
  return 0;
}