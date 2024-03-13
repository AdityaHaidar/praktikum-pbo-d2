/*
 * File         : Segitiga.java 02/04/2024
 * Penulis      : Aditya Haidar Faishal / 24060122120005
 * Deskripsi    : representasi dasar objek Segitiga. turunan kelas poligon
 */

 package org.bangundatar;

 import org.poligon.Poligon;
 
 public class Segitiga extends Poligon{
     private double sisi1, sisi2, sisi3;
 
     public Segitiga(double sisi1, double sisi2, double sisi3){
         this.sisi1    = sisi1;
         this.sisi2    = sisi2;
         this.sisi3    = sisi3;
     
    }
    public double getSisi1(){
        return this.sisi1;
    }
    public double getSisi2(){
        return this.sisi2;
    }
    public double getSisi3(){
        return this.sisi3;
    }
 
     public double hitungLuas(){

        double s = (sisi1 + sisi2 + sisi3) / 2;

        // Menghitung luas menggunakan rumus Heron
        return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
      
     }

     public double hitungKeliling(){
        return sisi1 + sisi2 + sisi3;
     }
 
     public void printInfo(){
     
        System.out.println("Bangun Segitiga bersisi 3 dengan sisi1 :"+ this.getSisi1()+", sisi2 :"+this.getSisi2()+", sisi3 :"+this.getSisi3());
     }
     
 }
 