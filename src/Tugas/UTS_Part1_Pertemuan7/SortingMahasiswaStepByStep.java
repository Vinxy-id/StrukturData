public class SortingMahasiswaStepByStep {

    static class Mhs {
        String nim;
        String nama;
        int nilai;

        Mhs(String nim, String nama, int nilai) {
            this.nim = nim;
            this.nama = nama;
            this.nilai = nilai;
        }

        void cetak() {
            System.out.printf("%-15s %-25s %d\n", nim, nama, nilai);
        }
    }

    public static void lihatData(Mhs[] data, String keterangan, int langkahKe) {
        System.out.println("\n[" + keterangan + "] Langkah " + langkahKe);
        System.out.println("NIM             Nama                      Nilai");
        for (Mhs m : data) {
            m.cetak();
        }
    }

    public static void bubbleSortManual(Mhs[] data) {
        int n = data.length;
        int langkah = 0;
        boolean adaTukar;
        
        for (int i = 0; i < n - 1; i++) {
            adaTukar = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j].nilai < data[j + 1].nilai) {
                    // tukar posisi
                    Mhs tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                    adaTukar = true;
                    langkah++;
                    System.out.println("\n>>> Tukar index " + j + " dengan " + (j+1));
                    lihatData(data, "BUBBLE", langkah);
                }
            }
            if (!adaTukar) break;
        }
    }

    public static void insertionSortManual(Mhs[] data) {
        int n = data.length;
        int langkah = 0;
        
        for (int i = 1; i < n; i++) {
            Mhs kunci = data[i];
            int j = i - 1;
            
            while (j >= 0 && data[j].nilai < kunci.nilai) {
                data[j + 1] = data[j];
                langkah++;
                System.out.println("\n>>> Geser index " + j + " ke " + (j+1));
                lihatData(data, "INSERTION", langkah);
                j--;
            }
            
            data[j + 1] = kunci;
            langkah++;
            System.out.println("\n>>> Taruh kunci dari index " + i + " ke index " + (j+1));
            lihatData(data, "INSERTION", langkah);
        }
    }

    public static void selectionSortManual(Mhs[] data) {
        int n = data.length;
        int langkah = 0;
        
        for (int i = 0; i < n - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < n; j++) {
                if (data[j].nilai > data[idxMax].nilai) {
                    idxMax = j;
                }
            }
            
            if (idxMax != i) {
                Mhs tmp = data[idxMax];
                data[idxMax] = data[i];
                data[i] = tmp;
                langkah++;
                System.out.println("\n>>> Tukar index " + i + " dengan " + idxMax);
                lihatData(data, "SELECTION", langkah);
            }
        }
    }

    public static void main(String[] args) {
        // data mahasiswa
        Mhs[] daftarMhs = {
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

        System.out.println("=== DATA AWAL ===");
        System.out.println("NIM             Nama                      Nilai");
        for (Mhs m : daftarMhs) m.cetak();

        // bubble sort
        Mhs[] dataBubble = daftarMhs.clone();
        System.out.println("\n\n========== PROSES BUBBLE SORT ==========");
        bubbleSortManual(dataBubble);
        System.out.println("\n=== HASIL AKHIR BUBBLE SORT ===");
        System.out.println("NIM             Nama                      Nilai");
        for (Mhs m : dataBubble) m.cetak();

        // insertion sort
        Mhs[] dataInsertion = daftarMhs.clone();
        System.out.println("\n\n========== PROSES INSERTION SORT ==========");
        insertionSortManual(dataInsertion);
        System.out.println("\n=== HASIL AKHIR INSERTION SORT ===");
        System.out.println("NIM             Nama                      Nilai");
        for (Mhs m : dataInsertion) m.cetak();

        // selection sort
        Mhs[] dataSelection = daftarMhs.clone();
        System.out.println("\n\n========== PROSES SELECTION SORT ==========");
        selectionSortManual(dataSelection);
        System.out.println("\n=== HASIL AKHIR SELECTION SORT ===");
        System.out.println("NIM             Nama                      Nilai");
        for (Mhs m : dataSelection) m.cetak();
    }
}