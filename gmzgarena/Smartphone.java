/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gmzgarena;

/**
 *
 */
public class Smartphone extends Product{
    private String protect;
    private int protectPrice;

    public Smartphone(String id, String name, Integer memory, String protect, int protectPrice) {
        super(id, name, memory);
        this.protect = protect;
        this.protectPrice = protectPrice;
    }

    public int getProtectPrice() {
        return protectPrice;
    }

    public void setProtectPrice(int protectPrice) {
        this.protectPrice = protectPrice;
    }

    public String getProtect() {
        return protect;
    }

    public void setProtect(String protect) {
        this.protect = protect;
    }
    
}
