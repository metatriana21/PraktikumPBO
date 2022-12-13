
package com.metatriananingrum.praktikumpbo.praktikumpbo1.pertemuan5;

import java.util.Scanner;

public class DyinamicArray {
    public static void main(String[] args) {
        //Deklarasi Scanner utk user input nanti
        Scanner input = new Scanner(System.in);
        
        //membuat agar panjang array ditentutkan input user
        System.out.println("-- Program Input Nilai --");
        System.out.print("Masukkan Jumlah Matkul: ");
        int jml = input.nextInt();
   
        
        //membuat array baru dengan panjang manual input user
        int[] nilai = new int[jml];
        
        //memasukkan nilai ke array
        for(int i=0; i<jml; i ++){
            System.out.print("Masukkan Nilai Ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
        }
        System.out.println();
        
        //Menampilkan semua nilai Array
        System.out.println("-- Daftar Nilai --");
        for(int i=0; i<jml; i++){
            System.out.println("Nilai ke-" + (i+1) + ":" + nilai[i]);
        }
            
    }
}
