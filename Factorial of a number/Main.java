#include <stdio.h>
int main() {
  int n,i,prod=1;
  scanf("%d",&n);
    if(n==0)
    {
      printf("1");
    }
  else
  {
	for(i=n;i>=1;i--)
    {
      prod=prod*i;
    }
  }
  printf("%d",prod);
	return 0;
}