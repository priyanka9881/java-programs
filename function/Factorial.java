import java.util.Scanner;

public class Factorial{
    public static void factorialNumber(int a){
        for(int i=1 ; i<=a ; i++){
            int factorial = 1; 
            factorial = factorial * i ;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        factorialNumber(a);
    }
}