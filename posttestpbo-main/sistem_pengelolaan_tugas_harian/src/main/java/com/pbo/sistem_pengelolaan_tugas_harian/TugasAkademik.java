package com.pbo.sistem_pengelolaan_tugas_harian;

public class TugasAkademik extends Tugas {
    private String mataPelajaran;

    public TugasAkademik(String nama, String deskripsi, int prioritas, String mataPelajaran) {
        super(nama, deskripsi, prioritas);
        this.mataPelajaran = mataPelajaran;
    }

    // Getter dan Setter
    public String getMataPelajaran() { 
        return mataPelajaran;
    }

    public void setMataPelajaran(String mataPelajaran) { 
        this.mataPelajaran = mataPelajaran;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Mata Pelajaran: " + mataPelajaran;
    }
}
