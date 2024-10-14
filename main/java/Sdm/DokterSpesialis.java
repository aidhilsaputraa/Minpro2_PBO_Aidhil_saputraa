/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java 
 */
package Sdm;
import manajemenrumahsakit.lala.Dokter;
/**
 *
 * @author Lenovo GK
 */
public class DokterSpesialis extends Dokter {
    private String rumahSakit;

    // Constructor
    public DokterSpesialis(String id, String nama, String spesialisasi, String rumahSakit) {
        super(id, nama, spesialisasi);
        this.rumahSakit = rumahSakit;
    }

    // Getter dan Setter
    public String getRumahSakit() {
        return rumahSakit;
    }

    public void setRumahSakit(String rumahSakit) {
        this.rumahSakit = rumahSakit;
    }

    // Override tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Rumah Sakit: " + rumahSakit);
    }
}
