/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10.pkg10119902.Latihan39.NilaiTerbesarDanTerkecil;

import java.util.Arrays;

/**
 *
 * @author korik
 */
public class Nilai {
     public String Petugas;
     public int BanyakNilai;
     public int []nilaiMahasiswa;
     public int nilaimax;
     public int nilaimin;
     
     public void hitungNilaiMax(){
         nilaimax=Arrays.stream(nilaiMahasiswa).max().getAsInt();
     }
     public void hitungNilaiMin(){
         nilaimin=Arrays.stream(nilaiMahasiswa).min().getAsInt();
     }
}
