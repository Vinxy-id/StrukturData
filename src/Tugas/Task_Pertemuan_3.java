package Tugas;
public class Task_Pertemuan_3 {
    public static void main(String[] args) {
        int[] x = {20, 15, 90, 13, 26};
        // Cetak Data Awal
        System.out.print("Data Awal: [");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + (i == x.length - 1 ? "" : ", "));
        }
        System.out.println("]");

        // Proses Selection Sort (Iterasi 1 sampai 4)
        for (int j = 0; j < x.length - 1; j++) {
            int min = x[j];
            int index = j;
            // Mencari nilai terkecil
            for (int i = j + 1; i < x.length; i++) {
                if (x[i] < min) {
                    min = x[i];
                    index = i;
                }
            }

            // Proses Tukar (Swap)
            int temp = x[j];
            x[j] = x[index];
            x[index] = temp;

            // Mencetak Hasil per Iterasi dengan format [a, b, c, d, e]
            System.out.print("Iterasi " + (j + 1) + ": [");
            for (int k = 0; k < x.length; k++) {
                // Logika: tambahkan koma kecuali untuk angka terakhir
                System.out.print(x[k] + (k == x.length - 1 ? "" : ", "));
            }
            System.out.println("]");
        }
    }
}