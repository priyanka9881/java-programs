import java.util.Scanner;

public class Email {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String name = " ";
        for(int i=0 ; i<(str.length()-10) ;i++){
            name = name + str.charAt(i);
        }
        System.out.println(name);
        
    }    
}
