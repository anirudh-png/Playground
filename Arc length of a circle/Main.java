#include<stdio.h>
int main()
{
  float r,angle,arc_length,pi=3.14;
  scanf("%f %f",&r,&angle);
  arc_length=((2*pi*r)*(angle/360));
  printf("%.2f",arc_length);
  return 0;
}