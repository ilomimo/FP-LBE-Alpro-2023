/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gmzgarena;

/**
 *
 */
public abstract class Product {
    private String id;
    private String name;
    private Integer memory;

    public Product(String id, String name, Integer memory) {
        this.id = id;
        this.name = name;
        this.memory = memory;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }
}
