/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemenrumahsakit.lala;

/**
 *
 * @author Lenovo GK
 */
// Class abstrak untuk person
public abstract class PersonAbstract {
    protected String id;
    protected String nama;

    // Constructor
    public PersonAbstract(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // Metode abstrak yang harus diimplementasikan
    public abstract void tampilkanInfo();
    
    // Getter dan Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
