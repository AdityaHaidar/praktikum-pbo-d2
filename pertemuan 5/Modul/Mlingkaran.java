/*
 * MLingkaran.java 20/03/2024
 * Penulis      : Aditya Haidar Faishal
 * Deskrimpsi   : implementasi cara menghitung luaslingkaran
 */

 import java.util.Scanner;


public class Mlingkaran {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        

        System.out.print("Masukan jari-jari Lingkaran : ");
        double jejari = scan.nextDouble();

        Lingkaran l = new Lingkaran(jejari);

        System.out.println("Luas lingkaran dengan jejari "+jejari+" satuan adalah "+l.hitungluas());
    }
}



