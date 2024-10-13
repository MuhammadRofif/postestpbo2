package com.pbo.sistem_pengelolaan_tugas_harian;

public class TugasKelompok extends Tugas {
    private String lokasi;

    public TugasKelompok(String nama, String deskripsi, int prioritas, String lokasi) {
        super(nama, deskripsi, prioritas);
        this.lokasi = lokasi;
    }

    // Getter dan Setter
    public String getLokasi() { 
        return lokasi;
    }

    public void setLokasi(String lokasi) { 
        this.lokasi = lokasi;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Lokasi: " + lokasi;
    }
}
