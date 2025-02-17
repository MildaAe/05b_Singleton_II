package com.cc.java;
import java.util.ArrayList;
import java.util.Random;


public class Controller {
  
//place Holder
  private static Controller instance;

  private Controller(){
    this.catsL = new ArrayList<>();
    this.dogsL = new ArrayList<>();
    this. random = new Random(); 
  }

  public Cat getRandomCat(){
    return catsL.get(random.nextInt(catsL.size()));
  }
  public Dog getRandomDog(){
    return dogsL.get(random.nextInt(dogsL.size()));
  }

  public ArrayList<Cat> getCatsL() {
    return catsL;
  }

  public static Controller getInstance(){
    if(instance == null) {
           instance = new Controller(); // this.instance negali buti, nes this su objektu susijes, o nes cia jo dar neturim
    }
      return instance;
  }
//funktionalität
  private ArrayList<Cat> catsL;
  private ArrayList <Dog> dogsL;
  private Random random;


  public void addNewCat(String name){
      catsL.add(new Cat(name));
  }

  public void addNewDog(String name){
      dogsL.add(new Dog(name));
  }
}
