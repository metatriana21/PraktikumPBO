
package com.metatriananingrum.praktikumpbo.praktikumpbo1.pertemuan4.kendaraan;


public class Main {
    public static void main(String[] args) {
        //pembuatan object
        //class object
        Mobil mb = new Mobil();
        Bus bs = new Bus();
        Kendaraan kn = new Kendaraan();
        
        
        //memasukan nilai atribut
        mb.nama = "Mitsubishi";
        mb.jmlroda = 4;
        mb.maxGear = 6;
      
        kn.nama = "Kendaraan Misterius";
        kn.jmlroda = 4;
        
        bs.nama = "Boboboy";
        bs.jmlroda = 6;
        bs.dayaAngkut = 20;
        
        //uji coba pemanggilan method
        mb.showInfo();
        mb.nyalakanMesin();
        mb.belok("Kanan");
        mb.belok();
        
        System.out.println();
        kn.showInfo();
        kn.nyalakanMesin();
        
        System.out.println("\n");
        bs.showInfo();
        bs.nyalakanMesin();
        bs.belok("Kiri");
        bs.belok();
       
        
          }
    
}
