
package com.metatriananingrum.praktikumpbo.praktikumpbo1.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;


public class MultiException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try{
            System.out.print("Masukan Bilangan : ");
            int bilangan = input.nextInt();
            
            System.out.print("Masukkan pembagi : ");
            int pembagi = input.nextInt();
            
            int hasil = bilangan / pembagi;
            
            System.out.println("Hasil Pembagian (dibulatkan) : " +hasil);
        }
        
        catch(ArithmeticException e) {
            System.out.println("Bilangan tidak bisa di bagi 0!");
        }
        
        catch(InputMismatchException e){
            System.out.println("Harap masukan angka saja");
        }
    }
 
}
