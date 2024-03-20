/*
 * BangunDatar.java 20/03/2024
 * Penulis      : Aditya Haidar Faishal
 * Deskrimpsi   : kelas abstrak, berisi abstraksi bangun datar
 */

 public abstract class BangunDatar {
    protected double luas;

    public abstract double hitungluas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
 }