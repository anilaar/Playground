#include<stdio.h>
int sum(int m)
{
  	int res;
	for(int i=1;i<=m;i++){
    	res=res+i;
    }
  return res;
}
int main() {
  	int n;
  	scanf("%d" , &n);
  	printf("%d", sum(n));
  // Type your code here
  	return 0;
}