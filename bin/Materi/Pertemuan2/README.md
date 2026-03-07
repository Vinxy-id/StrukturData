# 🔠 Materi Pertemuan 2: Nested Loping & Pembentukan Pola (Pattern)

File Java yang ada pada direktori ini (`Pertemuan2.java`) berisikan implementasi dasar dari perulangan bersarang (**Nested Loop**) menggunakan `for` yang dipadukan dengan percabangan `if-else`. 

Fokus utama dari materi ini adalah untuk mengasah **logika berikir (Logika Algoritma)** kita dalam mencetak karakter (dalam kasus ini karakter `"x"`) pada koordinat baris (`i`) dan kolom (`j`) tertentu sehingga membentuk pola huruf atau bangun riil.

## 💡 Konsep Utama
Dalam file ini, area untuk menggambar adalah matriks berukuran `n x n` (di set sebagai matriks $5 \times 5$). 
Setiap kali loop berjalan:
- **`i`** mewakili pergerakan vertikal / baris (atas ke bawah).
- **`j`** mewakili pergerakan horizontal / kolom (kiri ke kanan).
- Percabangan **`if-else`** digunakan untuk menentukan apakah rentang koordinat `(i, j)` saat itu harus dicetak sebagai karakter `"x"` ataukah sekadar spasi `" "`.

## 🛠️ Pola yang Dibuat
Di dalam kode terdapat beberapa blok perulangan secara terpisah yang menghasilkan bentuk berbeda:

1. **Pola Persegi dengan Garis Diagonal**
   Mencetak bingkai persegi sekaligus memiliki diagonal karena menggunakan kondisi `(j==1 || j==n || i==j)`.
2. **Pola Huruf E**
   Mencetak karakter x di tepi kiri asalkan baris di atas, bawah, atau tengah bernilai memenuhi batas (`i==1 || i==n || j==1 || i==(n/2)+1`).
3. **Pola Huruf T**
   Mencetak garis horizontal di atas dan garis vertikal di tepat bagian tengahnya.
4. **Pola Huruf F**
   Sama seperti pada pencetakan huruf E, namun tidak ada garis di bagian dasar/bawah.
5. **Pola Huruf L**
   Mencetak garis vertikal lurus di sebelah kiri dan horizontal lurus di sebelah bawah.
6. **Pola Huruf I**
   Mencetak satu garis lurus tepat di kolom pertengahan `(j == (n/2)+1)`.
7. **Pola Huruf X**
   Mencetak dua garis diagonal bersilangan `(i==j || j==(n-i)+1)`.
8. **Pola Huruf Y**
   Gabungan dari garis diagonal atas yang memusat di titik tengah, lalu dilanjutkan dengan satu garis lurus ke bawah.

## 🚀 Mengapa Ini Penting?
Walaupun terlihat sekadar menggambar "*ASCII Art*", latihan seperti ini sangat manjur untuk:
- Melatih logika ruang dan sistem koordinat.
- Melatih penempatan dan penulisan blok kode `if-else-if`.
- Membiasakan diri memprediksi keluaran (output) tanpa harus selalu menjalankan (*running*) kodenya berulang-ulang.
