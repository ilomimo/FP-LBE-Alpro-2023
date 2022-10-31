/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 */
public abstract class A {
    int id;
    String name;
    
    A(int id, String n){
        this.id=id;
        name=n;
    }
    void printMe(String s){
        System.out.println("hi !"+s);
    }
    void printU(){
        System.out.println("hi !"+ name);
    }
    abstract void sayIt();
}
