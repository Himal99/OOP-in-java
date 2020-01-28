/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.app.Incapsulation;

/**
 *The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. 
 * To achieve this, you must:

1.declare class variables/attributes as private
2.provide public get and set methods to access and update the value of a private variable
 * @author Himal Raee
 */
public class Incapsulation {
    
    private String name;
    private String password;
    private String email;

    public Incapsulation() {
        // Default constructor... we will learn more about this later.
    }
    
  /*private variables can only be accessed within the same class (an outside class has no access to it).
   However, it is possible to access them if we provide public get and set methods. */
    
//    GET and SET
// Syntax for both is that they start with either get or set, followed by the name of the variable, with the first letter in upper case:
//  The get method returns the variable value, and the set method sets the value.

    public String getName() {
        return name;
//        so this get methos helps to get the name of the user
    }

    public void setName(String name) {
        this.name = name;
//        and this set method helps to set the name of use in name propertie.
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public static void main(String[] args) {
//        lets make one oject of incapsulation to get and set the values;
Incapsulation incap=new Incapsulation();
//to set the values
incap.setName("himal");
incap.setPassword("himal98898");
incap.setEmail("bantawaheem35@gmail.com");

//to get the value
System.out.println("My name is: "+incap.getName());
        System.out.println("My password is: "+incap.getPassword());
        System.out.println("And my Email is: "+incap.getEmail());
    }
//    ===================
//    Final output
//    ===================
/*
My name is: himal
My password is: himal98898
And my Email is: bantawaheem35@gmail.com
    */
    
}
