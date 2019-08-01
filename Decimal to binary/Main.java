#include<stdio.h>
void dec_to_bin(int n)
{
  int i;
  int binarynum[32];
  while(n>0)
  {
    
    binarynum[i]=n%2;
    n=n/2;
    i++;
  }
  for(int j=i-1;j>=0;j--)
  {
    printf("%d",binarynum[j]);
  }
}
int main()
{
  int n;
  scanf("%d",&n);
  dec_to_bin(n);
  
  
  return 0;
}