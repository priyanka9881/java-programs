#include<stdio.h>
int main(){
    for(int i=1 ; i<=5 ; i++ ){
        int j=1;
        int n=15;
        int c=1;
        for( j=1  ; (j<=i) , (c<=n) ; j--,c++){
          printf("%c");
        }
        printf("\n");
    }
}