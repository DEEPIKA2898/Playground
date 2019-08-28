#include <stdio.h>
int main() 
{
int n,r,sum,temp;
scanf("%d",&n);
  for(temp = n; n!= 0;n = n/10)
  {
    r = n % 10;
    sum = sum  + (r*r*r);
  }
  if(sum==temp)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
	return 0;
}