/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*Java is an object-oriented programmig
Everything in java associated with classes and objects. Classes also known as templates in java. 
Every data structure in algoriths must code inside the templates called class.
-----------------------------------------------------------------------------
Instructre:- Himal Raee.
 */
package com.core.app.ClassAndObject;

/**
 *
 * @author Himal
 */
// so here we create our class name as Animals
public class Animals {

//    so the class the Animals may have theirs own objects like
    public void run() {
        System.out.println("Animals can run");

    }

    public void eat() {
        System.out.println("Animals eats foods,meat,grass");

    }

//     run() and eat() are the objects of animals
//     Now animals may also have theirs own properties like
    public int height;
    public String color;

//     to set the value of this properties we can create a contruster of animals
    public Animals() {
//        default constructer
    }

    public Animals(int height, String color) {
        this.height = height;
        this.color = color;
//        use define constructer
    }

//    we define its getter and setter methods to set and get values
    public int getHeight() {
        return height;
//        to get value
    }

    public void setHeight(int height) {
        this.height = height;
//        to set values
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//   now here we create our main class to intiantiate the class animals
    public static void main(String[] args) {
        Animals myanimals = new Animals(); //we make the object of animasl as a myanimals;

        myanimals.color = "red";
        myanimals.height = 12;

//        here we set the value of properties color and height
        System.out.println(myanimals.color);
        System.out.println(myanimals.height);
        myanimals.eat();
        myanimals.run();

        /*
------------------------------        
outputs
------------------------------
red
12
Animals eats foods,meat,grass
Animals can run 
         */
    }
}
