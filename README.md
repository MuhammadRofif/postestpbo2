# Sistem Pengelolaan Tugas Harian

Program ini adalah program sederhana berbasis Java yang digunakan untuk mengelola tugas harian. Dengan program ini, pengguna dapat menambahkan tugas, melihat daftar tugas yang telah dibuat, memperbarui tugas, dan menghapus tugas berdasarkan ID.

## Fitur

- **Tambah Tugas**: Pengguna dapat menambahkan tugas baru dengan informasi seperti nama, deskripsi, prioritas tugas, serta jenis tugas (akademik atau rumah).
- **Lihat Tugas**: Menampilkan semua tugas yang telah ditambahkan, dengan informasi ID, nama, deskripsi, prioritas, dan jenis tugas.
- **Update Tugas**: Pengguna dapat memperbarui tugas dengan informasi seperti nama, deskripsi, dan prioritas tugas.
- **Hapus Tugas**: Menghapus tugas berdasarkan ID yang dimasukkan oleh pengguna.
- **Pesan Keluar**: Menampilkan pesan keluar saat program dihentikan.

## Struktur Program

Program ini terdiri dari class yang diletakkan di dua package berbeda:

```
src/
 └── com/
     └── pbo/
         └── sistem_pengelolaan_tugas_harian/
             └── Crud.java
             └── Main.java
             └── Tugas.java
             └── TugasAkademik.java
             └── TugasRumah.java
 └── utils/
     └── Pembantu.java
```

- **com.pbo.sistem_pengelolaan_tugas_harian**: Berisi class `Main`, `Tugas`, `TugasAkademik`, `TugasRumah`, dan `Crud` sebagai komponen utama sistem.
- **utils**: Berisi class `Pembantu` untuk mencetak informasi sistem dan menampilkan pesan keluar.

## Cara Penggunaan

   **Tampilan Menu Utama**
   
