/*
 * File         : PersegiPanjang.java 02/04/2024
 * Penulis      : Aditya Haidar Faishal / 24060122120005
 * Deskripsi    : representasi dasar objek persegi panjang. turunan kelas poligon
 */

package org.bangundatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon{
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar, int jumlahSisi){
        this.panjang    = panjang;
        this.lebar      = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double getPanjang(){
        return this.panjang;
    }
    public double getLebar(){
        return this.lebar;
    }

    public double hitungLuas(){
        return panjang * lebar;
    }

    public double hitungKeliling(){
        return 2*(panjang+lebar);
    }

    public void printInfo(){
        System.out.println("Bangun Persegi Panjang berisi "+this.getJumlahSisi()+" dengan panjang :"+this.getPanjang()+" dan lebar :"+this.getLebar());
    }
    
}
