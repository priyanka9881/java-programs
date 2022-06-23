import java.util.Scanner;

public class Sum{
    public static int sumNumber(int a , int b){
        return a + b;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = sumNumber(a, b);
        System.out.println(sum);
    }
}