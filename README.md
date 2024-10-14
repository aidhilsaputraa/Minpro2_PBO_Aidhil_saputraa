
# Penjelasan Kodingan:
Kelas PersonAbstract (Superclass)
Deskripsi: Ini adalah kelas abstrak yang menjadi superclass dari Dokter dan Pasien. Kelas ini memiliki dua properti: id (yang bersifat final) dan nama. Karena ini adalah kelas abstrak, maka objek tidak bisa dibuat langsung dari kelas ini.

# Properti:
id: Bersifat final, artinya hanya dapat diinisialisasi satu kali (melalui konstruktor).
nama: Dapat diubah menggunakan setter.
Getter dan Setter:

Getter untuk id.
Getter dan setter untuk nama.
Metode Abstrak:

tampilkanInfo(): Harus diimplementasikan oleh kelas yang mewarisinya (Dokter dan Pasien).

Kelas Dokter (Subclass of PersonAbstract)
Deskripsi: Kelas Dokter merupakan turunan dari PersonAbstract. Kelas ini menambahkan properti baru, yaitu spesialisasi. Setiap objek dokter harus memiliki ID, nama, dan spesialisasi.

Properti:
spesialisasi: Bersifat final, artinya tidak bisa diubah setelah diinisialisasi.
Metode:

tampilkanInfo(): Mengimplementasikan metode abstrak dari PersonAbstract, menampilkan detail dokter.

Kelas Pasien (Subclass of PersonAbstract)
Deskripsi: Kelas Pasien juga merupakan turunan dari PersonAbstract. Properti tambahannya adalah umur. Setiap objek pasien memiliki ID, nama, dan umur.

Properti:
umur: Dapat diubah menggunakan setter.
Metode:

tampilkanInfo(): Mengimplementasikan metode abstrak dari PersonAbstract, menampilkan detail pasien.
Interface Operasi_CRUD
Interface ini mendefinisikan operasi dasar untuk CRUD (Create, Read, Update, Delete). Kelas MainProgram akan mengimplementasikan interface ini untuk memanipulasi daftar objek PersonAbstract.

# **Metode CRUD:**

tambah(): Menambah objek ke dalam daftar.
lihat(): Menampilkan semua objek yang ada di daftar.
update(): Memperbarui objek berdasarkan ID.
hapus(): Menghapus objek berdasarkan ID.

Kelas MainProgram (Implementasi dari Interface)
Deskripsi: Kelas ini adalah implementasi dari aplikasi manajemen rumah sakit yang sederhana. Menggunakan ArrayList untuk menyimpan daftar PersonAbstract (dokter dan pasien).

# **Operasi yang tersedia:**

Menambahkan dokter atau pasien.
Melihat daftar seluruh orang (dokter dan pasien).
Meng-update data dokter atau pasien berdasarkan ID.
Menghapus data berdasarkan ID.
Alur Program:

Pengguna akan memilih opsi dari menu.
Berdasarkan input dari pengguna, program akan memanggil metode tertentu (seperti tambahDokter(), lihat(), update(), hapus()).



# **Inheritance (Pewarisan):**
Dokter dan Pasien mewarisi PersonAbstract. Ini memungkinkan kedua kelas ini untuk berbagi properti dan metode yang sama.

# **Abstraction (Abstraksi):**
Kelas PersonAbstract menggunakan abstraksi, artinya kelas ini mendefinisikan metode abstrak tampilkanInfo() yang harus diimplementasikan oleh subclass.

# **Polymorphism:**
Interface Operasi_CRUD diterapkan pada MainProgram, sehingga kelas ini bisa melakukan berbagai jenis operasi CRUD dengan cara yang generik.

# **Encapsulation:**
Properti kelas seperti id, nama, dan spesialisasi dienkapsulasi (bersifat private) dan hanya bisa diakses melalui getter dan setter.

# **Final Keyword:**
Properti seperti id dan spesialisasi bersifat final, yang berarti nilainya hanya bisa diinisialisasi satu kali dan tidak dapat diubah.


