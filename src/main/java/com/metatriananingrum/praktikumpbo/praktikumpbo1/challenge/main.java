
package com.metatriananingrum.praktikumpbo.praktikumpbo1.challenge;

public class main {
    public static void main(String[] args) {
        challenge Meta = new challenge("Meta", 10, 2002);
        challenge Triana = new challenge("Triana", 11, 2003);
        challenge Ningrum = new challenge ("Ningrum", 12, 2004);
        
        Meta.showProfile();
        Triana.showProfile();
        Ningrum.showProfile();
        
        System.out.println("Meta name (before) : " + Meta.getName());
        Meta.setName("Haechan");
        System.out.println("Meta name (after) : " + Meta.getName());
}
}