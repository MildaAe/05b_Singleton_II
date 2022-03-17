package com.cc.java;

public class Dog extends Pet{
    
    private String name;
    private Controller controller; 

    public Dog(String name) {
        this.name = name;
        this.controller = Controller.getInstance();//asoziation - abipue pazintis
}
        public  String askACat(){
                return controller.getRandomCat().getName(this, this.name);
    
            }
       


    public String petSounds(){
        return name + " says: Bark!";
    }

    @Override
    public String toString() {
        return "My name is " + this.name;
    }


}
