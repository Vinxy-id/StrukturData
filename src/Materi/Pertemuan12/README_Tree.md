# 🌳 Materi Pertemuan 12: Struktur Data Tree (Pohon)

Struktur data **Tree** (Pohon) adalah struktur data *non-linear* yang berbentuk hierarki. Struktur ini terdiri dari sekumpulan simpul (node) di mana setiap simpul menyimpan nilai (data) dan referensi (pointer) ke simpul-simpul di bawahnya (child nodes).

## 💡 Konsep Utama
- **Root**: Simpul paling atas dari sebuah tree (tidak memiliki parent).
- **Node**: Elemen yang menyimpan data dan referensi ke anak-anaknya.
- **Leaf**: Simpul yang tidak memiliki anak (berada di ujung/posisi paling bawah).
- **Parent & Child**: Simpul yang memiliki anak disebut *parent*, dan simpul di bawahnya disebut *child*.
- **Binary Tree**: Jenis tree khusus di mana setiap simpul maksimal hanya memiliki dua anak (*left child* dan *right child*).
- **Binary Search Tree (BST)**: Binary tree dengan aturan tambahan, di mana nilai *left child* selalu lebih kecil dari *parent*, dan nilai *right child* selalu lebih besar dari *parent*.

## 🛠️ Operasi Dasar pada Tree
1. **Insert**: Menambahkan node baru ke dalam tree.
2. **Traversal (Kunjungan)**: Proses menelusuri setiap node pada tree tepat satu kali untuk keperluan mencetak atau mencari data. Terdapat tiga metode umum:
   - **Inorder** *(Left, Root, Right)*: Menghasilkan data yang terurut dari kecil ke besar pada BST.
   - **Preorder** *(Root, Left, Right)*: Berguna ketika kita ingin membuat salinan tree.
   - **Postorder** *(Left, Right, Root)*: Berguna saat kita perlu menghapus tree secara menyeluruh dari leaf-nya terlebih dahulu.

## 🚀 Implementasi di Kode
File `tree.java` di direktori ini memberikan contoh implementasi **Binary Search Tree (BST)** secara dinamis menggunakan *Object/Class* (`Node`).

Di dalam file tersebut, Anda bisa melihat bagaimana algoritma *recursive function* (fungsi yang memanggil dirinya sendiri) sangat mendominasi operasi pada struktur data tree. Mulai dari menelusuri *branch* (cabang) untuk meletakkan data baru (`insert`), maupun mencetak data melalui proses traversal.

---
> **Tips Latihan:** Cobalah untuk menambahkan fungsi operasi *Searching* pada `tree.java` untuk mengecek apakah sebuah angka tertentu terdapat di dalam tree tersebut atau tidak.