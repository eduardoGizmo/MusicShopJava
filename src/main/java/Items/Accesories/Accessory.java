package Items.Accesories;
import Items.Item;

public abstract class Accessory extends Item {

    private String category;

    public Accessory(Double priceBuy, Double priceSell, String category) {
        super(priceBuy, priceSell);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
