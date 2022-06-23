import java.util.Scanner;

public class Index {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i=0; i<size ; i++){
            numbers[i] = sc.nextInt();
        }
        // System.out.println("Enter a number:");
        int b = sc.nextInt();
        // Index(b);
        
        for(int i=0 ; i<numbers.length; i++){
            if(numbers[i] == b){
                System.out.println("the number we found on index:"+i);

                break;
            }
        }

    }    

    // public static void Index(int a){
    //     for(int i=0 ; i<numbers.length; i++){
    //         if(numbers[i] == a){
    //             break;
    //         }
    //     }
    //     System.out.println(i);
    // }

        
}
