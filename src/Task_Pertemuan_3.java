import java.util.Arrays;

public class Task_Pertemuan_3 {
    public static void main(String[] args) {
        int[] x = {20, 15, 90, 13, 26};
        System.out.println("data awal = " + Arrays.toString(x));
        // Outer loop untuk mengontrol jumlah iterasi (1 sampai 4)
        for (int j = 0; j < x.length - 1; j++) {
            
            int min = x[j];
            int index = j;

            // Inner loop: mencari nilai terkecil dari sisa array
            for (int i = j + 1; i < x.length; i++) { 
                if (x[i] < min) {
                    min = x[i];
                    index = i;
                }
            }

            // Proses Tukar (Swap)
            if (x[j] > x[index]) {
                int temp = x[j];
                x[j] = x[index];
                x[index] = temp;
            }

            // Cetak Hasil per Iterasi langsung di dalam loop
            System.out.print("Iterasi " + (j + 1) + ": ");
            for (int k = 0; k < x.length; k++) {
                System.out.print(x[k] + " ");
            }
            System.out.println(); // Pindah baris untuk iterasi berikutnya
        }
    }
}