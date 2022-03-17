package com.cc.java;

public class Cat extends Pet{
    private String name;
    private Controller controller;


    public String getName(Pet pet, String caller) {
        if(pet instanceof Cat){
            return "Of course " + caller + ", I am " + name + ".";
        } else {
        return "Sorry " + caller + ", you are a dog"; 
        }   
        
}

    public Cat(String name) {
        this.name = name;
        this.controller = Controller.getInstance();
}

    public  String askACat(){
        return controller.getRandomCat().getName(this, this.name);

    }

    public String petSounds(){
        return name + " says: Meow!";
    }

    @Override
    public String toString() {
        return "My name is " + this.name;
    }


}
