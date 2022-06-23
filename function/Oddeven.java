import java.util.Scanner;

public class Oddeven{
    public static void oddEvenNumber(int a){
        if((a%2) == 0 ){
            System.out.println("no. is even");
        }else{
            System.out.println("no. is odd");
        }
       
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        oddEvenNumber(a);
    }

    
}