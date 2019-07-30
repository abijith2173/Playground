#include <stdio.h>
// Main function
int main()
{
 int a,b,n;
  scanf("%d%d",&a,&b);
  if(a>b)
    n=b;
  else
    n=a;
  int i=0;
  for(i=n;i<=n;i--)
  { if((a%i==0)&&(b%i==0))
  {
    printf("%d",i);
      return 0;
  }}
   return 0;
}
  