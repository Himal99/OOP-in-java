/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.app.Abstraction;

/**
 * Data abstraction is the process of hiding certain details and showing only
 * essential information to the user #Abstract class: is a restricted class that
 * cannot be used to create objects #Abstract method: can only be used in an
 * abstract class, and it does not have a body. The body is provided by the
 * subclass (inherited from). (to access it, it must be inherited from another
 * class).
 *
 * @author Himal Raee
 */
// Abstract class
abstract class MyabstractClass {
    // Abstract method (does not have a body)

    public abstract void Firstclass();
    // Regular method

    public void SecClass() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class Pig extends MyabstractClass {

    @Override
    public void Firstclass() {
        System.out.println("This is my fst class");
    }

}

class MyMainClass {

    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.Firstclass();
        myPig.SecClass();
    }
}


/*
===============
Outputs
===============
This is my fst class
zzzz
*/
