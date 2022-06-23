public class Three {

    public static void main(String[] args){
        int i=1,j=1;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
/*
11 12 13 14 15
21 22 23 24 25
31 32 33 34 35
41 42 43 44 45 
51 52 53 54 55

1 
0 1
1 0 1
0 1 0 1
1 0 1 0 1
*/