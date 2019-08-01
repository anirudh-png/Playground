#include<stdio.h>
int main()
{
	int a,n,d,s1,s2,nth_term;
    scanf("%d",&n);
    if(n%2==1)
    {
      a=0;
      d=2;
      s1=((n/2)+1);
      nth_term=(a+(s1-1)*d);
      printf("%d",nth_term);
    }
    else if(n%2==0)
    {
      a=0;
      d=1;
      s2=(n/2);
      nth_term=(a+(s2-1)*d);
      printf("%d",nth_term);
    }
	
}