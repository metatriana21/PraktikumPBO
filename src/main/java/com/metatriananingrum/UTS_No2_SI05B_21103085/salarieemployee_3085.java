
package com.metatriananingrum.UTS_No2_SI05B_21103085;

import com.zidanfathannul.UTS_No2_SI05B_21103046.employee_3046;

public class salarieemployee_3085 extends employee_3085 {

    int upahMingguan;

    public salarieemployee_3085(int upahMingguan, String nama, String nip) {
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
