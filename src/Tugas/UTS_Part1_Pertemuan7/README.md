# Tugas UTS Part 1 - Struktur Data (Sorting Mahasiswa)

## 👤 Identitas
- **Nama:** Alvin Widiantara
- **NIM:** 25161562037
- **Kelas:** INF2A

![Foto Profil](profil.png)

---

Repository ini berisi codingan Java untuk mengimplementasikan algoritma sorting (pengurutan) pada data mahasiswa berdasarkan nilai mereka secara descending (dari tinggi ke rendah).

## Deskripsi Codingan
Program ini menggunakan tiga jenis algoritma sorting utama:
1. **Bubble Sort**: Membandingkan data tetangga dan menukarnya jika urutannya salah.
2. **Insertion Sort**: Mengambil data satu per satu dan menempatkannya di posisi yang pas sembari menggeser data lain.
3. **Selection Sort**: Mencari nilai paling besar di sisa data dan menukarnya ke posisi depan.

Program ini dibuat dengan fitur **Step-by-Step**, jadi kita bisa lihat setiap pergeseran atau penukaran data (swap/geser/letakkan kunci) langsung di terminal. Untuk mengetahui alur jalannya algoritma secara visual.

## Struktur Program
Kode ini disusun secara modular agar gampang dibaca:
1. **Atribut Data (Class Mhs)**: Objek utama untuk menampung data mahasiswa. Di dalamnya ada method `cetak()` yang mengatur tampilan baris per baris lengkap dengan padding spasi.
2. **Method Sorting**: Terdapat 3 method terpisah (`bubbleSort`, `insertionSort`, `selectionSort`). Setiap method menerima parameter array of object `Mhs`.
3. **Helper Method (tampil)**: Method pendukung untuk mencetak judul langkah dan tabel data. Ini supaya kode di dalam loop sorting tidak berantakan.
4. **Main Method**: 
   - Inisialisasi data awal mahasiswa.
   - Proses `clone()` array agar setiap uji coba sorting datanya kembali ke kondisi awal (tidak terurut).
   - Memanggil setiap method sorting secara berurutan untuk ditampilkan prosesnya.

---
*Dibuat untuk memenuhi tugas mata kuliah Struktur Data Semester 2.*
