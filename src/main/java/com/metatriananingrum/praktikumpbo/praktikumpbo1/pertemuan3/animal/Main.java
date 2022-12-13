package com.metatriananingrum.praktikumpbo.praktikumpbo1.pertemuan3.animal;

 public class Main {
    public static void main(String[] args) {

        //Membuat object dari class Animal
        Animal cat = new Animal("meta",20,"White");
        Animal dog = new Animal("Lala",22,"Pink");
        Animal rabbit = new Animal("Bila",19,"Green");
        Animal dragon = new Animal("Naya",19,"Red");


        //Memanggil Method
        cat.showProfile();
        dog.showProfile();
        rabbit.showProfile();
        dragon.showProfile();

        System.out.println("Dog's name (before) : " + dog.getName());
        dog.setName("Beautiful");
        System.out.println("Dog's name (before) : " + dog.getName());
 }
 }