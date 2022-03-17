package com.cc.java;

public class Cat extends Pet{
    private String name;


    public String getName() {
        return name;
}

    public Cat(String name) {
        this.name = name;
}

    public String petSounds(){
        return name + " says: Meow!";
    }

    @Override
    public String toString() {
        return "My name is " + this.name;
    }


}
