package manajemenrumahsakit.lala;

public class Dokter extends PersonAbstract {
    private String spesialisasi;

    // Constructor
    public Dokter(String id, String nama, String spesialisasi) {
        super(id, nama);
        this.spesialisasi = spesialisasi;
    }

    // Getter dan Setter
    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }

    
    @Override
    public void tampilkanInfo() {
        System.out.println("ID Dokter: " + getId());
        System.out.println("Nama: " + getNama());
        System.out.println("Spesialisasi: " + spesialisasi);
    }
}
