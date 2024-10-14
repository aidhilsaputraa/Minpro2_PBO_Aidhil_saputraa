/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java 
 */
package Sdm;

/**
 *
 * @author Lenovo GK
 */

// Interface untuk operasi CRUD
public interface Operasi_CRUD <T> {
    void tambah(T item);
    void lihat();
    void update(String id, T item);
    void hapus(String id);
}
