import java.util.Scanner;
import java.util.Arrays;

//make the main java
public class exerciseBeforeQuiz{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("===Test row and Column===");
    int rows=2;
    int column=5;
    int[][] angka= new int[rows][column];
    for(int i=0;i<rows;i++){
        System.out.println("untuk baris "+(i+1)+".");
    for(int j=0;j<column;j++){
        System.out.print((j+1)+".");

        angka[i][j]=sc.nextInt();    
        }
    }
    for(int i=0;i<rows;i++){
    for(int j=0;j<column;j++){
        System.out.print(angka[i][j]+" ");
    } 
        System.out.println(" ");
}        

    }
}
