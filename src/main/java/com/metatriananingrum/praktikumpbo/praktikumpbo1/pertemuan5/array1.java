
package com.metatriananingrum.praktikumpbo.praktikumpbo1.pertemuan5;

public class array1 {
    public  static void main(String[] args){
        //pembuatan array
        String[] names = new String[3];
                
        //cek panjang array
        System.out.println("Panjang Array: " + names.length);
        
        //memasukan nilai ke array
        names[0] = "Rain";
        names[1] = "Thunder";
        names[2] = "Storm";
        
        //menampilkan semua nilai Array
        for(int i=0; i<names.length; i++) {
            System.out.println(i + ": " + names[i]);
    }
    }
    
}
