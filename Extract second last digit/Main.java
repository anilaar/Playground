#include<stdio.h>
int main()
{
  int num;
  scanf("%d", &num);
  int s=(num/10)%10;
  printf("%d",s);
  return 0;
}