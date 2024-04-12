package org.example;

public class Main {
    public static void main(String[] args) {
        String[] COMMANDS = {"SIDET", "Lejat"};
        Shelter shelter = new Shelter("Peace","Lenina");
        Dog dog = new Dog("Rex","Ovcharka", COMMANDS,Color.BROWN,shelter);
        System.out.println(dog.getInfo());
        dog.makevoice();
        dog.makevoice(" Gav Gav ");
        Shelter shelter2 = new Shelter ("World","Pudovkina");
        Dog dog2 = new Dog("Sharik","Pitbull",Color.WHITE,shelter2);
        System.out.println(dog2.getInfo());
        dog.makevoice();
        dog.makevoice(" Gav Gav ");
    }
}