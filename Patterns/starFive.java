public class starFive{
    public static void main(String args[]){
        int n=4;
        for(int i=4 ; i>=1 ; i--){
            for(int j=1 ; j<i ; j++){
                System.out.print("  ");
            }
            for(int j=0; j<=n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*
      * 
    * *
  * * *
* * * *
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
*/