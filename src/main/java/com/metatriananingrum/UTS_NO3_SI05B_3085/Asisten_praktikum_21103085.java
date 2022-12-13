
package com.metatriananingrum.UTS_NO3_SI05B_3085;

public class Asisten_praktikum_21103085 extends Mahasiswa_21103085 implements IPendapatan_21103085 {
    
    private String mkAsistensi;
    private int jmlPertemuan;

    public String getMkAsistensi() {
        return mkAsistensi;
    }

    public void setMkAsistensi(String mkAsistensi) {
        this.mkAsistensi = mkAsistensi;
    }

    public int getJmlPertemuan() {
        return jmlPertemuan;
    }

    public void setJmlPertemuan(int jmlPertemuan) {
        this.jmlPertemuan = jmlPertemuan;
    }

    @Override
    public void tampilDataMhs() {
        System.out.println("NIM                     : " + nim);
        System.out.println("Nama                    : " + nama);
        System.out.println("Jurusan                 : " + jurusan);
        System.out.println("IPK                     : " + ipk);
        System.out.println("MK Asistentsi           : " + mkAsistensi);
        System.out.println("Jumlah Pertemuan        : " + jmlPertemuan);
        System.out.println("-----------------------------------------");
    }

    @Override
    public double totalPendapatan() {
        double totalPendapatan;

        return totalPendapatan = jmlPertemuan * 50000;

    }

}

