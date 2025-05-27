#include<stdio.h>
void main()
{
    int n,ch=0,i;
    char a[10];
    printf("Enter the number");
    scanf("%d",&n);
    while(n>0)
    {
        n--;
        a[ch]=n%26+'A';
        n=n/26;
        //printf("%c\n",a[ch]);
        ch++;
    }
    for(i=ch-1;i>=0;i--)
    {
        printf("%c",a[i]);
    }
    
}
