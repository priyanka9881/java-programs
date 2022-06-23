import java.util.Scanner;

public class Question2 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];
        Scanner ab = new Scanner(System.in);
        int r = ab.nextInt();
        int c = ab.nextInt();

        int[][] numbers1 = new int[r][c];

        //input
        for(int i=0 ; i<rows; i++){
            //columns
            
                for(int j=0; j<cols; j++){
                    numbers[i][j] = sc.nextInt();
                }
            }

            //output
            for(int i=0; i<rows; i++){

                for(int j=0; j<cols; j++) {
                    if(numbers[i][j] < numbers[i][j+1]){
                        numbers1[i][j] = ab.nextInt() ;   
                    }
                }
            }

            for(int i=0; i<rows; i++){

                for(int j=0; j<cols; j++) {
                   System.out.print(numbers1[i][j]+" "); 
                    }
                    System.out.println();
                }
            }
    }

