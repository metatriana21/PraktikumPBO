
package com.metatriananingrum.praktikumpbo.praktikumpbo1.pertemuan4.Tugas;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" === SODA ===  ");
        System.out.println("   1. Sprite   ");
        System.out.println("   2. Fanta  ");
        System.out.println("   3. CocaCola       ");
        System.out.println("   4. Keluar       ");
        System.out.print("Masukkan Pilihan : ");
        int pilihan = input.nextInt();
        System.out.println();
        sprite sp = new sprite();
        soda sd = new soda();
        CocaCola cc = new CocaCola();
        
        sp.nama = "Sprite";
        sp.jml = 2 ;
        sp.keadaan = "tidak baik untuk kesehatan";
        sp.merk = "Sprite";
        
        sd.nama = "fanta ";
        sd.keadaan = "tidak bagus";
        sd.jml = 3 ;
        
        cc.nama = "Coca Cola";
        cc.jml = 2;
        cc.keadaan = "sangat tidak sehat";
        cc.merk = " Coca Cola";
        
        
        
        switch(pilihan){
              case 1:
               sp.disclamer();
               sp.showInfo();
               sp.funfact();
               sp.extraInfo();
            break;
            
            case 2:
                sd.disclamer();
                sd.showInfo();
            break;
            
            case 3:
               cc.disclamer();
               cc.showInfo();
               cc.funfact();
               cc.extraInfo();
            break;
            
            case 4:
                System.out.println("Silahkan Keluar");
            break;
        }
    }
    
}
    
        




    
    
    
    

