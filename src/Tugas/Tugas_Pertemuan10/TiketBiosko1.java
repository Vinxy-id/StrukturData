package Tugas.Tugas_Pertemuan10;
public class TiketBiosko1 { // Ubah nama class ini menjadi NIM_Nama_Stack

    //=== BAGIAN 1: Deklarasi Stack ===
    static String[] stack = new String[10]; // Implementasi manual menggunakan array
    static int top = -1; // Variabel top untuk melacak elemen teratas

    //=== BAGIAN 2: Operasi Stack ===
    
    // TODO: Lengkapi method push()
    static void push(String tiket) {
        // Cek kondisi stack penuh (overflow) sebelum push
        if (top >= stack.length - 1) {
            System.out.println("Stack penuh!");
        } else {
            top++; // Pindahkan pointer top ke atas
            stack[top] = tiket; // Masukkan data tiket
        }
    }

    // TODO: Lengkapi method pop()
    static String pop() {
        // Cek kondisi stack kosong (underflow) sebelum pop
        if (isEmpty()) {
            return "Stack kosong!";
        } else {
            String tiket = stack[top]; // Ambil elemen teratas
            top--; // Turunkan pointer top (menghapus elemen secara logis)
            return tiket;
        }
    }

    // TODO: Lengkapi method peek()
    static String peek() {
        // Kembalikan elemen teratas TANPA menghapusnya
        if (isEmpty()) {
            return "Stack kosong";
        } else {
            return stack[top];
        }
    }

    static boolean isEmpty() {
        return top == -1;
    }

    static void tampilkanStack() {
        System.out.println("=== Isi Stack (TOP -> BOTTOM) ===");
        for (int i = top; i >= 0; i--) {
            System.out.println("| " + stack[i] + " |");
        }
        System.out.println("=================================");
    }

    // TODO: Tugas Bonus (20 Poin) - Method hitungTotal()
    static void hitungTotal() {
        int total = 0;
        for (int i = 0; i <= top; i++) {
            String tiket = stack[i];
            // Mencari posisi substring "Rp" untuk mengekstrak harga
            int indexRp = tiket.lastIndexOf("Rp");
            if (indexRp != -1) {
                // Ambil string setelah "Rp", hilangkan titik, lalu parse ke Integer
                String hargaStr = tiket.substring(indexRp + 2).replace(".", "");
                try {
                    total += Integer.parseInt(hargaStr);
                } catch (NumberFormatException e) {
                    // Abaikan jika data tidak valid
                }
            }
        }
        // Format angka menggunakan titik sebagai pemisah ribuan
        System.out.println("Total transaksi: Rp" + String.format("%,d", total).replace(',', '.'));
    }

    //=== BAGIAN 3: Main Program ===
    public static void main(String[] args) {
        // TODO: push 3 transaksi berikut ke dalam stack:
        push("Tiket-A01: Avengers Rp50.000");
        push("Tiket-B02: Interstellar Rp45.000");
        push("Tiket-C03: Inception Rp45.000");

        // Panggil method bonus di dalam main() setelah semua push selesai
        hitungTotal();

        tampilkanStack();

        // TODO: tampilkan tiket paling atas (peek)
        System.out.println("Tiket terakhir masuk: " + peek());

        // TODO: batalkan 1 transaksi teratas (pop) dan tampilkan
        System.out.println("Tiket dibatalkan: " + pop());

        tampilkanStack();
    }
}