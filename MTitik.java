// File        : Titik.java          21/02/24
// Penulis     : Aditya Haidar Faishal
// Deskripsi   : Kelas Titik yang merupakan sebuah titik dengan absis dan ordinat

public class MTitik {
    public static void main(String[]argv){
    Titik t1;
    Titik t2;
    Titik t3;

    t1 = new Titik();
    t1.setAbsis(1);
    t1.setOrdinat(2);


    t2 = new Titik();
    t2.setAbsis(3);
    t2.setOrdinat(4);


    t3 = new Titik();
    t3.setAbsis(5);
    t3.setOrdinat(6);

    int counterTitik = Titik.getCounterTitik();

    System.out.printf("Jumlah objek titik : %d\n", counterTitik);
    // System.out.printf("Titik t1 dengan absis : %.2f, ordinat : %.2f\n", t1.getAbsis(), t1.getOrdinat());
    // System.out.printf("Titik t2 dengan absis : %.2f, ordinat : %.2f\n", t2.getAbsis(), t2.getOrdinat());
    System.out.printf("t1(%.1f, %.1f)\n", t1.getAbsis(), t1.getOrdinat());
    System.out.printf("t2(%.1f, %.1f)\n", t2.getAbsis(), t2.getOrdinat());
    System.out.printf("t3(%.1f, %.1f)\n", t3.getAbsis(), t3.getOrdinat());
    }
}
