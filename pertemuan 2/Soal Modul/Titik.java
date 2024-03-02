// File        : Titik.java          28/02/24
// Penulis     : Aditya Haidar Faishal
// Deskripsi   : Implementasi enkapsulasi dan pembuatan method titik

/*                       3.1                        */
/*       1. Implementasi konsep enkapsulasi         */

public class Titik{
    private double absis;
    private double ordinat;
   // static int numberOfPoints;


   //konstruktor
   //membuat objek titik dengan inisialisasi nilai absis dan ordinat
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
    }

    //membuat objek titik dengan inisialisasi absis 0 dan ordinat 0
    public Titik(){
        this(0, 0);
    }

    //method
    //fungsi selektor untuk mendapatkan nilai atribut ordinat
    public double getOrdinat(){
        return this.ordinat;
    }
    //fungsi selektor untuk mendapatkan nilai atribut absis
    public double getAbsis(){
        return this.absis;
    }

    //prosedur untuk mengeset nilai atribut absis dengan nilai yang baru
    public void setAbsis(double absis){
        this.absis = absis;
    }

    //prosedur untuk mengeset nilai atribut ordinat dengan nilai yang baru
    public void setOrdinat(double ordinat){
        this.ordinat = ordinat;
    }


   /*            2.Menambahkan Method         */

   //a. getJarakPusat untuk menghitung jarak sebuah titik dengan titi pusat (0,0)
   public double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
   }

   //b. refleksiX melakukan pencerminan titik terhadap sumbu X.
   public void refleksiX(double ordinat){
        this.ordinat = -ordinat;
   }

    //c. refleksiX melakukan pencerminan titik terhadap sumbu Y.
    public void refleksiY(double absis){
        this.absis = -absis;
   }

   //d. getRefleksiX menghasilkan titik baru yang merupakan hasil pencerminan terhadap sumbu X.
   public Titik getRefleksiX(){
        return new Titik(absis, -ordinat);
   }

    //d. getRefleksiY menghasilkan titik baru yang merupakan hasil pencerminan terhadap sumbu Y.
    public Titik getRefleksiY(){
        return new Titik(-absis, ordinat);
   }
}
