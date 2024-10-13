# Sistem Pengelolaan Tugas Harian

Program ini adalah program sederhana berbasis Java yang digunakan untuk mengelola tugas harian. Dengan program ini, pengguna dapat menambahkan tugas, melihat daftar tugas yang telah dibuat, serta menghapus tugas berdasarkan ID.

## Fitur

- **Tambah Tugas**: Pengguna dapat menambahkan tugas baru dengan informasi seperti nama, deskripsi, dan prioritas tugas.
- **Lihat Tugas**: Menampilkan semua tugas yang telah ditambahkan, dengan informasi ID, nama, deskripsi, dan prioritas.
- **Update Tugas**: Pengguna dapat memperbarui tugas dengan informasi seperti nama, deskripsi, dan prioritas tugas.
- **Hapus Tugas**: Menghapus tugas berdasarkan ID yang dimasukkan oleh pengguna.
- **Pesan Keluar**: Menampilkan pesan keluar saat program dihentikan.

## Struktur Program

Program ini terdiri dari tiga class yang diletakkan di dua package berbeda:

```
src/
 └── com/
     └── pbo/
         └── sistem_pengelolaan_tugas_harian/
             └── Main.java
             └── Tugas.java
 └── utils/
     └── Pembantu.java
```

- **com.pbo.sistem_pengelolaan_tugas_harian**: Berisi class `Main` dan `Tugas` sebagai komponen utama sistem.
- **utils**: Berisi class `Pembantu` untuk mencetak informasi sistem dan menampilkan pesan keluar.

## Cara Penggunaan

   **Tampilan Menu Utama**
   
![image](https://github.com/user-attachments/assets/961c3ceb-9655-4b4e-a646-87241f1e5819)

1. **Menambah Tugas**
   Pilih opsi **1. Tambah Tugas** untuk menambahkan tugas baru. Pengguna akan diminta memasukkan nama tugas, deskripsi, dan prioritas tugas (1-5).

   - Prioritas 1: Paling tidak mendesak.
   - Prioritas 2: Lebih penting, tapi masih bisa ditunda.
   - Prioritas 3: Kepentingan menengah, perlu dikerjakan dalam waktu dekat.
   - Prioritas 4: Cukup mendesak, sebaiknya segera diselesaikan.
   - Prioritas 5: Paling mendesak, harus diutamakan.
     
   ![image](https://github.com/user-attachments/assets/0166959c-a958-4282-8950-35e683c40230)

   
2. **Melihat Tugas**:
   
   Pilih opsi **2. Lihat Tugas** untuk melihat daftar tugas yang telah ditambahkan. Setiap tugas akan ditampilkan dengan informasi ID, nama, deskripsi, dan prioritas.

   ![image](https://github.com/user-attachments/assets/668afd82-75a5-4e06-b94d-99cde6f41bba)

   
3. **Memperbarui Tugas**
   Pilih opsi **3. Update Tugas** untuk memperbarui tugas, daftar tugas akan ditampilkan terlebih dahulu, lalu Pengguna akan diminta memasukan id yang mau diganti, setelah itu pengguna 
   diminta memasukkan nama tugas baru, deskripsi, dan prioritas tugas (1-5).

   ![image](https://github.com/user-attachments/assets/d5c319be-3210-47ad-8aa9-27b666f72273)

   
4. **Menghapus Tugas**:
   
   Pilih opsi **4. Hapus Tugas** untuk menghapus tugas berdasarkan ID. Daftar tugas akan ditampilkan terlebih dahulu, lalu Pengguna akan diminta memasukkan ID tugas yang ingin dihapus.

   ![image](https://github.com/user-attachments/assets/2df44da8-975c-4a7e-821c-9240d24b78de)

   
5. **Keluar dari Program**:
   
   Pilih opsi **5. Keluar** untuk menutup program. Program akan menampilkan pesan "Terima kasih telah menggunakan sistem".

   ![image](https://github.com/user-attachments/assets/8344f009-644a-4e40-96f5-e56c986edc91)



## Class dan Fungsionalitas

### A. `Main.java`

Class utama untuk menjalankan program. Fungsinya adalah mengelola interaksi pengguna melalui menu untuk menambah, melihat, dan menghapus tugas. Berikut adalah fitur yang ada di dalam class ini:

- Menggunakan **percabangan** (`switch-case`) untuk navigasi menu.

  ![image](https://github.com/user-attachments/assets/6b5741d9-2358-4ec5-8b0e-29acc15d7d3f)

- Menggunakan **ArrayList**, yang di kombinasikan dengan Perulangan (for-each)
  
  ![image](https://github.com/user-attachments/assets/70a3f551-a0ed-4bde-80e2-50daada48c1b)

- Mengelola input pengguna melalui `scanner`.

  ![image](https://github.com/user-attachments/assets/045bed0a-876e-4a0d-ab20-da835bd2229d)


### B. `Tugas.java`

Class yang mendefinisikan objek `Tugas`. Properti dari class ini meliputi:

- `id`: Sebagai identifier unik setiap tugas.
- `nama`: Nama tugas.
- `deskripsi`: Deskripsi tugas.
- `prioritas`: Prioritas tugas dalam rentang 1-5.

Class ini menggunakan **constructor** untuk menginisialisasi objek baru dan memiliki metode `getInfo()` yang mengembalikan informasi tugas dalam format string.

### C. `Pembantu.java`

Class `Pembantu` berfungsi sebagai utilitas yang menyediakan fitur mencetak judul sistem dan menampilkan pesan keluar saat program berhenti. Fitur ini termasuk:

- **Constructor** untuk menginisialisasi informasi sistem seperti judul, versi, dan pengembang.
- Metode `cetakJudul()` untuk menampilkan judul sistem.
- Metode statis `tampilkanPesanKeluar()` untuk menampilkan pesan keluar.

## Pengembang

Program ini dikembangkan oleh:
- **Muhammad Rofiif Taqiyyuddin Nabiil Sistem Informasi A 2023(2309116029)**


