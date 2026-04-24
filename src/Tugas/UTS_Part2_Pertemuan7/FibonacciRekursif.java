package Tugas.UTS_Part2_Pertemuan7;
import java.util.Scanner;

public class FibonacciRekursif {
    
    // Fungsi rekursif untuk mendapatkan nilai Fibonacci ke-n
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        
        System.out.print("Deret Fibonacci hingga suku ke-" + n + ": ");
        
        // Cetak deret dari suku ke-0 sampai ke-n
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i));
            if (i < n) {
                System.out.print(", ");
            }
        }
        
        input.close();
    }
}
