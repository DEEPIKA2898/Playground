#include <stdio.h>
int main()
{
int n;
  scanf("%d",&n);
  int turn=0;
  for(int row=1;row<=n;row++)
  {
    for(int col=1;col<=row;col++)
    
    if(turn == 0 )
    {
      printf("*");
      turn=1;
    }
    else
    {
      printf("#");
      turn=0;
    }
    printf("\n");
  }
  	return 0;
}