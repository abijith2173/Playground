#include<stdio.h>
int main()
{
 int a,b;
 scanf("%d",&a);
 b=(((a%10000)%1000)%100)/10;
  printf("%d",b);
  return 0;
}