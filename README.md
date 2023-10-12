# pbo-post-test-2

1. Penjelasan studi kasus
     Pada program toko sepatu ini, terdapat memiliki entitas sepatu, Dimana entitas ini memiliki atribut Id sepatu, merk, 
   ukuran dan harga sepatu. Dalam program sepatu ini, terdapat 2 package yaitu package utama(main) yang memiliki nama 
   package tokosepatu dan package entitas. Program ini juga mengimplementasikan CRUD, dimana kelas tokosepatu bisa 
   menambahkan sepatu, melihat list sepatu, mengedit data list sepatu dan menghapus data sepatu.

2. Penjelasan program
  a.) Kelas Sepatu
    -	Public final class sepatu
      Program tokosepatu ini dimulai dengan deklarasi kelas Sepatu. Kata kunci “final” menandakan bahwa kelas ini tidak 
      dapat diwarisi oleh kelas lain. Oleh karena itu, tidak ada kelas turunan yang dapat meng-extend kelas Sepatu ini.
    -	Property
      Kelas Sepatu memiliki beberapa property yaitu id, merk, ukuran, dan harga yang merepresentasikan atribut-atribut dari 
      sepatu. property id dideklarasikan sebagai final, yang berarti nilainya tidak dapat diubah setelah diinisialisasi.
    -	Konstruktor
      Kelas ini memiliki sebuah konstruktor yang digunakan untuk membuat objek Sepatu. Konstruktor ini menerima nilai-nilai 
      untuk id, merk, ukuran, dan harga, dan menginisialisasi variabel anggota kelas dengan nilai-nilai tersebut.
    - Getter dan setter
      Kelas Sepatu memiliki metode getter dan setter untuk mengakses dan mengubah nilai variabel anggota.
      getId(): Mengembalikan nilai id.
      getMerk(): Mengembalikan nilai merk.
      setMerk(String merk): Mengubah nilai merk.
      getUkuran(): Mengembalikan nilai ukuran.
      setUkuran(String ukuran): Mengubah nilai ukuran.
      getHarga(): Mengembalikan nilai harga.
      setHarga(double harga): Mengubah nilai harga.
  b.) Kelas tokosepatu
      Kelas tokosepatu ini adalah kelas utama program yang memiliki metode main sebagai titik eksekusi program. 
      1.) Import package dan kelas 
          import entitas.Sepatu;
          import java.util.ArrayList;
          import java.util.List;
          import java.util.Scanner;
          Program mengimpor kelas Sepatu dari package entitas serta beberapa kelas dari pustaka utilitas Java untuk 
          digunakan dalam program, seperti ArrayList dan Scanner.
      2.)	Public final class TokoSepatu
          Program dimulai dengan deklarasi kelas TokoSepatu. Kata kunci final menandakan bahwa kelas ini tidak dapat 
          diwarisi oleh kelas lain.
      3.)	Property
          private static List<Sepatu> listSepatu = new ArrayList<>();
          private static int idCounter = 1;
          Program memiliki dua property (listSepatu dan idCounter). listSepatu adalah objek dari kelas ArrayList yang 
          digunakan untuk menyimpan objek-objek Sepatu. idCounter digunakan untuk memberikan ID unik kepada setiap sepatu 
          yang ditambahkan ke dalam daftar.
      4.) Metode Utama (main)
          public static void main(String[] args) {
          // ... (logika program)
          }
          Metode main merupakan titik masuk program. Program akan memulai eksekusi dari sini.
      5.)	Pilihan menu
          Pada program toko sepatu ini memiliki beberapa pilihan operasi
          -	Menambah sepatu baru.
          -	Menampilkan daftar sepatu.
          -	Mengedit informasi sepatu.
          -	Menghapus sepatu.
          -	Keluar dari program.
      6.)	Pilihan operasi
          -	tambahSepatu(): Metode ini meminta pengguna memasukkan merk, ukuran, dan harga sepatu baru, membuat objek 
            Sepatu, dan menambahkannya ke dalam listSepatu.
          -	tampilkanSepatu(): Metode ini menampilkan daftar sepatu yang ada dalam listSepatu.
          -	editSepatu(): Metode ini memungkinkan pengguna untuk mengubah merk, ukuran, dan harga sepatu berdasarkan ID 
            sepatu yang dipilih.
          -	hapusSepatu(): Metode ini memungkinkan pengguna untuk menghapus sepatu berdasarkan ID sepatu yang dipilih.
 





