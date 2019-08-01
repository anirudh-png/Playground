#include<stdio.h>
void dec_to_octal(int n)
{
  int i=0;
  int octalnum[32];
  while(n>0)
  {
    octalnum[i]=n%8;
    n=n/8;
    i++;
  }
  for(int j=i-1;j>=0;j--)
  {
    printf("%d",octalnum[j]);
  }
    
}   
int main()
{
  int n;
  scanf("%d",&n);
  dec_to_octal(n);
  
  
  return 0;
}