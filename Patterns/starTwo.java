class starTwo{
    public static void main(String arg[]){

        for(int i=1 ; i<=4 ; i++){
            for(int j=1 ; j<=5 ; j++){
                if ((i==1) || (j==5) || (i==4) || (j==1)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
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
*/