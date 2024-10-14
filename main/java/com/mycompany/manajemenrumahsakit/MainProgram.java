package com.mycompany.manajemenrumahsakit;

import manajemenrumahsakit.lala.Dokter;
import manajemenrumahsakit.lala.Pasien;
import manajemenrumahsakit.lala.PersonAbstract;

import java.util.ArrayList;
import java.util.Scanner;
import Sdm.Operasi_CRUD;

public class MainProgram implements Operasi_CRUD<PersonAbstract> {

    
    private static final ArrayList<PersonAbstract> daftarPerson = new ArrayList<>();

    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final MainProgram program = new MainProgram(); 
        int pilihan;

        do {
            System.out.println("\n=== Sistem Manajemen Rumah Sakit ===");
            System.out.println("1. Tambah Dokter");
            System.out.println("2. Tambah Pasien");
            System.out.println("3. Lihat Daftar Doketr/Pasien");
            System.out.println("4. Update Dokter/Pasien");
            System.out.println("5. Hapus Dokter/Pasien");
            System.out.println("6. Keluar");
            System.out.print("Pilih opsi: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Masukkan angka yang valid.");
                scanner.next();
            }
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    program.tambahDokter(scanner);
                    break;
                case 2:
                    program.tambahPasien(scanner);
                    break;
                case 3:
                    program.lihat();
                    break;
                case 4:
                    program.update(scanner);
                    break;
                case 5:
                    program.hapus(scanner);
                    break;
                case 6:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Coba lagi.");
            }
        } while (pilihan != 6);
    }


    public void tambahDokter(final Scanner scanner) {
        System.out.print("Masukkan ID Dokter: ");
        final String id = scanner.next(); 
        System.out.print("Masukkan Nama Dokter: ");
        final String nama = scanner.next();
        System.out.print("Masukkan Spesialisasi Dokter: ");
        final String spesialisasi = scanner.next();

        final Dokter dokter = new Dokter(id, nama, spesialisasi);
        tambah(dokter);
    }

    
    public void tambahPasien(final Scanner scanner) {
        System.out.print("Masukkan ID Pasien: ");
        final String id = scanner.next();
        System.out.print("Masukkan Nama Pasien: ");
        final String nama = scanner.next();
        System.out.print("Masukkan Umur Pasien: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Masukkan umur yang valid.");
            scanner.next();
        }
        final int umur = scanner.nextInt();  

        final Pasien pasien = new Pasien(id, nama, umur);
        tambah(pasien);
    }


    @Override
    public void tambah(final PersonAbstract person) {
        daftarPerson.add(person);
        System.out.println(person.getNama() + " berhasil ditambahkan!");
    }

    @Override
    public void lihat() {
        System.out.println("\n--- Daftar nama ---");
        if (daftarPerson.isEmpty()) {
            System.out.println("Tidak ada data.");
        } else {
            for (final PersonAbstract person : daftarPerson) {
                person.tampilkanInfo();
                System.out.println("--------------------");
            }
        }
    }

    @Override
    public void update(final String id, final PersonAbstract person) {
        
    }

    public void update(final Scanner scanner) {
        System.out.print("Masukkan ID Person yang ingin di-update: ");
        final String id = scanner.next();

        for (final PersonAbstract person : daftarPerson) {
            if (person.getId().equals(id)) {
                System.out.print("Masukkan Nama baru: ");
                final String namaBaru = scanner.next();
                person.setNama(namaBaru);  
                System.out.println("Data berhasil di-update!");
                return;
            }
        }
        System.out.println("Person dengan ID tersebut tidak ditemukan.");
    }

    @Override
    public void hapus(final String id) {
    }

    public void hapus(final Scanner scanner) {
        System.out.print("Masukkan ID Person yang ingin dihapus: ");
        final String id = scanner.next();

        for (int i = 0; i < daftarPerson.size(); i++) {
            if (daftarPerson.get(i).getId().equals(id)) {
                daftarPerson.remove(i);
                System.out.println("Data berhasil dihapus!");
                return;
            }
        }
        System.out.println("Person dengan ID tersebut tidak ditemukan.");
    }
}
