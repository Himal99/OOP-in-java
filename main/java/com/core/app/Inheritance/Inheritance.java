/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.app.Inheritance;

/**
 *In Java, it is possible to inherit attributes and methods from one class to another.
 * We group the "inheritance concept" into two categories:

subclass (child) - the class that inherits from another class
superclass (parent) - the class being inherited from
To inherit from a class, use the extends keyword.
 * @author user
 */
class Inheritance {
  protected String Name = "Himal";
  public void Skills() {
    System.out.println("c,c++,java,js,jquery,nodejs,mysql,springboot,spring,hibernate etc");
  }
}

class secClass extends Inheritance {
  private String Address = "Bhojpur";
  public static void main(String[] args) {
    secClass myclass = new secClass();
    myclass.Skills();
    System.out.println("Myname is: " + myclass.Name+"i am from :"+myclass.Address+" Nepal");
  }
}

/*
==========
Ouputs
==========
c,c++,java,js,jquery,nodejs,mysql,springboot,spring,hibernate etc
My name is: Himal i am from: bhojpur Nepal
*/
