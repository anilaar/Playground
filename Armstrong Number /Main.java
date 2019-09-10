#include <stdio.h>
#include <math.h>
int main() {
	int i,n,digit_count=0,digit,sum=0;
   scanf("%d",&n);
  int m=n;
   while(n!=0)
   {
     digit_count=digit_count+1;
     n=n/10;
   }
  int a=m;
  for(i=digit_count;i>0;i--)
  {
    digit=m%10;
    
    sum=sum+pow(digit,digit_count);
    
    m=m/10;
  }
   if(sum==a)
   {
     printf("Armstrong Number");
   }
  else
  {
   printf("Not an Armstrong Number"); 
  }
	return 0;
}