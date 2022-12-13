
package com.zidanfathannul.UTS_No2_SI05B_21103046;

public class main {

    public static void main(String[] args) {

        comissionemployee_3046 c1 = new comissionemployee_3046(4000000,50000,5,"Dewa","2291992");
        projectplanner_3046 p1 = new projectplanner_3046(500000,40000,6,"Yogi","22919912");
        salariedemployee_3046 s1 = new salariedemployee_3046(20000,"Aldi","22393992");
        
        System.out.println("DATA COMMISION EMPLOYEE");
        c1.tampilData();
        c1.hitungGaji();
        
        System.out.println();
        
        System.out.println("DATA PROJECT PLANNER");
        p1.tampilData();
        p1.hitungGaji();
        
        System.out.println();
        
        System.out.println("DATA SALARIED EMPLOYEE");
        s1.tampilData();
        s1.hitungGaji();
        
    }

}
