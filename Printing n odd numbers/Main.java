#include <stdio.h>
int main() 
{
int n;
  scanf("%d",&n);
  for(int num=1;num<=2*n;num++)
  {
    if(num % 2 == 1)
    {
      printf("%d\n",num);
    }
  }
  return 0;
}