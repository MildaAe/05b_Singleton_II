package com.cc.java;

import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
		
    Controller controller = Controller.getInstance();


output("Liste" + controller.getCatsL());

/*Controller c1 = Controller.getInstance(); 
output("c1: " + c1);
Controller c2 = Controller.getInstance(); 
output("c2: " + c2);*/

		// Namenslisten --> Arrays
		String [] catNames = {"Grizabella","Alonzo","RumTumTugger","Suzanne"};
		String [] dogNames = {"Fifi","Boo","Cassie","Bonzo"};

    //Cat cat1 = new Cat(catNames[0]); 
    //output(cat1.petSounds());

    
  //  output("Test" + catsL);

    for (int i=0; i<catNames.length; i++){
        controller.addNewCat(catNames[i]);
        
    }
    for (int i = 0; i< dogNames.length; i++){
        controller.addNewDog(dogNames[i]); 
        }

    //output("Test: " + controller.getCatsL());
    
    output(controller.getRandomDog().askACat());
    output(controller.getRandomCat().askACat());

   /*output("Test" + catsL);
   output(catsL.get(0).petSounds());*/

   //Dog dog1 = new Dog (dogNames[0]);
   //output(dog1.petSounds());

    
//            output(dogsL.get(0).petSounds());
            

}

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }
}
