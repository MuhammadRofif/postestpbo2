package com.pbo.sistem_pengelolaan_tugas_harian;

import java.util.ArrayList;
import java.util.Scanner;
import utils.Pembantu;

public class Main implements Crud {
    private ArrayList<Tugas> daftarTugas = new ArrayList<>();

    public static void main(String[] args) {
        Main mainApp = new Main();
        mainApp.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        Pembantu pembantu = new Pembantu("Sistem Pengelolaan Tugas Harian", "v1.0", "Rofif 2309116029");

        do {
            pembantu.cetakJudul();
            System.out.println("1. Tambah Tugas Akademik");
            System.out.println("2. Tambah Tugas Kelompok");
            System.out.println("3. Lihat Tugas");
            System.out.println("4. Update Tugas");
            System.out.println("5. Hapus Tugas");
            System.out.println("6. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    tambahTugasAkademik(scanner);
                    break;
                case 2:
                    tambahTugasKelompok(scanner);
                    break;
                case 3:
                    read();
                    break;
                case 4:
                    updateTugas(scanner);
                    break;
                case 5:
                    hapusTugas(scanner);
                    break;
                case 6:
                    Pembantu.tampilkanPesanKeluar();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 6);
    }

    // Implementasi metode CRUD dari interface
    @Override
    public void create(Tugas tugas) {
        daftarTugas.add(tugas);
        System.out.println("Tugas berhasil ditambahkan!");
    }

    @Override
    public void read() {
        if (daftarTugas.isEmpty()) {
            System.out.println("Tidak ada tugas.");
        } else {
            System.out.println("\n=== Daftar Tugas ===");
            for (Tugas tugas : daftarTugas) {
                System.out.println(tugas.getInfo());
            }
        }
    }

    @Override
    public void update(int id, Tugas tugasBaru) {
        Tugas tugasUntukDiupdate = null;
        for (Tugas tugas : daftarTugas) {
            if (tugas.getId() == id) {
                tugasUntukDiupdate = tugas;
                break;
            }
        }

        if (tugasUntukDiupdate != null) {
            tugasUntukDiupdate.setNama(tugasBaru.getNama());
            tugasUntukDiupdate.setDeskripsi(tugasBaru.getDeskripsi());
            tugasUntukDiupdate.setPrioritas(tugasBaru.getPrioritas());

            if (tugasUntukDiupdate instanceof TugasAkademik && tugasBaru instanceof TugasAkademik) {
                ((TugasAkademik) tugasUntukDiupdate).setMataPelajaran(((TugasAkademik) tugasBaru).getMataPelajaran());
            } else if (tugasUntukDiupdate instanceof TugasKelompok && tugasBaru instanceof TugasKelompok) {
                ((TugasKelompok) tugasUntukDiupdate).setLokasi(((TugasKelompok) tugasBaru).getLokasi());
            }

            System.out.println("Tugas dengan ID " + id + " berhasil di-update.");
        } else {
            System.out.println("ID tugas tidak valid.");
        }
    }

    @Override
    public void delete(int id) {
        Tugas tugasUntukDihapus = null;
        for (Tugas tugas : daftarTugas) {
            if (tugas.getId() == id) {
                tugasUntukDihapus = tugas;
                break;
            }
        }

        if (tugasUntukDihapus != null) {
            daftarTugas.remove(tugasUntukDihapus);
            System.out.println("Tugas dengan ID " + id + " berhasil dihapus.");
        } else {
            System.out.println("ID tugas tidak valid.");
        }
    }

    // Metode untuk menambah tugas akademik
    private void tambahTugasAkademik(Scanner scanner) {
        System.out.print("Masukkan tugas: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan deskripsi tugas: ");
        String deskripsi = scanner.nextLine();
        System.out.print("Masukkan prioritas tugas (1-5): ");
        int prioritas = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Masukkan mata pelajaran: ");
        String mataPelajaran = scanner.nextLine();

        TugasAkademik tugasBaru = new TugasAkademik(nama, deskripsi, prioritas, mataPelajaran);
        create(tugasBaru);
    }

    // Metode untuk menambah tugas rumah
    private void tambahTugasKelompok(Scanner scanner) {
        System.out.print("Masukkan tugas: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan deskripsi tugas: ");
        String deskripsi = scanner.nextLine();
        System.out.print("Masukkan prioritas tugas (1-5): ");
        int prioritas = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Masukkan lokasi tugas: ");
        String lokasi = scanner.nextLine();

        TugasKelompok tugasBaru = new TugasKelompok(nama, deskripsi, prioritas, lokasi);
        create(tugasBaru);
    }

    // Metode untuk mengupdate tugas
    private void updateTugas(Scanner scanner) {
        System.out.println("\n=== Daftar Tugas ===");
        for (Tugas tugas : daftarTugas) {
            System.out.println(tugas.getInfo());
        }
        System.out.print("Masukkan ID tugas yang ingin di update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Masukkan tugas baru: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan deskripsi tugas baru: ");
        String deskripsi = scanner.nextLine();
        System.out.print("Masukkan prioritas tugas baru (1-5): ");
        int prioritas = scanner.nextInt();
        scanner.nextLine(); 

        Tugas tugasBaru;
        System.out.print("Apakah ini tugas akademik? (ya/tidak): ");
        String jenis = scanner.nextLine();
        if (jenis.equalsIgnoreCase("ya")) {
            System.out.print("Masukkan mata pelajaran baru: ");
            String mataPelajaran = scanner.nextLine();
            tugasBaru = new TugasAkademik(nama, deskripsi, prioritas, mataPelajaran);
        } else {
            System.out.print("Masukkan lokasi tugas baru: ");
            String lokasi = scanner.nextLine();
            tugasBaru = new TugasKelompok(nama, deskripsi, prioritas, lokasi);
        }

        update(id, tugasBaru);
    }

    // Metode untuk menghapus tugas
    private void hapusTugas(Scanner scanner) {
        System.out.println("\n=== Daftar Tugas ===");
        for (Tugas tugas : daftarTugas) {
            System.out.println(tugas.getInfo());
        }
        System.out.print("Masukkan ID tugas yang ingin dihapus: ");
        int id = scanner.nextInt();
        delete(id);
    }
}
