import java.util.Scanner;
public class Greater{
    public static void greater(int a,int b){
        if(a == b){
            System.out.println("both are equal");
        }else if(a > b){
            System.out.println(a+" is greater than "+b);
        }else{
            System.out.println(b+" is greater than "+a);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        greater(a, b);
    }
}