![image](https://github.com/user-attachments/assets/64b7fe7a-765d-442c-a512-2c6addb58e1d)


1. **Menambah Tugas**
   Pilih opsi **1. Tambah Tugas Akademik atau 2. Tugas Kelompok** untuk menambahkan tugas baru. Pengguna akan diminta memasukkan nama tugas, deskripsi, prioritas tugas (1-5), dan jenis tugas.

   - Prioritas 1: Paling tidak mendesak.
   - Prioritas 2: Lebih penting, tapi masih bisa ditunda.
   - Prioritas 3: Kepentingan menengah, perlu dikerjakan dalam waktu dekat.
   - Prioritas 4: Cukup mendesak, sebaiknya segera diselesaikan.
   - Prioritas 5: Paling mendesak, harus diutamakan.
     
   ![image](https://github.com/user-attachments/assets/75caf4b7-1c9f-4abc-bab5-b48ddc2814fe)

2. **Melihat Tugas**:
   
   Pilih opsi **3. Lihat Tugas** untuk melihat daftar tugas yang telah ditambahkan. Setiap tugas akan ditampilkan dengan informasi ID, nama, deskripsi, prioritas, dan mata pelajaran (untuk tugas akademik) dan lokasi (untuk tugas kelompok).

   ![image](https://github.com/user-attachments/assets/63f1ba2a-3185-4fdd-b63d-5e5a8953688f)

3. **Memperbarui Tugas**
   Pilih opsi **4. Update Tugas** untuk memperbarui tugas. Daftar tugas akan ditampilkan terlebih dahulu, lalu pengguna akan diminta memasukkan ID yang mau diganti. Setelah itu, pengguna diminta memasukkan nama tugas baru, deskripsi, prioritas tugas (1-5) dan ditanya apakah tugas akademik atau kelompok.

   ![image](https://github.com/user-attachments/assets/586849c9-9721-4cd7-a604-6a477fd0c414)

   Hasil

   ![image](https://github.com/user-attachments/assets/cb7b8278-ae39-49a2-a1ae-7677ffa25052)
   
4. **Menghapus Tugas**:
   
   Pilih opsi **5. Hapus Tugas** untuk menghapus tugas berdasarkan ID. Daftar tugas akan ditampilkan terlebih dahulu, lalu pengguna akan diminta memasukkan ID tugas yang ingin dihapus.

   ![image](https://github.com/user-attachments/assets/8a9dfec0-9920-48c6-b9e9-c84eac49505a)

   Hasil
   ![image](https://github.com/user-attachments/assets/455ebd5b-7205-49f5-82ec-62fd94981d41)
   
5. **Keluar dari Program**:
   
   Pilih opsi **6. Keluar** untuk menutup program. Program akan menampilkan pesan "Terima kasih telah menggunakan sistem".

   ![image](https://github.com/user-attachments/assets/7e8b5aa5-c5a1-4740-9d6b-5f10536ba563)


## Class dan Fungsionalitas

### A. `Main.java`

Class utama untuk menjalankan program. Fungsinya adalah mengelola interaksi pengguna melalui menu untuk menambah, melihat, memperbarui, dan menghapus tugas. Berikut adalah fitur yang ada di dalam class ini:

- Menggunakan **percabangan** (`switch-case`) untuk navigasi menu.

  ![image](https://github.com/user-attachments/assets/6b5741d9-2358-4ec5-8b0e-29acc15d7d3f)

- Menggunakan **ArrayList**, yang dikombinasikan dengan perulangan (for-each).
  
  ![image](https://github.com/user-attachments/assets/70a3f551-a0ed-4bde-80e2-50daada48c1b)

- Mengelola input pengguna melalui `Scanner`.

  ![image](https://github.com/user-attachments/assets/045bed0a-876e-4a0d-ab20-da835bd2229d)

- Mengimplementasikan **CRUD** menggunakan interface `Crud` untuk pengelolaan tugas.

  ![image](https://github.com/user-attachments/assets/93367800-2e41-44ea-b8e5-9482dd5b2ed3)

- Menggunakan Enkapsulasi di Class Tugas, Tugas Akademik, Tugas Kelompok, dan Kelas Pembantu

  ![image](https://github.com/user-attachments/assets/d053e8be-d393-49ff-a657-8f98702ee976)

### B. `Tugas.java` (Abstrak dan Final)

Class yang mendefinisikan objek `Tugas`. Properti dari class ini meliputi:

- `id`: Sebagai identifier unik setiap tugas (final).
- `nama`: Nama tugas.
- `deskripsi`: Deskripsi tugas.
- `prioritas`: Prioritas tugas dalam rentang 1-5.

Class ini menggunakan **constructor** untuk menginisialisasi objek baru dan memiliki metode `getInfo()` yang digunakan untuk mengembalikan informasi tugas dalam format string. Class ini juga merupakan kelas abstrak yang diwarisi oleh kelas `TugasAkademik` dan `TugasRumah`.

### C. `TugasAkademik.java`

Subclass dari `Tugas`, berfungsi untuk mendefinisikan tugas akademik. Menambahkan atribut tambahan `mataPelajaran` serta mengoverride method `getInfo()` untuk menampilkan informasi lengkap tugas akademik.

### D. `TugasRumah.java`

Subclass dari `Tugas`, berfungsi untuk mendefinisikan tugas rumah. Menambahkan atribut tambahan `lokasi` serta mengoverride method `getInfo()` untuk menampilkan informasi lengkap tugas rumah.

### E. `Pembantu.java`

Class `Pembantu` berfungsi sebagai utilitas yang menyediakan fitur mencetak judul sistem dan menampilkan pesan keluar saat program berhenti. Fitur ini termasuk:

- **Constructor** untuk menginisialisasi informasi sistem seperti judul, versi, dan pengembang.
- Metode `cetakJudul()` untuk menampilkan judul sistem.
- Metode statis `tampilkanPesanKeluar()` untuk menampilkan pesan keluar.

## Pengembang

Program ini dikembangkan oleh:
- **Muhammad Rofiif Taqiyyuddin Nabiil Sistem Informasi A 2023 (2309116029)**

---
