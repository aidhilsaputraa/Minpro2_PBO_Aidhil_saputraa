package manajemenrumahsakit.lala;
public class Pasien extends PersonAbstract {
    private int umur;

    // Constructor
    public Pasien(String id, String nama, int umur) {
        super(id, nama); 
        this.umur = umur;
    }

    // Getter dan Setter
    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }


    @Override
    public void tampilkanInfo() {
        System.out.println("ID Pasien: " + getId());
        System.out.println("Nama: " + getNama());
        System.out.println("Umur: " + umur);
    }
}
