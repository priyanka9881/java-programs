import java.util.Scanner;

public class First {
    public static void main(String args[]){
        // int[] marks = new int[3] ;

        // marks[0] = 97;
        // marks[1] = 89;
        // marks[2] = 95;
       /* System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);*/

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // System.out.println(marks.length);

        for(int i =0; i< size ; i++){
            numbers[i] = sc.nextInt();
        }

        for(int i=0 ; i<size ; i++){
            System.out.println(numbers[i]);
        }        
    }    
}
