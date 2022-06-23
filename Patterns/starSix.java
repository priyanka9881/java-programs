public class starSix{
    public static void main(String args[]){
        for(int i=1 ; i<=5 ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
/*
1 
1 2
1 2 3
1 2 3 4
1 2 3 4 5

11 12 13 14 15
21 22 23 24 25
31 32 33 34 35
41 42 43 44 45
51 52 53 54 55
*/