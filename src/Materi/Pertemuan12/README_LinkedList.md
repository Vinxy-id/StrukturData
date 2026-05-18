# 🔗 Materi Pertemuan 12: Struktur Data LinkedList

Struktur data **LinkedList** adalah struktur data *linear* di mana elemen-elemennya tidak disimpan dalam alokasi memori yang berurutan. Setiap elemen (atau *node*) terdiri dari bagian data dan bagian referensi (atau *pointer*) yang menunjuk ke *node* selanjutnya dalam list.

## 💡 Konsep Utama dan Operasi (Java Built-in)
Pada materi ini kita memanfaatkan **Java Collections Framework** yakni menggunakan class bawaan `java.util.LinkedList`. 

Operasi dasar yang dipraktikkan dalam kode antara lain:
- **`add(element)`**: Menambahkan elemen baru ke akhir list.
- **`add(index, element)`**: Menyisipkan elemen baru pada indeks tertentu tanpa menimpa/menghapus data lain (data setelahnya akan otomatis bergeser).
- **`remove(index)`**: Menghapus elemen yang berada di indeks tertentu.

## 🚀 Implementasi di Kode
Buka dan jalankan file `Linkedlist.java`. Pada contoh ini:
- Mendeklarasikan sebuah `LinkedList` yang menampung tipe data `Integer`.
- Menambahkan angka `5, 6, 9, 7`.
- Menyisipkan angka `4` pada indeks ke-1 (`list.add(1, 4)`).
- Menghapus elemen pada indeks ke-3 (`list.remove(3)`).
- Kemudian mencetak hasilnya menggunakan `System.out.println(list)`.
