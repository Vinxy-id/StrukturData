package Materi.Pertemuan6.DraftUTS;

class Mahasiswa {
    String nim;
    String nama;
    int nilai;

    public Mahasiswa(String nim, String nama, int nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
    }

    public void tampil() {
        System.out.printf("%-15s %-25s %d\n", nim, nama, nilai);
    }
}

public class SortingMahasiswa {

    // Bubble Sort berdasarkan Nilai (descending)
    public static void bubbleSort(Mahasiswa[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].nilai < arr[j + 1].nilai) {
                    Mahasiswa temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Insertion Sort berdasarkan Nilai (descending)
    public static void insertionSort(Mahasiswa[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            Mahasiswa key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].nilai < key.nilai) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Selection Sort berdasarkan Nilai (descending)
    public static void selectionSort(Mahasiswa[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].nilai > arr[maxIdx].nilai) {
                    maxIdx = j;
                }
            }
            Mahasiswa temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        // Data mahasiswa (NIM dibuat fiktif)
        Mahasiswa[] data = {
            new Mahasiswa("20241001", "Andi Pratama", 95),
            new Mahasiswa("20241002", "Sana Devi Lestari", 92),
            new Mahasiswa("20241003", "Budi Santoso", 78),
            new Mahasiswa("20241004", "Zina Ayu Puri", 85),
            new Mahasiswa("20241005", "Dwi Wiyono", 65),
            new Mahasiswa("20241006", "Maya Seri", 72),
            new Mahasiswa("20241007", "Dimas Prakosa", 81),
            new Mahasiswa("20241008", "Nadia Safira", 90),
            new Mahasiswa("20241009", "Rizky Aditya", 76)
        };

        System.out.println("=== DATA AWAL ===");
        System.out.println("NIM             Nama                      Nilai");
        for (Mahasiswa m : data) m.tampil();

        // Copy data untuk setiap sorting method
        Mahasiswa[] dataBubble = data.clone();
        Mahasiswa[] dataInsertion = data.clone();
        Mahasiswa[] dataSelection = data.clone();

        // Bubble Sort
        bubbleSort(dataBubble);
        System.out.println("\n=== SETELAH BUBBLE SORT (Nilai Tertinggi ke Terendah) ===");
        System.out.println("NIM             Nama                      Nilai");
        for (Mahasiswa m : dataBubble) m.tampil();

        // Insertion Sort
        insertionSort(dataInsertion);
        System.out.println("\n=== SETELAH INSERTION SORT (Nilai Tertinggi ke Terendah) ===");
        System.out.println("NIM             Nama                      Nilai");
        for (Mahasiswa m : dataInsertion) m.tampil();

        // Selection Sort
        selectionSort(dataSelection);
        System.out.println("\n=== SETELAH SELECTION SORT (Nilai Tertinggi ke Terendah) ===");
        System.out.println("NIM             Nama                      Nilai");
        for (Mahasiswa m : dataSelection) m.tampil();
    }
}