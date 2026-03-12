# 🫧 Materi Pertemuan 5: Algoritma Pengurutan - Bubble Sort

Pertemuan ini berfokus pada salah satu teknik dasar manipulasi data yaitu **Sorting (Pengurutan)** menggunakan metode **Bubble Sort**. 

Metode ini merupakan langkah awal yang krusial sebelum mempelajari algoritma pengurutan yang lebih kompleks seperti Quick Sort atau Merge Sort.

---

## 💡 Konsep Dasar Bubble Sort
Bubble Sort bekerja dengan prinsip membandingkan dua data yang **berdekatan** secara terus-menerus. Jika data sebelah kiri lebih besar dari data sebelah kanan, maka dilakukan **Swap (Pertukaran)**.

Proses ini terus dilakukan hingga data yang paling besar "menggelembung" (seperti balon di dalam air) menuju ke posisi paling ujung kanan (indeks terakhir).

## 🔍 Membedah Kode `BubbleSort.java`

Dataset yang digunakan: `{9, 8, 7, 5, 4}`

### 1. Loop Bertingkat (*Nested Loop*)
Program ini menggunakan dua lapis perulangan:
- **Outer Loop (`a`)**: Menentukan jumlah iterasi total. Setiap satu iterasi penuh, satu angka terbesar dipastikan sudah berada di posisi yang benar.
- **Inner Loop (`b`)**: Melakukan perbandingan tetangga (`x[b]` vs `x[b+1]`) dan melakukan aksi pertukaran jika diperlukan.

### 2. Mekanisme Pertukaran (*The Swapping*)
```java
if(x[b] > x[b+1]){
    int temp = x[b];    // Backup nilai yang lebih besar
    x[b] = x[b+1];      // Pindahkan yang lebih kecil ke kiri
    x[b+1] = temp;      // Masukkan nilai backup ke kanan
}
```
Sama seperti materi Pertemuan 3, kita membutuhkan variabel `temp` agar nilai tidak hilang saat proses pemindahan di memori.

### 3. Visualisasi Proses
Kode ini dirancang untuk mencetak isi array setiap kali terjadi perbandingan. Ini membantu kita melihat:
- Bagaimana angka `9` perlahan bergeser ke kanan pada Iterasi 0.
- Bagaimana angka `4` perlahan bergeser ke kiri hingga data terurut sempurna.

---

## 🚀 Cara Menjalankan Program

Gunakan terminal atau perintah Powershell berikut:

```powershell
# Kompilasi
javac src/Materi/Pertemuan5/BubbleSort.java

# Jalankan
java Materi.Pertemuan5.BubbleSort
```

## 📝 Catatan Penting
- **Efisiensi**: Bubble Sort memiliki kompleksitas waktu **O(n²)**, yang berarti jika data berjumlah 10, maka maksimal ada 100 operasi perbandingan. Ini cukup lambat untuk data skala besar, namun sangat bagus untuk pembelajaran logika sorting dasar.
- **Optimasi**: Pada kode ini, batas inner loop menggunakan `x.length - 1 - a`. Pengurangan `- a` bertujuan agar sistem tidak mengecek ulang posisi yang sudah pasti benar di akhir array, sehingga program berjalan sedikit lebih efisien.
