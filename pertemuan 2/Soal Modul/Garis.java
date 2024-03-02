// File        : Garis.java          28/02/24
// Penulis     : Aditya Haidar Faishal
// Deskripsi   : Membuat garis yang disususn oleh 2 titik



/*                       3.1                        */
/*1. Mmebuat sebuah kelas bernama Garis yang terdiri titikAwal dan titikAkhir bertipe Titik*/

public class Garis {
    Titik titikAwal;
    Titik titikAkhir;


    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    public Garis(){
        this(new Titik(0,0), new Titik(1,1));
    }
/*2. Lengkapi method getter dan setter pada class Garis */

    public Titik getTitikAwal(){
        return this.titikAwal;
    }

    public Titik getTitikAkhir(){
        return this.titikAkhir;
    }

    public void setTitikAwal(Titik titikAwal){
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(Titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }

/*3. Tambahkan beberapa method lainnya, antara lain: */

    //a. getPanjang menghitung Panjang garis.
    public double getPanjang(){
        return(Math.sqrt(Math.pow(titikAwal.getAbsis()-titikAkhir.getAbsis(), 2) + Math.pow(titikAwal.getOrdinat() - titikAkhir.getOrdinat(), 2)));
    }

    //b. getGradien menghitung gradien garis.
    public double getGradien(){
        return((titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis()));
    }

    //c. getRefleksiY() menghasilkan garis baru yang merupakan hasil pencerminan dengan sumbu Y
    public Garis getRefleksiY(){
        return new Garis((this.titikAwal).getRefleksiY(), (this.titikAkhir).getRefleksiY());
    }

    //d. isTegakLurus(G: Garis) menghasilkan nilai True jika objek garis tegak lurus dengan garis G.
    public boolean isTegakLurus(Garis G){
        if (this.getGradien() * G.getGradien() == -1){
            return true;
        }
        else{
            return false;
        }
    }



}
