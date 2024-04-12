package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Dog extends Pet{
    private String name;
    private String breed;
    private  String[] COMMANDS;

    public Dog(String name, String breed, String[] COMMANDS,Color color,Shelter shelter) {
        this.name = name;
        this.breed = breed;
        this.COMMANDS = COMMANDS;
        super.setColor(color);
        super.setShelter(shelter);
    }

    public Dog(String name, String breed, Color color,Shelter shelter) {
        this.name = name;
        this.breed = breed;
        super.setColor(color);
        super.setShelter(shelter);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setCOMMANDS(String[] COMMANDS) {
        this.COMMANDS = COMMANDS;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String[] getCOMMANDS() {
        return COMMANDS;
    }
    public void makevoice(){
        System.out.println("Dog makes voice");
    }
    public void  makevoice(String voice){
        System.out.println("Dog makes voice" + voice);
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nName: " + name +
                "\nBreed: " + breed +
                "\nCommands: " + Arrays.toString(COMMANDS);
    }
}
