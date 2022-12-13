
package com.zidanfathannul.UTS_No2_SI05B_21103046;


public class salariedemployee_3046 extends employee_3046 {

    int upahMingguan;

    public salariedemployee_3046(int upahMingguan, String nama, String nip) {
        super(nama, nip);
        this.upahMingguan = upahMingguan;
    }

    @Override
    public void tampilData() {
        System.out.println("Nama : " + nama);
        System.out.println("NIP : " + nip);
        System.out.println("Upah Mingguan : " + upahMingguan);
        
    }

    @Override
    public void hitungGaji() {
        int hitungGaji = upahMingguan;
        System.out.println("Gaji : " + hitungGaji);
    }

}
