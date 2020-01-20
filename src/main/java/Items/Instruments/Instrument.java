package Items.Instruments;
import Items.Item;


public abstract class Instrument extends Item {

    private String material;
    private String colour;
    private String type;


    public Instrument(Double priceBuy, Double priceSell, String material, String colour, String type) {
        super(priceBuy, priceSell);
        this.material = material;
        this.colour = colour;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setType(String type) {
        this.type = type;
    }
}
