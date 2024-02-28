// File        : MTitik.java          28/02/24
// Penulis     : Aditya Haidar Faishal
// Deskripsi   : Implementasi enkapsulasi dan pembuatan method titik

public class MTitik {
    public static void main(String[] args) {
        Titik t1;
        Titik t2;
        Titik t3;

        t1 = new Titik(1, 2);
        t2 = new Titik(1, 2);
        t3 = new Titik(1, 2);

        System.out.printf("t1(%.1f, %.1f)\n", t1.getAbsis(), t1.getOrdinat());
        System.out.printf("absis t1 diubah jadi 5\n");
        t1.setAbsis(5);
        System.out.printf("t1(%.1f, %.1f)\n", t1.getAbsis(), t1.getOrdinat());
        System.out.printf("ordinat t1 diubah jadi 7\n");
        t1.setOrdinat(7);
        System.out.printf("t1(%.1f, %.1f)\n", t1.getAbsis(), t1.getOrdinat());

        System.out.printf("jarak t1 ke pusat : %.1f\n", t1.getJarakPusat());

        t2 = t1.getRefleksiX();
        t3 = t1.getRefleksiY();
        System.out.printf("refleksi t1 ke X : %.1f, %.1f\n", t2.getAbsis(), t2.getOrdinat());
        System.out.printf("refleksi t1 ke Y : %.1f, %.1f\n", t3.getAbsis(), t3.getOrdinat());

       
    }
}
