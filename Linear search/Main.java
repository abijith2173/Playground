#include<stdio.h>
int main()
{
  int n,i,search_else,isPresent=0;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  scanf("%d",&search_else);
  for(i=0;i<n;i++)
  {
  if(arr[i]==search_else)
  {
    printf("%d",i+1);
    return 0;
  }
  }
  printf("%d isn't present in the array.",search_else);
  return 0;
}