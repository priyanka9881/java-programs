import java.util.Scanner;

public class Prime{
    public static void primeNumber(int a){
        int i=0;
        if(a!=2){
            System.out.println("the no. is not prime");
            return;
        }
        for( i=(a/2) ; i>=2 ; i--){
            if((a % i) == 0){
                break;
            }
        }
        if( (i == 1) || (a==1)){
            System.out.println("the no. is prime");
            return;
        }else{
            System.out.println("the no. is not prime");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        primeNumber(a);
    }
}