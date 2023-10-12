package com.mycompany.tokosepatu;

import entitas.Sepatu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class TokoSepatu {

    private static List<Sepatu> listSepatu = new ArrayList<>();
    private static int idCounter = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("|==============================|");
            System.out.println("|      Daftar Pilihan Menu     |");
            System.out.println("|------------------------------|");
            System.out.println("|1. Tambah Sepatu              |");
            System.out.println("|2. Tampilkan Sepatu           |");
            System.out.println("|3. Edit Sepatu                |");
            System.out.println("|4. Hapus Sepatu               |");
            System.out.println("|5. Keluar                     |");
            System.out.println("|==============================|");
            System.out.print("Pilih menu (1/2/3/4/5): ");
             
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tambahSepatu();
                    break;
                case 2:
                    tampilkanSepatu();
                    break;
                case 3:
                    editSepatu();
                    break;
                case 4:
                    hapusSepatu();
                    break;
            }
        } while (choice != 5);
    }

    private static final void tambahSepatu() {
        System.out.println("----------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan merk sepatu: ");
        String merk = scanner.nextLine();
        System.out.print("Masukkan ukuran sepatu: ");
        String ukuran = scanner.nextLine();
        System.out.print("Masukkan harga sepatu: ");
        double harga = scanner.nextDouble();

        Sepatu sepatu = new Sepatu(idCounter++, merk,ukuran,harga);
        listSepatu.add(sepatu);
        System.out.println("Sepatu berhasil ditambahkan!");
        System.out.println("----------------------------------------");
        System.out.println("");
        
    }

    private static final void tampilkanSepatu() {
        System.out.println("----------------------------------------");
        System.out.println("Daftar List Sepatu: ");
        for (Sepatu sepatu : listSepatu) {
            System.out.println("ID: " + sepatu.getId() + ", Merk: " + sepatu.getMerk() + ", Ukuran: " + sepatu.getUkuran() +  ", Harga: " + sepatu.getHarga());
        }
        System.out.println("----------------------------------------");
        System.out.println("");
    }

    private static final void editSepatu() {
        System.out.println("----------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan ID sepatu yang ingin diubah: ");
        int id = scanner.nextInt();

        Sepatu sepatuToUpdate = null;
        for (Sepatu sepatu : listSepatu) {
            if (sepatu.getId() == id) {
                sepatuToUpdate = sepatu;
                break;
            }
        }

        if (sepatuToUpdate != null) {
            System.out.print("Masukkan merk baru sepatu: ");
            String merk = scanner.next();
            System.out.print("Masukkan ukuran baru sepatu: ");
            String ukuran = scanner.next();
            System.out.print("Masukkan harga baru sepatu: ");
            double harga = scanner.nextDouble();

            sepatuToUpdate.setMerk(merk);
            sepatuToUpdate.setUkuran(ukuran);
            sepatuToUpdate.setHarga(harga);
            System.out.println("Sepatu berhasil diubah!");
        } else {
            System.out.println("Sepatu tidak ditemukan!");
        }
            System.out.println("----------------------------------------");
            System.out.println("");
    }

    private static final void hapusSepatu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.print("Masukkan ID sepatu yang ingin dihapus: ");
        int id = scanner.nextInt();

        Sepatu sepatuToRemove = null;
        for (Sepatu sepatu : listSepatu) {
            if (sepatu.getId() == id) {
                sepatuToRemove = sepatu;
                break;
            }
        }

        if (sepatuToRemove != null) {
            listSepatu.remove(sepatuToRemove);
            System.out.println("Sepatu berhasil dihapus!");
        } else {
            System.out.println("Sepatu tidak ditemukan!");
        }
        System.out.println("----------------------------------------");
        System.out.println("");
    }
}