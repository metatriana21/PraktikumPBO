
package com.metatriananingrum.praktikumpbo.praktikumpbo1.latihan;

import java.util.Scanner;

public class prjArrayAPA {
    
    public static void main(String[] args){
        int n, jml = 0;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan Jumlah elemen Array :");
        n = inputan.nextInt();
        int bil[] = new int[5];
        System.out.println("Masukkan Elemen Array :");
        for(int i = 0; i < 5; i++)
        {
            bil[i] = inputan.nextInt();
            jml = jml + bil[i];
        }
        System.out.println("Jumlah : "+jml);
    }
    
}
