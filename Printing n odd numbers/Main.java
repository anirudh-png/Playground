#include <stdio.h>
int main() {
	int n,j,i;
    scanf("%d",&n);
    for(j=1,i=1;j<=n;i=i+2,j++)
	{
		printf("%d\n",i);
	}
	return 0;
}