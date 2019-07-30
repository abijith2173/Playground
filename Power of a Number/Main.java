#include <stdio.h>
int main()
{
  int n,p;
  scanf("%d%d",&n,&p);
  int i,ans=1;
  if(p<0)
  {
    printf("Wrong input");
    return 0;
  }
  for(i=0;i<p;i++)
  {
    ans=ans*n;
  }
  printf("%d",ans);    
    return 0;
}