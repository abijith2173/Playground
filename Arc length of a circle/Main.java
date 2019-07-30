#include<stdio.h>
int main()
{
  float r,ang,al;
scanf("%f %f",&r,&ang);
  ang=((ang*3.14)/180);
  al=r*ang;
  printf("%.2f",al);
}