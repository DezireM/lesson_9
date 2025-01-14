package org.example;

import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private Color color;
    private Shelter shelter;

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public int getAge() {
        return age;
    }

    public Shelter getShelter() {
        return shelter;
    }
    private int generateDefaultAge(){
        Random random = new Random();
        return random.nextInt(12)+1;
    }
    public String getInfo(){
        return "Age: " + age +
                "\nColor: " + color +
                "\nShelter name:" + shelter.getName() +
                "\nShelter address: " + shelter.getAddress();

    }
}
