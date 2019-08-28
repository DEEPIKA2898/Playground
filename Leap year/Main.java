#include<stdio.h>
int main()
{
 int year,r;
  scanf("%d",&year);
  r=year%4;
  if(r==0)
  {
    printf("Leap year");
  }
  else
  {
    printf("Not Leap year");
  }
}