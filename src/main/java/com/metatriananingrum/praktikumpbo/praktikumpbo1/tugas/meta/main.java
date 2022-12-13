
package com.metatriananingrum.praktikumpbo.praktikumpbo1.tugas.meta;


public class main {
    public static void main(String[] args) {
        // memanggil class Meta
        Meta saya = new Meta ("Yaya", 150, 67, 21);
        Meta dia = new Meta ("bibil", 155, 55, 23);
        
        // menjalankan Method
        saya.tentangSaya();
        dia.tentangSaya();
        
        // Menjalankan Getter & Setter dari class Meta
        System.out.println("Tinggi badan saya(sebelum diet) : " + dia.getBerat());
        dia.setBerat(75);
        System.out.println("Tinggi badan saya (setelah diet) : " + dia.getBerat());
        
        System.out.println("\n");
        // menghitung massa tubuh
        double massa = dia.getBerat() / ((dia.getTinggi() * 0.01) * (dia.getTinggi() * 0.01));
        
        System.out.println("Massa Tubuh saya adalah " + massa);
        System.out.println("\n");
        
                //Inheritance = menghubungkan dua objek atau lebih
        meta2 musik = new meta2(); // memanggil class Meta
        System.out.println("Apakah Musik adalah Objek -> " + (musik instanceof Object));
        System.out.println("Apakah Musik adalah Lagu -> " + (musik instanceof meta2));
        System.out.println("Apakah Musik adalah Push up -> " + (musik instanceof meta3));
        System.out.println("------------------------"); // spasi
 
        meta3 meta3 = new meta3(); // Memanggil class Meta3
        System.out.println("Apakah Musik adalah Objek -> " + (meta3 instanceof Object));
        System.out.println("Apakah Gitar adalah alat musik -> " + (meta3 instanceof meta2));
        System.out.println("Apakah Musik adalah Nyanyi -> " + (meta3 instanceof meta3)); 
    }
}
        


    
