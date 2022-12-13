
package com.metatriananingrum.praktikumpbo.praktikumpbo1.pertemuan4.kendaraan;

public class Bus extends Kendaraan{
    int dayaAngkut;
    
public void belok(String arah){
    System.out.println("Bus " + nama + " belok ke " + arah + "!");
}

public void belok(){
    System.out.println("Error : mohon masukkan arah!");
}

public void extraInfo(){
    System.out.println("Daya Angkut Bus : " + dayaAngkut + " org");
}
}
