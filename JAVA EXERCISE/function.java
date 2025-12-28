import java.util.Scanner;

public class function {

    // Method to add two numbers
   public static int add(int x,int y){
        return x+y;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = input.nextInt();

        System.out.print("Enter second number: ");
        int y = input.nextInt();

        // Call method and store result
        System.out.println("The result is: "+ add);
        

    }
}
