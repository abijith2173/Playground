#include<stdio.h>
int main()
{
  int a,b,n,g,i;
  scanf("%d%d",&a,&b);
  if(a>b) n=b;
  else n=a;
  for(i=n;i<=n;i--)
  { if((a%i==0)&&(b%i==0))
  {
    g=i;
   printf("%d",(a*b)/g);
   return 0;
  }
  }
   return 0;
}