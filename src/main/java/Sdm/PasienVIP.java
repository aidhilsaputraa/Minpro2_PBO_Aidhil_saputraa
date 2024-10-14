package Sdm;
import  manajemenrumahsakit.lala.Pasien;

public class PasienVIP extends Pasien {
    private String fasilitasVIP;

    // Constructor
    public PasienVIP(String id, String nama, int umur, String fasilitasVIP) {
        super(id, nama, umur); // Memanggil constructor dari class Pasien
        this.fasilitasVIP = fasilitasVIP;
    }

    // Getter dan Setter
    public String getFasilitasVIP() {
        return fasilitasVIP;
    }

    public void setFasilitasVIP(String fasilitasVIP) {
        this.fasilitasVIP = fasilitasVIP;
    }

    // Override tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Panggil metode dari superclass
        System.out.println("Fasilitas VIP: " + fasilitasVIP);
    }
}