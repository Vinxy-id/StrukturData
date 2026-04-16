public class SortingMahasiswaStepByStep {

    static class Mhs {
        String nim;
        String nama;
        int nilai;

        Mhs(String nim, String nama, int n) {
            this.nim = nim;
            this.nama = nama;
            this.nilai = n;
        }

        void cetak() {
            // Pakai print biasa dengan tab agar terlihat lebih manual
            System.out.println(nim + "\t" + nama + "\t\t" + nilai);
        }
    }

    // Ganti nama method jadi lebih santai
    public static void tampil(Mhs[] m, String ket, int step) {
        System.out.println("\n[" + ket + "] Step Ke-" + step);
        System.out.println("NIM\t\tNama\t\t\tNilai");
        for (Mhs data : m) {
            data.cetak();
        }
    }

    public static void bubbleSort(Mhs[] data) {
        int n = data.length;
        int hitung = 0;
        
        for (int i = 0; i < n - 1; i++) {
            boolean ganti = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j].nilai < data[j + 1].nilai) {
                    // proses tukar
                    Mhs temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    ganti = true;
                    hitung++;
                    System.out.println("\n>>> Swap index " + j + " dan " + (j+1));
                    tampil(data, "BUBBLE", hitung);
                }
            }
            if (!ganti) break;
        }
    }

    public static void insertionSort(Mhs[] data) {
        int n = data.length;
        int hitung = 0;
        
        for (int i = 1; i < n; i++) {
            Mhs mSekarang = data[i];
            int j = i - 1;
            
            while (j >= 0 && data[j].nilai < mSekarang.nilai) {
                data[j + 1] = data[j];
                hitung++;
                System.out.println("\n>>> Geser data ke-" + j);
                tampil(data, "INSERTION", hitung);
                j--;
            }
            
            data[j + 1] = mSekarang;
            hitung++;
            System.out.println("\n>>> Taruh data di posisi " + (j+1));
            tampil(data, "INSERTION", hitung);
        }
    }

    public static void selectionSort(Mhs[] data) {
        int n = data.length;
        int hitung = 0;
        
        for (int i = 0; i < n - 1; i++) {
            int posisiMax = i;
            for (int j = i + 1; j < n; j++) {
                if (data[j].nilai > data[posisiMax].nilai) {
                    posisiMax = j;
                }
            }
            
            if (posisiMax != i) {
                Mhs temp = data[posisiMax];
                data[posisiMax] = data[i];
                data[i] = temp;
                hitung++;
                System.out.println("\n>>> Tukar index " + i + " sama " + posisiMax);
                tampil(data, "SELECTION", hitung);
            }
        }
    }

    public static void main(String[] args) {
        Mhs[] list = {
            new Mhs("20241001", "Andi Pratama", 95),
            new Mhs("20241002", "Sana Devi Lestari", 92),
            new Mhs("20241003", "Budi Santoso", 78),
            new Mhs("20241004", "Zina Ayu Puri", 85),
            new Mhs("20241005", "Dwi Wiyono", 65),
            new Mhs("20241006", "Maya Seri", 72),
            new Mhs("20241007", "Dimas Prakosa", 81),
            new Mhs("20241008", "Nadia Safira", 90),
            new Mhs("20241009", "Rizky Aditya", 76)
        };

        System.out.println("=== DATA SEBELUM SORT ===");
        System.out.println("NIM\t\tNama\t\t\tNilai");
        for (Mhs m : list) m.cetak();

        // Tes Bubble
        Mhs[] d1 = list.clone();
        System.out.println("\n\n*** MULAI BUBBLE SORT ***");
        bubbleSort(d1);
        System.out.println("\n--- HASIL AKHIR BUBBLE ---");
        for (Mhs m : d1) m.cetak();

        // Tes Insertion
        Mhs[] d2 = list.clone();
        System.out.println("\n\n*** MULAI INSERTION SORT ***");
        insertionSort(d2);
        System.out.println("\n--- HASIL AKHIR INSERTION ---");
        for (Mhs m : d2) m.cetak();

        // Tes Selection
        Mhs[] d3 = list.clone();
        System.out.println("\n\n*** MULAI SELECTION SORT ***");
        selectionSort(d3);
        System.out.println("\n--- HASIL AKHIR SELECTION ---");
        for (Mhs m : d3) m.cetak();
    }
}