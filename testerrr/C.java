/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testerrr;

/**
 *
 * @author antonsumartono
 */
class C extends B {
    C(int id, String n){
        super(id,n);
    }
    void printMe(String s){
        System.out.println("hoi.. "+s);
    }
    void printMe(int s){
        System.out.println("your lucky number is : "+s);
    }
}
