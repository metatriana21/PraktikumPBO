
package com.zidanfathannul.UTS_No2_SI05B_21103046;

public class projectplanner_3046 extends employee_3046 {

    int gajiPokok;
    int komisi;
    int totalProyek;

    public projectplanner_3046(int gajiPokok, int komisi, int totalProyek, String nama, String nip) {
        super(nama, nip);
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totalProyek = totalProyek;
    }

    @Override
    public void hitungGaji() {
        int hitungGaji = gajiPokok + (komisi * totalProyek);
        System.out.println("Gaji : " + hitungGaji);
    }

    @Override
    public void tampilData() {
        System.out.println("Nama : " + nama);
        System.out.println("NIP : " + nip);
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Komisi : " + komisi);
        System.out.println("Total Hasil Proyek : " + totalProyek);

    }

}
