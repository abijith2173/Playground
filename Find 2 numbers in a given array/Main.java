#include<stdio.h>
int main()
{
 int n,i,else_1,else_2,else1_index=-1,else2_index=-1;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d%d",&else_1,&else_2);
  for(i=0;i<n;i++)
  {
    if(else_1==a[i] && else1_index==-1)
    {
      else1_index=i;
    }
    if(else_2==a[i] && else2_index==-1)
    {
      else2_index=i;
    }
  }
    printf("Element 1 index = %d\nElement 2 index = %d",else1_index,else2_index);
}
