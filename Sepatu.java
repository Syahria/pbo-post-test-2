/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitas;

/**
 *
 * @author Asus
 */
public final class Sepatu {
    private final int id;
    private String merk;
    private String ukuran;
    private double harga;
    

    public Sepatu(int id, String merk, String ukuran, double harga) {
        this.id = id;
        this.merk = merk;
        this.ukuran = ukuran;
        this.harga = harga;
        
    }

    //   getter and setter method
    
    public int getId() {
        return id;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }
    
    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
}
