
package com.metatriananingrum.UTS_No2_SI05B_21103085;

public class main {

    public static void main(String[] args) {

        comissionemployee_3085 c1 = new comissionemployee_3085(7000000,10000,5,"Meta","2222222");
        projectplanner_3085 p1 = new projectplanner_3085(600000,20000,6,"Jidan","23232323");
        salarieemployee_3085 s1 = new salarieemployee_3085(250000,"Lala","24343421");
        
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

