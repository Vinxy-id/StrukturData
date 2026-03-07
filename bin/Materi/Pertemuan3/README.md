# 🔄 Materi Pertemuan 3: Array, Kondisi Logika & Pertukaran Nilai (Swap)

File `Pertemuan3.java` pada direktori ini berisi contoh fundamental pengenalan struktur data **Array** di Java, dibarengi dengan praktik cara melakukan pertukaran nilai (*Swap*) antar posisi/indeks dalam memori.

Memahami cara kerja mekanisme memori saat menukar nilai ini sangat penting karena operasi dasar inilah yang menjadi urat nadi/fondasi berbagai logika pengurutan dan pencarian data ke depannya (*Sorting & Searching Algorithms*).

---

## 💡 Membedah Konsep di dalam Kode

### 1. Inisialisasi Deretan Data (Array)
```java
int[] x = {20, 15, 90, 13, 26};
```
Program menyiapkan sebuah **Array 1-Dimensi** yang menampung sekumpulan 5 angka bilangan bulat (`integer`). Array bekerja seperti lemari loker berjejer; dalam kasus ini indeks kotaknya bermula dari loker `[0]` sampai dengan ukuran loker terakhir yakni `[4]`.

### 2. Algoritma Pertukaran (*Swapping Mechanism*)
Inti dari kode ini terletak pada proses menukar posisi **Nilai Ujung ke Ujung** (Elemen Pertama di indeks `0` ditukar dengan Elemen Terakhir di indeks `4`). 
```java
int a = 0;   // Menyiapkan variabel kosong.
a = x[0];    // Tahap 1: Mem-backup nilai "20"
x[0] = x[4]; // Tahap 2: Menimpa posisi pertama dengan nilai "26" 
x[4] = a;    // Tahap 3: Memasukkan nilai "20" dari backup ke posisi terakhir
```
**Mengapa butuh variabel tambahan `a`?**
Dalam pemrograman komputer murni, kita tidak bisa langsung menukar nilai secara ajaib berbarengan. Jika kita tidak mem-*backup* nilai pertama ke suatu "Wadah Penampung Sementara" (yakni variabel `a`), maka nilai asli dari indeks pertama akan langsung **lenyap tertimpa** oleh nilai lain sebelum sempat dipindahkan.


### 3. Mencetak Isi Array Baru
Setelah sukses menukar titik awal dan akhirnya, array yang awalnya `{20, 15, 90, 13, 26}` kini murni berubah menjadi `{26, 15, 90, 13, 20}`.

Untuk membuktikannya ke layar (*print*), program menggunakan instruksi perulangan (`loop`):
```java
for(int i = 0; i < x.length; i++){
    System.out.println(x[i]);
}
```
**💡 Note / Catatan (*Bug Trap*):** 
Poin penting pada logika operator relasional dalam `for-loop` adalah perbandingan batas berhentinya. Jangan sampai terbalik antara simbol `<` (*kurang dari*) dan `>` (*lebih dari*). 
*(Contoh nyata pada draf awal kode ini menuliskan `i > x.length` di mana program tidak akan mencetak error, melainkan outputnya dibiarkan kosong karena pertanyaannya 'Apakah 0 lebih besar dari 5?', di mana logikanya langsung salah seketika alias `False`, sehingga tidak pernah mulai melakukan printing).*

---

Dengan fondasi pemahaman tentang **Cara Membaca Index Array**, **Pertukaran Nilai (Swap)**, serta **Logika Perbandingan Syarat Perulangan** ini, kita sudah sangat siap melanjutkannya dengan implementasi algoritma yang lebih kompleks di Tugas 1!
