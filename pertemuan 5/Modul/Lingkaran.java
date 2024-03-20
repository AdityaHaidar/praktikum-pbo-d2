/*
 * Lingkaran.java 20/03/2024
 * Penulis      : Aditya Haidar Faishal
 * Deskrimpsi   : Kelas implementasi IArea berupa cara menghitung luas lingkaran
 */


 //Mengambil konstanta yang ada di kelas java.lang.Math
 import static java.lang.Math.PI;

class Lingkaran implements IArea{
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungluas(){
        return PI*jejari*jejari;
    }
    
}
