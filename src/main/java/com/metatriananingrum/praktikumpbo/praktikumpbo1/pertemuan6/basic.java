
package com.metatriananingrum.praktikumpbo.praktikumpbo1.pertemuan6;

public class basic {
    public static void main(String[] args) {
        //membuat array isi 3
        int[] myNumbers = { 1, 2, 3,};
        
        //uji coba print nilai array index ke -10
        try {
            System.out.println(myNumbers[10]);
        }
        
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array gk sebesar itu!");
        }
        System.out.println("Proses selesai");
    }
    
}
