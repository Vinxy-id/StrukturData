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

public class SortingMahasiswaStepByStep2 {

    // Utility: cetak seluruh array dengan pesan
    public static void printStep(Mahasiswa[] arr, String pesan, int stepKe) {
        System.out.println("\n[" + pesan + "] Langkah " + stepKe);
        System.out.println("NIM             Nama                      Nilai");
        for (Mahasiswa m : arr) {
            m.tampil();
        }
    }

    // Bubble Sort dengan step & info indeks swap
    public static void bubbleSortStep(Mahasiswa[] arr) {
        int n = arr.length;
        int step = 0;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].nilai < arr[j + 1].nilai) { // descending
                    // swap indeks j dan j+1
                    Mahasiswa temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    step++;
                    String pesan = "BUBBLE SORT - menukar indeks " + j + " dan " + (j+1);
                    printStep(arr, pesan, step);
                }
            }
            if (!swapped) break;
        }
    }

    // Insertion Sort dengan step & info pergeseran/penempatan
    public static void insertionSortStep(Mahasiswa[] arr) {
        int n = arr.length;
        int step = 0;
        for (int i = 1; i < n; i++) {
            Mahasiswa key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].nilai < key.nilai) {
                // geser elemen dari indeks j ke j+1
                arr[j + 1] = arr[j];
                step++;
                String pesan = "INSERTION SORT - menggeser indeks " + j + " ke indeks " + (j+1);
                printStep(arr, pesan, step);
                j = j - 1;
            }
            arr[j + 1] = key;
            step++;
            String pesan = "INSERTION SORT - menempatkan key (dari indeks " + i + ") ke indeks " + (j+1);
            printStep(arr, pesan, step);
        }
    }

    // Selection Sort dengan step & info swap indeks
    public static void selectionSortStep(Mahasiswa[] arr) {
        int n = arr.length;
        int step = 0;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].nilai > arr[maxIdx].nilai) {
                    maxIdx = j;
                }
            }
            if (maxIdx != i) {
                // swap indeks i dan maxIdx
                Mahasiswa temp = arr[maxIdx];
                arr[maxIdx] = arr[i];
                arr[i] = temp;
                step++;
                String pesan = "SELECTION SORT - menukar indeks " + i + " (nilai maks sementara) dengan indeks " + maxIdx + " (nilai maks sebenarnya)";
                printStep(arr, pesan, step);
            }
        }
    }

    public static void main(String[] args) {
        // Data awal
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

        // ========= BUBBLE SORT =========
        Mahasiswa[] dataBubble = data.clone();
        System.out.println("\n\n========== PROSES BUBBLE SORT ==========");
        bubbleSortStep(dataBubble);
        System.out.println("\n=== HASIL AKHIR BUBBLE SORT ===");
        System.out.println("NIM             Nama                      Nilai");
        for (Mahasiswa m : dataBubble) m.tampil();

        // ========= INSERTION SORT =========
        Mahasiswa[] dataInsertion = data.clone();
        System.out.println("\n\n========== PROSES INSERTION SORT ==========");
        insertionSortStep(dataInsertion);
        System.out.println("\n=== HASIL AKHIR INSERTION SORT ===");
        System.out.println("NIM             Nama                      Nilai");
        for (Mahasiswa m : dataInsertion) m.tampil();

        // ========= SELECTION SORT =========
        Mahasiswa[] dataSelection = data.clone();
        System.out.println("\n\n========== PROSES SELECTION SORT ==========");
        selectionSortStep(dataSelection);
        System.out.println("\n=== HASIL AKHIR SELECTION SORT ===");
        System.out.println("NIM             Nama                      Nilai");
        for (Mahasiswa m : dataSelection) m.tampil();
    }
}