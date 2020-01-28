/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.app.Interface;

/**
 * Another way to achieve abstraction in Java, is with interfaces.
 *
 * An interface is a completely "abstract class" that is used to group related
 * methods with empty bodies:
 *
 * @author Himal Raee
 */
public interface Interface {

    public abstract void firstmethod();

    public abstract void secmethod();

    public abstract void thirdmethod();

    public abstract void lastmethod();
    

    class secondclass implements Interface {

        @Override
        public void firstmethod() {
            System.out.println("this is my fstmethod");
        }

        @Override
        public void secmethod() {
            System.out.println("this is my secmethod");
        }

        @Override
        public void thirdmethod() {
            System.out.println("this is my thirdmethod");
        }

        @Override
        public void lastmethod() {
            System.out.println("this is my lastmethod");
        }

    }

    public static void main(String[] args) {
        secondclass myclass = new secondclass();
        myclass.firstmethod();
        myclass.secmethod();
        myclass.thirdmethod();
        myclass.lastmethod();
    }
}

/*
To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements keyword (instead of extends). 
The body of the interface method is provided by the "implement" class:
 */




/*
============
Output
============
this is my fstmethod
this is my secmethod
this is my thirdmethod
this is my lastmethod

*/
