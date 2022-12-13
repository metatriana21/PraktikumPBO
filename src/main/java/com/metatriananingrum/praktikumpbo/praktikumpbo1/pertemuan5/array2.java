
package com.metatriananingrum.praktikumpbo.praktikumpbo1.pertemuan5;


public class array2 {
     public  static void main(String[] args){
        //pembuatan array
        String[] names = {
        "rain",
        "Thunder",
        "Storm"
     };
                
        //cek panjang array
        System.out.println("Panjang Array: " + names.length);
        
        
        //menampilkan semua nilai Array
        for(int i=0; i<names.length; i++) {
            System.out.println(i + ": " + names[i]);
    }
    }
    
}
