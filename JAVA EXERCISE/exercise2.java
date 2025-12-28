import java.util.*;
public class exercise2{
//branch function
public static void subs(){
    Scanner sc= new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int result=x-y;
    System.out.println(result);
}
//main method
public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("input data to get operated:");
    subs();    
    
    }
}