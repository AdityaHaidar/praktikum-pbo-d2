/*
 * File         : Mp.java 02/04/2024
 * Penulis      : Aditya Haidar Faishal / 24060122120005
 * Deskripsi    : representasi dasar objek persegi panjang. turunan kelas poligon
 */

package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        System.out.println("\n");
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang     : "+persegi.hitungLuas());
        System.out.println("Keliling Persegi Panjang : "+persegi.hitungKeliling());

        System.out.println("\n");
      
        Segitiga segitiga1 = new Segitiga(5, 5, 6);
        segitiga1.printInfo();
        System.out.println("Luas Segitiga            : "+segitiga1.hitungLuas());
        System.out.println("Keliling Segitiga        : "+segitiga1.hitungKeliling());

        System.out.println("\n");
    }  


}
