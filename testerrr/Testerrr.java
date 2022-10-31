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
public class Testerrr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A vB = new B(1, "Beb!");
        C vC = new C(2, "Cep!");
        
        vB.printU();
        vC.printU();
        vB.printMe("I Need You!");
        vC.printMe("I Heart You!");
        vC.printMe("9876");
        vC.printMe(9876);
        vB.sayIt();
        vC.sayIt();
    }
    
}
