/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.app.Polymerphism;

/**
 *Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods from another class. 
* Polymorphism uses those methods to perform different tasks. 
* This allows us to perform a single action in different ways.
 * @author Himal raee
 */
class Poplymerphism {
  public void address() {
    System.out.println("My am from nepal");
  }
}

class secClass extends Poplymerphism {
  public void address() {
    System.out.println("I am from bhojpur");
  }
}

class thirdclass extends Poplymerphism {
  public void address() {
    System.out.println("i also liev here in ktm");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    Poplymerphism myPoplymerphism = new Poplymerphism();  // Create a Poplymerphism object
    Poplymerphism secClass = new secClass();  // Create a secclass object
    Poplymerphism thirdClass = new thirdclass();  // Create a thirdclass object
    myPoplymerphism.address();
    secClass.address();
    thirdClass.address();
    
  }
}

/*
=========
Ouputs
=========
i am from nepal
i am from bhojpur
i also live here in ktm
*/


