#include<stdio.h>
int main()
{
	 char a[50];
  scanf("%s",&a);
  int length,count=1;
  for(length=0;a[length]!='\0';length++);
  if(length>20)
  {
    printf("Invalid Input");
  }
  else
  {
    for(int i=0;i<length;i++)
    {
      if(a[i]==a[i+1])
      {
        count++;
      }
      else
      {
        printf("%c%d",a[i],count);
        count=1;
      }
    }
  }
    return 0;
  
}