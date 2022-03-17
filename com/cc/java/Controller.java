package com.cc.java;

public class Controller {
  
//place Holder
  private static Controller instance;
  private Controller(){

  }
  public static Controller getInstance(){
    if(instance == null) {
           instance = new Controller(); // this.instance negali buti, nes this su objektu susijes, o nes cia jo dar neturim
    }
      return instance;
  }




}
