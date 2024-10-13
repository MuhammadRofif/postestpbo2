package utils;

public final class Pembantu {
    private String judulSistem;
    private String versiSistem;
    private String pengembang;

    // Constructor
    public Pembantu(String judulSistem, String versiSistem, String pengembang) {
        this.judulSistem = judulSistem;
        this.versiSistem = versiSistem;
        this.pengembang = pengembang;
    }

    // Method untuk mencetak judul
    public void cetakJudul() {
        System.out.println("\n=== " + judulSistem + " (Versi: " + versiSistem + ") ===");
        System.out.println("Dikembangkan oleh: " + pengembang);
    }
    
    // Method untuk menampilkan pesan keluar
    public static void tampilkanPesanKeluar() {
        System.out.println("Terima kasih telah menggunakan sistem.");
    }

    // Getter dan Setter
    public String getJudulSistem() { 
        return judulSistem;
    }

    public void setJudulSistem(String judulSistem) { 
        this.judulSistem = judulSistem;
    }

    public String getVersiSistem() { 
        return versiSistem;
    }

    public void setVersiSistem(String versiSistem) { 
        this.versiSistem = versiSistem;
    }

    public String getPengembang() { 
        return pengembang;
    }

    public void setPengembang(String pengembang) { 
        this.pengembang = pengembang;
    }
}
