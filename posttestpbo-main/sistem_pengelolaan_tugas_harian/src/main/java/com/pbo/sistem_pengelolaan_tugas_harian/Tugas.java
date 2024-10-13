package com.pbo.sistem_pengelolaan_tugas_harian;

public abstract class Tugas {
    private static int counter = 0;
    private final int id; // final
    private String nama;
    private String deskripsi;
    private int prioritas;

    // Constructor
    public Tugas(String nama, String deskripsi, int prioritas) {
        this.id = ++counter;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.prioritas = prioritas;
    }

    // Method untuk menampilkan info tugas
    public String getInfo() {
        return "ID: " + id + ", Nama: " + nama + ", Deskripsi: " + deskripsi + ", Prioritas: " + prioritas;
    }

    // Getter dan Setter 
    public int getId() { 
        return id;
    }

    public String getNama() { 
        return nama;
    }

    public void setNama(String nama) { 
        this.nama = nama;
    }

    public String getDeskripsi() { 
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) { 
        this.deskripsi = deskripsi;
    }

    public int getPrioritas() { 
        return prioritas;
    }

    public void setPrioritas(int prioritas) { 
        this.prioritas = prioritas;
    }
}
