// File        : MGaris.java          28/02/24
// Penulis     : Aditya Haidar Faishal
// Deskripsi   : Membuat garis yang disususn oleh 2 titik
public class MGaris {
    public static void main(String[] args) {
        Garis g1;
        Garis g2;

        g1 = new Garis();
        g1.setTitikAwal(new Titik(1, 2));
        g1.setTitikAkhir(new Titik(2, 4));

        System.out.printf("g1(%.1f, %.1f)(%.1f, %.1f)\n", g1.getTitikAwal().getAbsis(), g1.getTitikAwal().getOrdinat(), g1.getTitikAkhir().getAbsis(), g1.getTitikAkhir().getOrdinat());

        System.out.printf("get panjang : %.1f\n", g1.getPanjang());

        System.out.printf("get gradien : %.1f\n", g1.getGradien());

        g2 = g1.getRefleksiY();
        System.out.printf("get refleksii g1: (%.1f, %.1f)(%.1f, %.1f)\n", g2.getTitikAwal().getAbsis(), g2.getTitikAwal().getOrdinat(), g2.getTitikAkhir().getAbsis(), g2.getTitikAkhir().getOrdinat());

     
        System.out.printf("is Tegak lurus : %b", g1.isTegakLurus(g2));
    }
}