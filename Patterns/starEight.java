public class starEight{
    public static void main(String args[]){
        int n=1;

        for(int i=1 ; i<=5 ; i++){
            for(int j=1 ; j<=i ; j++){
                if(n<15){
                System.out.print(n+ " ");
                }
                n++;

            }
            System.out.println();
        }
    }
}
/*
1 
2 3
4 5 6
7 8 9 10
11 12 13 14

11 12 13 14 
21 22 23 24 
31 32 33 34 
41 42 43 44 
51 52 53 54 
*/