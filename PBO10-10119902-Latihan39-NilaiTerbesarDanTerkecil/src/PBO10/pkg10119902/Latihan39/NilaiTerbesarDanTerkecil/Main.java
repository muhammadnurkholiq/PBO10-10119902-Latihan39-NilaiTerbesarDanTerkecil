/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10.pkg10119902.Latihan39.NilaiTerbesarDanTerkecil;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author 
 * NAMA    : Muhammad Nurkholiq
 * KELAS   : PBO10K
 * NIM     : 10119902
 * Deskripsi Program : Program Ini Berisi Program Untuk Menampilkan Program Nilai Terbesar Dan Terkecil
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Nilai nilai = new Nilai();
        System.out.println("======Program Nilai Terbesar dan Terkecil Nilai Mahasiswa======");
        System.out.print("Masukan Nama Petugas : ");
        nilai.Petugas = scanner.nextLine();
        System.out.print("Masukan banyaknya nilai mahasiswa : ");
        nilai.BanyakNilai = scanner.nextInt();
        nilai.nilaiMahasiswa = new int[nilai.BanyakNilai];
        
        for (int i=1 ;i<=nilai.BanyakNilai; i++){
            System.out.printf("Hasil Nilai Mahasiswa ke -%d : %n", i);
            nilai.nilaiMahasiswa[i-1]=scanner.nextInt(); 
        }
        
        System.out.println();
        System.out.println("===== Hasil Nilai Mahasiswa =====");
        for (int i =1; i<=nilai.BanyakNilai ; i++)
        System.out.printf("Hasil Nilai Mahasiswa ke-%d : %d%n",i,nilai.nilaiMahasiswa[i-1]);
        nilai.hitungNilaiMax();
        nilai.hitungNilaiMin();
        
        System.out.println();
        System.out.println("Nilai Terbesar Adalah : "+ nilai.nilaimax);
        System.out.println("Nilai Terkecil Adalah : "+ nilai.nilaimin);
        
        System.out.println("\n");
        System.out.printf("Nama Petugas : %s", nilai.Petugas);
    }

}
