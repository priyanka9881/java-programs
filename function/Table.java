import java.util.Scanner;

public class Table{
    public static void table(int a){
        for(int i=1 ; i<=10 ; i++){
            System.out.println(i*a);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        table(a);
    }

    
}