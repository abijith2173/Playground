#include<stdio.h>

int main()
{
  char str[1100];
  int i,word=0;
  scanf("%[^\n]s",str);
  for(i=0;str[i]!='\0';i++)
  {
    if(str[i]==' ' || str[i]=='\n')
    {
      word++;
    }
  }
  word++;
  printf("%d",word); 
}