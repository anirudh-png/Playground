#include<stdio.h>

int main()
{
   char str[100];
  int word=0;
  scanf("%[^\n]s",&str);
  
  for(int i=0;str[i]!='\0';i++)
  {
    if(str[i]==' ')
    {
      word++;
    }
  }
  word++;
  printf("%d",word);
  return 0;
    
}