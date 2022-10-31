/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gmzgarena;

/**
 *
 */
public class Laptop extends Product{
    private String graphic;
    private int graphicPrice;

    public Laptop( String id, String name, Integer memory, String graphic, int graphicPrice) {
        super(id, name, memory);
        this.graphic = graphic;
        this.graphicPrice = graphicPrice;
    }

    public int getGraphicPrice() {
        return graphicPrice;
    }

    public void setGraphicPrice(int graphicPrice) {
        this.graphicPrice = graphicPrice;
    }

    public String getGraphic() {
        return graphic;
    }

    public void setGraphic(String graphic) {
        this.graphic = graphic;
    }
    
}
