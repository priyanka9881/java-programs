import java.util.*;

public class Reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String name = " ";
        for(int i=word.length()-1 ; i>=0; i--){
            name = name + word.charAt(i);

        }
        System.out.print(name);
    }
}
