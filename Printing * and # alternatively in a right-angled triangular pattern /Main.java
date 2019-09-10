#include<stdio.h>
int main()
{
	int n;
    scanf("%d", &n);
    int  flag=0;
    for(int cur_row =1; cur_row <= n; cur_row++) 
    {
			for(int cur_col=1; cur_col <= cur_row ; cur_col++) 
              {
		         if(flag ==0)
                 {
                   printf("*");
                   flag=1;
                 }
              else
              {
                printf("#");
                flag=0;
              }
       
			  }
		     printf("\n");
    }
    return 0;
}

  
