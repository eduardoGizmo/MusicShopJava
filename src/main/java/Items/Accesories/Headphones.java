package Items.Accesories;
import Items.Behaviours.ISell;


public class Headphones extends Accessory implements ISell {


    public Headphones(Double priceBuy, Double priceSell, String category) {
        super(priceBuy, priceSell, category);
    }

    public Double calculateMarkup() {
        return this.getPriceSell() - this.getPriceBuy();
    }



}
