    
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ukuran array (bisa kamu ubah)
        int rows = 2;
        int cols = 5;

        // Deklarasi array 2 dimensi
        int[][] data = new int[rows][cols];

        // ================================
        // INPUT ARRAY
        // ================================
        System.out.println("=== INPUT NILAI ARRAY 2D ===");

        for (int i = 0; i < rows; i++) {
            System.out.println("Row " + i + ":");
            for (int j = 0; j < cols; j++) {
                System.out.print("  Masukkan data[" + i + "][" + j + "] : ");
                data[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("=== DATA YANG DIINPUT ===");

        // ================================
        // OUTPUT ARRAY
        // ================================
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println(); // pindah baris
        }
    }
}
