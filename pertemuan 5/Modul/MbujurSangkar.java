/*
 * MbujurSangkar.java 20/03/2024
 * Penulis      : Aditya Haidar Faishal
 * Deskrimpsi   : kelas yang mengimplementasikan cara menghitung luas bujur sangkar
 */


import java.util.Scanner;

public class MbujurSangkar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Kuas bujur sangkar dengan sisi "+sisi+" satuan adalah "+bs.hitungluas(sisi));
    }
}
