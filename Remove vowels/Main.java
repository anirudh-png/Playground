#include<stdio.h>
int isVowel(char c)
{
  if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='o' || c=='i' || c=='u')
  {
     return 0;
  }
  else
  {
    return 1;
  }
}
int main()
{
  char str[100];
  scanf("%[^\n]s", str);
  for(int i=0;str[i]!='\0';i++)
  {
    if(isVowel(str[i]))
    {
      printf("%c",str[i]);
    }
  }
  
  
  return 0;
}