import java.util.Scanner;
public class Odd {
     
    public static int odd(int a){
        int sum=0;
        for(int i=1 ; i<=a; i++){
            if((i%2)!=0){
                sum = sum + i;
            }
        }

        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        System.out.println(odd(a));
          
    }
}
