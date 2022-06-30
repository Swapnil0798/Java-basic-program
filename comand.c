#include<stdio.h>
#include<stdlib.h>
int main(int argc,char*argv[])
{ 
     int ans=0;
    printf("name of executable is :%d\n",argv[0]);
    printf("number of arrg\n",argc);
     ans=atoi(argv[1]) + atoi(argv[2]);
     printf("adition is :%d\n",ans);
    return 0;
}